package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleFieldsResource extends js.Object {
  /**
    * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input
    * report and user permissions.
    */
  def query(request: Key): Request[CompatibleFields] = js.native
}

object CompatibleFieldsResource {
  @scala.inline
  def apply(query: Key => Request[CompatibleFields]): CompatibleFieldsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[CompatibleFieldsResource]
  }
  @scala.inline
  implicit class CompatibleFieldsResourceOps[Self <: CompatibleFieldsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuery(value: Key => Request[CompatibleFields]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}

