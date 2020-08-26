package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrgPoliciesRequest extends js.Object {
  /**
    * Size of the pages to be returned. This is currently unsupported and will
    * be ignored. The server may at any point start using this field to limit
    * page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Page token used to retrieve the next page. This is currently unsupported
    * and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ListOrgPoliciesRequest {
  @scala.inline
  def apply(): ListOrgPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrgPoliciesRequest]
  }
  @scala.inline
  implicit class ListOrgPoliciesRequestOps[Self <: ListOrgPoliciesRequest] (val x: Self) extends AnyVal {
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

