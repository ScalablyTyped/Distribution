package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GenerateConfigReport method.
  */
@js.native
trait Schema$GenerateConfigReportResponse extends js.Object {
  /**
    * list of ChangeReport, each corresponding to comparison between two
    * service configurations.
    */
  var changeReports: js.UndefOr[js.Array[Schema$ChangeReport]] = js.native
  /**
    * Errors / Linter warnings associated with the service definition this
    * report belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[Schema$Diagnostic]] = js.native
  /**
    * ID of the service configuration this report belongs to.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the service this report belongs to.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object Schema$GenerateConfigReportResponse {
  @scala.inline
  def apply(
    changeReports: js.Array[Schema$ChangeReport] = null,
    diagnostics: js.Array[Schema$Diagnostic] = null,
    id: String = null,
    serviceName: String = null
  ): Schema$GenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    if (changeReports != null) __obj.updateDynamic("changeReports")(changeReports.asInstanceOf[js.Any])
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateConfigReportResponse]
  }
}

