package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outcome extends js.Object {
  /**
    * More information about a FAILURE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE.
    *
    * Optional
    */
  var failureDetail: js.UndefOr[FailureDetail] = js.undefined
  /**
    * More information about an INCONCLUSIVE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE.
    *
    * Optional
    */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.undefined
  /**
    * More information about a SKIPPED outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED.
    *
    * Optional
    */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.undefined
  /**
    * More information about a SUCCESS outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS.
    *
    * Optional
    */
  var successDetail: js.UndefOr[SuccessDetail] = js.undefined
  /**
    * The simplest way to interpret a result.
    *
    * Required
    */
  var summary: js.UndefOr[String] = js.undefined
}

object Outcome {
  @scala.inline
  def apply(
    failureDetail: FailureDetail = null,
    inconclusiveDetail: InconclusiveDetail = null,
    skippedDetail: SkippedDetail = null,
    successDetail: SuccessDetail = null,
    summary: String = null
  ): Outcome = {
    val __obj = js.Dynamic.literal()
    if (failureDetail != null) __obj.updateDynamic("failureDetail")(failureDetail)
    if (inconclusiveDetail != null) __obj.updateDynamic("inconclusiveDetail")(inconclusiveDetail)
    if (skippedDetail != null) __obj.updateDynamic("skippedDetail")(skippedDetail)
    if (successDetail != null) __obj.updateDynamic("successDetail")(successDetail)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[Outcome]
  }
}

