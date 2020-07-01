package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Confusion matrix for multi-class classification models.
  */
@js.native
trait SchemaConfusionMatrix extends js.Object {
  /**
    * Confidence threshold used when computing the entries of the confusion
    * matrix.
    */
  var confidenceThreshold: js.UndefOr[Double] = js.native
  /**
    * One row per actual label.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.native
}

object SchemaConfusionMatrix {
  @scala.inline
  def apply(confidenceThreshold: js.UndefOr[Double] = js.undefined, rows: js.Array[SchemaRow] = null): SchemaConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidenceThreshold)) __obj.updateDynamic("confidenceThreshold")(confidenceThreshold.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfusionMatrix]
  }
}

