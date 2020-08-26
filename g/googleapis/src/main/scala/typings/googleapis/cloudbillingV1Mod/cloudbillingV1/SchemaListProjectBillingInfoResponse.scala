package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `ListProjectBillingInfoResponse`.
  */
@js.native
trait SchemaListProjectBillingInfoResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListProjectBillingInfo` again with the `page_token` field set to
    * this value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of `ProjectBillingInfo` resources representing the projects
    * associated with the billing account.
    */
  var projectBillingInfo: js.UndefOr[js.Array[SchemaProjectBillingInfo]] = js.native
}

object SchemaListProjectBillingInfoResponse {
  @scala.inline
  def apply(): SchemaListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProjectBillingInfoResponse]
  }
  @scala.inline
  implicit class SchemaListProjectBillingInfoResponseOps[Self <: SchemaListProjectBillingInfoResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setProjectBillingInfoVarargs(value: SchemaProjectBillingInfo*): Self = this.set("projectBillingInfo", js.Array(value :_*))
    @scala.inline
    def setProjectBillingInfo(value: js.Array[SchemaProjectBillingInfo]): Self = this.set("projectBillingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectBillingInfo: Self = this.set("projectBillingInfo", js.undefined)
  }
  
}

