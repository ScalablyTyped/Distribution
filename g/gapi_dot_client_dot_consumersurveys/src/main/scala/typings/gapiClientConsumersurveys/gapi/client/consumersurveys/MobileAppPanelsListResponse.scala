package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppPanelsListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.native
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[String] = js.native
  /** An individual predefined panel of Opinion Rewards mobile users. */
  var resources: js.UndefOr[js.Array[MobileAppPanel]] = js.native
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}

object MobileAppPanelsListResponse {
  @scala.inline
  def apply(): MobileAppPanelsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppPanelsListResponse]
  }
  @scala.inline
  implicit class MobileAppPanelsListResponseOps[Self <: MobileAppPanelsListResponse] (val x: Self) extends AnyVal {
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
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: MobileAppPanel*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[MobileAppPanel]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
  
}

