package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main response class which holds the reports from the Reporting API
  * `batchGet` call.
  */
@js.native
trait Schema$GetReportsResponse extends js.Object {
  /**
    * The amount of resource quota tokens deducted to execute the query.
    * Includes all responses.
    */
  var queryCost: js.UndefOr[Double] = js.native
  /**
    * Responses corresponding to each of the request.
    */
  var reports: js.UndefOr[js.Array[Schema$Report]] = js.native
  /**
    * The amount of resource quota remaining for the property.
    */
  var resourceQuotasRemaining: js.UndefOr[Schema$ResourceQuotasRemaining] = js.native
}

object Schema$GetReportsResponse {
  @scala.inline
  def apply(
    queryCost: Int | Double = null,
    reports: js.Array[Schema$Report] = null,
    resourceQuotasRemaining: Schema$ResourceQuotasRemaining = null
  ): Schema$GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (queryCost != null) __obj.updateDynamic("queryCost")(queryCost.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (resourceQuotasRemaining != null) __obj.updateDynamic("resourceQuotasRemaining")(resourceQuotasRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetReportsResponse]
  }
}

