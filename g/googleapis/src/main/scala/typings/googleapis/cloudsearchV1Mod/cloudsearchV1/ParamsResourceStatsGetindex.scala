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

