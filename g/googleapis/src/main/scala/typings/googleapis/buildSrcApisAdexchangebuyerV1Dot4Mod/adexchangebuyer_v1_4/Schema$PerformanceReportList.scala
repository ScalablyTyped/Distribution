package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait Schema$PerformanceReportList extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A list of performance reports relevant for the account.
    */
  var performanceReport: js.UndefOr[js.Array[Schema$PerformanceReport]] = js.native
}

object Schema$PerformanceReportList {
  @scala.inline
  def apply(kind: String = null, performanceReport: js.Array[Schema$PerformanceReport] = null): Schema$PerformanceReportList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (performanceReport != null) __obj.updateDynamic("performanceReport")(performanceReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerformanceReportList]
  }
}

