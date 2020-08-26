package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single entry in the confusion matrix.
  */
@js.native
trait SchemaEntry extends js.Object {
  /**
    * Number of items being predicted as this label.
    */
  var itemCount: js.UndefOr[String] = js.native
  /**
    * The predicted label. For confidence_threshold &gt; 0, we will also add an
    * entry indicating the number of items under the confidence threshold.
    */
  var predictedLabel: js.UndefOr[String] = js.native
}

object SchemaEntry {
  @scala.inline
  def apply(): SchemaEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntry]
  }
  @scala.inline
  implicit class SchemaEntryOps[Self <: SchemaEntry] (val x: Self) extends AnyVal {
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
    def setItemCount(value: String): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    @scala.inline
    def setPredictedLabel(value: String): Self = this.set("predictedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictedLabel: Self = this.set("predictedLabel", js.undefined)
  }
  
}

