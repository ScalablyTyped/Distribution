package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interprets a result so that humans and machines can act on it.
  */
@js.native
trait Schema$Outcome extends js.Object {
  /**
    * More information about a FAILURE outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not FAILURE.  Optional
    */
  var failureDetail: js.UndefOr[Schema$FailureDetail] = js.native
  /**
    * More information about an INCONCLUSIVE outcome.  Returns INVALID_ARGUMENT
    * if this field is set but the summary is not INCONCLUSIVE.  Optional
    */
  var inconclusiveDetail: js.UndefOr[Schema$InconclusiveDetail] = js.native
  /**
    * More information about a SKIPPED outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SKIPPED.  Optional
    */
  var skippedDetail: js.UndefOr[Schema$SkippedDetail] = js.native
  /**
    * More information about a SUCCESS outcome.  Returns INVALID_ARGUMENT if
    * this field is set but the summary is not SUCCESS.  Optional
    */
  var successDetail: js.UndefOr[Schema$SuccessDetail] = js.native
  /**
    * The simplest way to interpret a result.  Required
    */
  var summary: js.UndefOr[String] = js.native
}

object Schema$Outcome {
  @scala.inline
  def apply(
    failureDetail: Schema$FailureDetail = null,
    inconclusiveDetail: Schema$InconclusiveDetail = null,
    skippedDetail: Schema$SkippedDetail = null,
    successDetail: Schema$SuccessDetail = null,
    summary: String = null
  ): Schema$Outcome = {
    val __obj = js.Dynamic.literal()
    if (failureDetail != null) __obj.updateDynamic("failureDetail")(failureDetail.asInstanceOf[js.Any])
    if (inconclusiveDetail != null) __obj.updateDynamic("inconclusiveDetail")(inconclusiveDetail.asInstanceOf[js.Any])
    if (skippedDetail != null) __obj.updateDynamic("skippedDetail")(skippedDetail.asInstanceOf[js.Any])
    if (successDetail != null) __obj.updateDynamic("successDetail")(successDetail.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Outcome]
  }
}

