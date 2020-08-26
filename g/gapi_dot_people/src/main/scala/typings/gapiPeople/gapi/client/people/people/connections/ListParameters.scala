package typings.gapiPeople.gapi.client.people.people.connections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListParameters extends js.Object {
  var pageSize: js.UndefOr[Double] = js.native
  // Query parameters
  var pageToken: js.UndefOr[String] = js.native
  var personFields: String = js.native
  var resourceName: String = js.native
  var sortOrder: js.UndefOr[SortOrder] = js.native
  var syncToken: js.UndefOr[String] = js.native
}

object ListParameters {
  @scala.inline
  def apply(personFields: String, resourceName: String): ListParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParameters]
  }
  @scala.inline
  implicit class ListParametersOps[Self <: ListParameters] (val x: Self) extends AnyVal {
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
    def setPersonFields(value: String): Self = this.set("personFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
  }
  
}

