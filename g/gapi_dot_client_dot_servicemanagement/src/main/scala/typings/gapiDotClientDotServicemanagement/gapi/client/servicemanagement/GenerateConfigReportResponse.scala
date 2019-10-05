package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfigReportResponse extends js.Object {
  /**
    * list of ChangeReport, each corresponding to comparison between two
    * service configurations.
    */
  var changeReports: js.UndefOr[js.Array[ChangeReport]] = js.undefined
  /**
    * Errors / Linter warnings associated with the service definition this
    * report
    * belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  /** ID of the service configuration this report belongs to. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of the service this report belongs to. */
  var serviceName: js.UndefOr[String] = js.undefined
}

object GenerateConfigReportResponse {
  @scala.inline
  def apply(
    changeReports: js.Array[ChangeReport] = null,
    diagnostics: js.Array[Diagnostic] = null,
    id: String = null,
    serviceName: String = null
  ): GenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    if (changeReports != null) __obj.updateDynamic("changeReports")(changeReports)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (id != null) __obj.updateDynamic("id")(id)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[GenerateConfigReportResponse]
  }
}

