package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object AnonSource {
  @scala.inline
  def apply(source: String = null, target: String = null, weight: Int | Double = null): AnonSource = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

