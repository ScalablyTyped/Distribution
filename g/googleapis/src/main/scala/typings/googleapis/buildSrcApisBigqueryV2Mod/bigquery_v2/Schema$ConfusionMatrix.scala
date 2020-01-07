package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Confusion matrix for multi-class classification models.
  */
@js.native
trait Schema$ConfusionMatrix extends js.Object {
  /**
    * Confidence threshold used when computing the entries of the confusion
    * matrix.
    */
  var confidenceThreshold: js.UndefOr[Double] = js.native
  /**
    * One row per actual label.
    */
  var rows: js.UndefOr[js.Array[Schema$Row]] = js.native
}

object Schema$ConfusionMatrix {
  @scala.inline
  def apply(confidenceThreshold: Int | Double = null, rows: js.Array[Schema$Row] = null): Schema$ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (confidenceThreshold != null) __obj.updateDynamic("confidenceThreshold")(confidenceThreshold.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfusionMatrix]
  }
}

