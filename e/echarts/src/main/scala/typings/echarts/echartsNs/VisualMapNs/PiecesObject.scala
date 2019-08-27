package typings.echarts.echartsNs.VisualMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiecesObject extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PiecesObject {
  @scala.inline
  def apply(
    color: String = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    value: Int | Double = null
  ): PiecesObject = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiecesObject]
  }
}

