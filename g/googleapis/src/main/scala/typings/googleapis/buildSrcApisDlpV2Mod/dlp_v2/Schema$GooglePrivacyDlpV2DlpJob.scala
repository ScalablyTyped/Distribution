package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Combines all of the information about a DLP job.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DlpJob extends js.Object {
  /**
    * Time when the job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Time when the job finished.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * A stream of errors encountered running the job.
    */
  var errors: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Error]] = js.native
  /**
    * Results from inspecting a data source.
    */
  var inspectDetails: js.UndefOr[Schema$GooglePrivacyDlpV2InspectDataSourceDetails] = js.native
  /**
    * If created by a job trigger, the resource name of the trigger that
    * instantiated the job.
    */
  var jobTriggerName: js.UndefOr[String] = js.native
  /**
    * The server-assigned name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Results from analyzing risk of a data source.
    */
  var riskDetails: js.UndefOr[Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] = js.native
  /**
    * Time when the job started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * State of a job.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The type of job.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2DlpJob {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    errors: js.Array[Schema$GooglePrivacyDlpV2Error] = null,
    inspectDetails: Schema$GooglePrivacyDlpV2InspectDataSourceDetails = null,
    jobTriggerName: String = null,
    name: String = null,
    riskDetails: Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = null,
    startTime: String = null,
    state: String = null,
    `type`: String = null
  ): Schema$GooglePrivacyDlpV2DlpJob = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (inspectDetails != null) __obj.updateDynamic("inspectDetails")(inspectDetails.asInstanceOf[js.Any])
    if (jobTriggerName != null) __obj.updateDynamic("jobTriggerName")(jobTriggerName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (riskDetails != null) __obj.updateDynamic("riskDetails")(riskDetails.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DlpJob]
  }
}

