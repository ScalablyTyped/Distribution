package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsResource extends js.Object {
  /**
    * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input
    * report and user permissions.
    */
  def query(request: Anon_AltFieldsKey): Request[CompatibleFields]
}

object CompatibleFieldsResource {
  @scala.inline
  def apply(query: Anon_AltFieldsKey => Request[CompatibleFields]): CompatibleFieldsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[CompatibleFieldsResource]
  }
}

