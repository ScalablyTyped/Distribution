package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorEnd extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object ColorEnd {
  @scala.inline
  def apply(
    color: String = null,
    end: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): ColorEnd = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEnd]
  }
}

