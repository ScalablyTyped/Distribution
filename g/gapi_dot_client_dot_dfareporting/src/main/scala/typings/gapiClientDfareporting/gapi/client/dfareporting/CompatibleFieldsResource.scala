package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsResource extends js.Object {
  /**
    * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input
    * report and user permissions.
    */
  def query(request: Key): Request[CompatibleFields]
}

object CompatibleFieldsResource {
  @scala.inline
  def apply(query: Key => Request[CompatibleFields]): CompatibleFieldsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[CompatibleFieldsResource]
  }
}

