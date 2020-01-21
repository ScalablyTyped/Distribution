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
  def apply(itemCount: String = null, predictedLabel: String = null): SchemaEntry = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (predictedLabel != null) __obj.updateDynamic("predictedLabel")(predictedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntry]
  }
}

