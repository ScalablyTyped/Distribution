package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWeightIn extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var weightIn: js.UndefOr[Double] = js.undefined
  var weightOut: js.UndefOr[Double] = js.undefined
}

object AnonWeightIn {
  @scala.inline
  def apply(label: String = null, weightIn: Int | Double = null, weightOut: Int | Double = null): AnonWeightIn = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (weightIn != null) __obj.updateDynamic("weightIn")(weightIn.asInstanceOf[js.Any])
    if (weightOut != null) __obj.updateDynamic("weightOut")(weightOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWeightIn]
  }
}

