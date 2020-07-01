package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var labels: js.UndefOr[js.Array[String]] = js.native
  var lossType: js.UndefOr[String] = js.native
  var modelType: js.UndefOr[String] = js.native
}

object Labels {
  @scala.inline
  def apply(labels: js.Array[String] = null, lossType: String = null, modelType: String = null): Labels = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lossType != null) __obj.updateDynamic("lossType")(lossType.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

