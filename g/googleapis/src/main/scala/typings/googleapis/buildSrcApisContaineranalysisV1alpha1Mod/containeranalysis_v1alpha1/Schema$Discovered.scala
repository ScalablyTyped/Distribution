package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the scan status of a discovered resource.
  */
@js.native
trait Schema$Discovered extends js.Object {
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.native
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[Schema$Status] = js.native
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.native
  /**
    * Output only. An operation that indicates the status of the current scan.
    * This field is deprecated, do not use.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
}

object Schema$Discovered {
  @scala.inline
  def apply(
    analysisStatus: String = null,
    analysisStatusError: Schema$Status = null,
    continuousAnalysis: String = null,
    operation: Schema$Operation = null
  ): Schema$Discovered = {
    val __obj = js.Dynamic.literal()
    if (analysisStatus != null) __obj.updateDynamic("analysisStatus")(analysisStatus.asInstanceOf[js.Any])
    if (analysisStatusError != null) __obj.updateDynamic("analysisStatusError")(analysisStatusError.asInstanceOf[js.Any])
    if (continuousAnalysis != null) __obj.updateDynamic("continuousAnalysis")(continuousAnalysis.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Discovered]
  }
}

