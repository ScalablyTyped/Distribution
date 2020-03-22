package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorEnd extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AnonColorEnd {
  @scala.inline
  def apply(
    color: String = null,
    end: Int | Double = null,
    index: Int | Double = null,
    size: Int | Double = null,
    start: Int | Double = null
  ): AnonColorEnd = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorEnd]
  }
}

