package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outcome extends js.Object {
  /**
    * More information about a FAILURE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE.
    *
    * Optional
    */
  var failureDetail: js.UndefOr[FailureDetail] = js.native
  /**
    * More information about an INCONCLUSIVE outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE.
    *
    * Optional
    */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.native
  /**
    * More information about a SKIPPED outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED.
    *
    * Optional
    */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.native
  /**
    * More information about a SUCCESS outcome.
    *
    * Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS.
    *
    * Optional
    */
  var successDetail: js.UndefOr[SuccessDetail] = js.native
  /**
    * The simplest way to interpret a result.
    *
    * Required
    */
  var summary: js.UndefOr[String] = js.native
}

object Outcome {
  @scala.inline
  def apply(): Outcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outcome]
  }
  @scala.inline
  implicit class OutcomeOps[Self <: Outcome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailureDetail(value: FailureDetail): Self = this.set("failureDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDetail: Self = this.set("failureDetail", js.undefined)
    @scala.inline
    def setInconclusiveDetail(value: InconclusiveDetail): Self = this.set("inconclusiveDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInconclusiveDetail: Self = this.set("inconclusiveDetail", js.undefined)
    @scala.inline
    def setSkippedDetail(value: SkippedDetail): Self = this.set("skippedDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippedDetail: Self = this.set("skippedDetail", js.undefined)
    @scala.inline
    def setSuccessDetail(value: SuccessDetail): Self = this.set("successDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessDetail: Self = this.set("successDetail", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

