package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key used to identify a report.
  */
@js.native
trait Schema$ReportKey extends js.Object {
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.native
  /**
    * Report ID.
    */
  var reportId: js.UndefOr[String] = js.native
}

object Schema$ReportKey {
  @scala.inline
  def apply(queryId: String = null, reportId: String = null): Schema$ReportKey = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId.asInstanceOf[js.Any])
    if (reportId != null) __obj.updateDynamic("reportId")(reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportKey]
  }
}

