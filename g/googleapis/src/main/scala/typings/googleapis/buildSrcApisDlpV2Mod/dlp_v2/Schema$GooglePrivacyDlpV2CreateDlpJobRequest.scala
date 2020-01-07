package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateDlpJobRequest. Used to initiate long running jobs
  * such as calculating risk metrics or inspecting Google Cloud Storage.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CreateDlpJobRequest extends js.Object {
  var inspectJob: js.UndefOr[Schema$GooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * The job id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var jobId: js.UndefOr[String] = js.native
  var riskJob: js.UndefOr[Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig] = js.native
}

object Schema$GooglePrivacyDlpV2CreateDlpJobRequest {
  @scala.inline
  def apply(
    inspectJob: Schema$GooglePrivacyDlpV2InspectJobConfig = null,
    jobId: String = null,
    riskJob: Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig = null
  ): Schema$GooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectJob != null) __obj.updateDynamic("inspectJob")(inspectJob.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (riskJob != null) __obj.updateDynamic("riskJob")(riskJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CreateDlpJobRequest]
  }
}

