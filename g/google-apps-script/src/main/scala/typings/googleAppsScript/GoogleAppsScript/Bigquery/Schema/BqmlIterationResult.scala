package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BqmlIterationResult extends js.Object {
  var durationMs: js.UndefOr[String] = js.native
  var evalLoss: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var learnRate: js.UndefOr[Double] = js.native
  var trainingLoss: js.UndefOr[Double] = js.native
}

object BqmlIterationResult {
  @scala.inline
  def apply(): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlIterationResult]
  }
  @scala.inline
  implicit class BqmlIterationResultOps[Self <: BqmlIterationResult] (val x: Self) extends AnyVal {
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
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    @scala.inline
    def setEvalLoss(value: Double): Self = this.set("evalLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalLoss: Self = this.set("evalLoss", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLearnRate(value: Double): Self = this.set("learnRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLearnRate: Self = this.set("learnRate", js.undefined)
    @scala.inline
    def setTrainingLoss(value: Double): Self = this.set("trainingLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingLoss: Self = this.set("trainingLoss", js.undefined)
  }
  
}

