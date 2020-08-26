package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesSkusList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time. Optional. If not specified
    * USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Requested page size. Defaults to 5000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus` call. If
    * unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the service. Example: "services/DA34-426B-A397"
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var startTime: js.UndefOr[String] = js.native
}

object ParamsResourceServicesSkusList {
  @scala.inline
  def apply(): ParamsResourceServicesSkusList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesSkusList]
  }
  @scala.inline
  implicit class ParamsResourceServicesSkusListOps[Self <: ParamsResourceServicesSkusList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

