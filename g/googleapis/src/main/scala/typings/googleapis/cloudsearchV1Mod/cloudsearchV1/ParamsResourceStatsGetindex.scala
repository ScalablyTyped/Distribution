package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceStatsGetindex extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("fromDate.day")
  var fromDateDotday: js.UndefOr[Double] = js.native
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("fromDate.month")
  var fromDateDotmonth: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("fromDate.year")
  var fromDateDotyear: js.UndefOr[Double] = js.native
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("toDate.day")
  var toDateDotday: js.UndefOr[Double] = js.native
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("toDate.month")
  var toDateDotmonth: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("toDate.year")
  var toDateDotyear: js.UndefOr[Double] = js.native
}

object ParamsResourceStatsGetindex {
  @scala.inline
  def apply(): ParamsResourceStatsGetindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatsGetindex]
  }
  @scala.inline
  implicit class ParamsResourceStatsGetindexOps[Self <: ParamsResourceStatsGetindex] (val x: Self) extends AnyVal {
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
    def setFromDateDotday(value: Double): Self = this.set("fromDate.day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDateDotday: Self = this.set("fromDate.day", js.undefined)
    @scala.inline
    def setFromDateDotmonth(value: Double): Self = this.set("fromDate.month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDateDotmonth: Self = this.set("fromDate.month", js.undefined)
    @scala.inline
    def setFromDateDotyear(value: Double): Self = this.set("fromDate.year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDateDotyear: Self = this.set("fromDate.year", js.undefined)
    @scala.inline
    def setToDateDotday(value: Double): Self = this.set("toDate.day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDateDotday: Self = this.set("toDate.day", js.undefined)
    @scala.inline
    def setToDateDotmonth(value: Double): Self = this.set("toDate.month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDateDotmonth: Self = this.set("toDate.month", js.undefined)
    @scala.inline
    def setToDateDotyear(value: Double): Self = this.set("toDate.year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDateDotyear: Self = this.set("toDate.year", js.undefined)
  }
  
}

