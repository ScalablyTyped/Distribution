package typings.gapiClientPrediction.anon

import typings.gapiClientPrediction.gapi.client.prediction.Insert2
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfusionMatrix extends js.Object {
  /**
    * An output confusion matrix. This shows an estimate for how this model will do in predictions. This is first indexed by the true class label. For each
    * true class label, this provides a pair {predicted_label, count}, where count is the estimated number of times the model will predict the predicted
    * label given the true label. Will not output if more then 100 classes (Categorical models only).
    */
  var confusionMatrix: js.UndefOr[Record[String, Record[String, String]]] = js.native
  /** A list of the confusion matrix row totals. */
  var confusionMatrixRowTotals: js.UndefOr[Record[String, String]] = js.native
  /** Basic information about the model. */
  var modelinfo: js.UndefOr[Insert2] = js.native
}

object ConfusionMatrix {
  @scala.inline
  def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  @scala.inline
  implicit class ConfusionMatrixOps[Self <: ConfusionMatrix] (val x: Self) extends AnyVal {
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
    def setConfusionMatrix(value: Record[String, Record[String, String]]): Self = this.set("confusionMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfusionMatrix: Self = this.set("confusionMatrix", js.undefined)
    @scala.inline
    def setConfusionMatrixRowTotals(value: Record[String, String]): Self = this.set("confusionMatrixRowTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfusionMatrixRowTotals: Self = this.set("confusionMatrixRowTotals", js.undefined)
    @scala.inline
    def setModelinfo(value: Insert2): Self = this.set("modelinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelinfo: Self = this.set("modelinfo", js.undefined)
  }
  
}

