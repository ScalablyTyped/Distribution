package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePurchasesVoidedpurchasesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The time, in milliseconds since the Epoch, of the newest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be greater than the current time and is ignored if a
    * pagination token is set. Default value is current time. Note: This filter
    * is applied on the time at which the record is seen as voided by our
    * systems and not the actual voided time returned in the response.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The package name of the application for which voided purchases need to be
    * returned (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    *
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The time, in milliseconds since the Epoch, of the oldest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be older than 30 days and is ignored if a pagination
    * token is set. Default value is current time minus 30 days. Note: This
    * filter is applied on the time at which the record is seen as voided by
    * our systems and not the actual voided time returned in the response.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    *
    */
  var token: js.UndefOr[String] = js.native
}

object ParamsResourcePurchasesVoidedpurchasesList {
  @scala.inline
  def apply(): ParamsResourcePurchasesVoidedpurchasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesVoidedpurchasesList]
  }
  @scala.inline
  implicit class ParamsResourcePurchasesVoidedpurchasesListOps[Self <: ParamsResourcePurchasesVoidedpurchasesList] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

