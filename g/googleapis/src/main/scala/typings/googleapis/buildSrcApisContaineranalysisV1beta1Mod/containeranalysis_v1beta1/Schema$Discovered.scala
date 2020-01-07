package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the analysis status of a discovered resource.
  */
@js.native
trait Schema$Discovered extends js.Object {
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.native
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage is output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[Schema$Status] = js.native
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.native
  /**
    * The last time continuous analysis was done for this resource. Deprecated,
    * do not use.
    */
  var lastAnalysisTime: js.UndefOr[String] = js.native
}

object Schema$Discovered {
  @scala.inline
  def apply(
    analysisStatus: String = null,
    analysisStatusError: Schema$Status = null,
    continuousAnalysis: String = null,
    lastAnalysisTime: String = null
  ): Schema$Discovered = {
    val __obj = js.Dynamic.literal()
    if (analysisStatus != null) __obj.updateDynamic("analysisStatus")(analysisStatus.asInstanceOf[js.Any])
    if (analysisStatusError != null) __obj.updateDynamic("analysisStatusError")(analysisStatusError.asInstanceOf[js.Any])
    if (continuousAnalysis != null) __obj.updateDynamic("continuousAnalysis")(continuousAnalysis.asInstanceOf[js.Any])
    if (lastAnalysisTime != null) __obj.updateDynamic("lastAnalysisTime")(lastAnalysisTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Discovered]
  }
}

