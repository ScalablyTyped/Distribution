package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.GetReleaseExecutable
  */
@js.native
trait Schema$GetReleaseExecutableResponse extends js.Object {
  /**
    * Executable view of the `Ruleset` referenced by the `Release`.
    */
  var executable: js.UndefOr[String] = js.native
  /**
    * The Rules runtime version of the executable.
    */
  var executableVersion: js.UndefOr[String] = js.native
  /**
    * `Language` used to generate the executable bytes.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * `Ruleset` name associated with the `Release` executable.
    */
  var rulesetName: js.UndefOr[String] = js.native
  /**
    * Optional, indicates the freshness of the result. The response is
    * guaranteed to be the latest within an interval up to the sync_time
    * (inclusive).
    */
  var syncTime: js.UndefOr[String] = js.native
  /**
    * Timestamp for the most recent `Release.update_time`.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$GetReleaseExecutableResponse {
  @scala.inline
  def apply(
    executable: String = null,
    executableVersion: String = null,
    language: String = null,
    rulesetName: String = null,
    syncTime: String = null,
    updateTime: String = null
  ): Schema$GetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    if (executable != null) __obj.updateDynamic("executable")(executable.asInstanceOf[js.Any])
    if (executableVersion != null) __obj.updateDynamic("executableVersion")(executableVersion.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (rulesetName != null) __obj.updateDynamic("rulesetName")(rulesetName.asInstanceOf[js.Any])
    if (syncTime != null) __obj.updateDynamic("syncTime")(syncTime.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetReleaseExecutableResponse]
  }
}

