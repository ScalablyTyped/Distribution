package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualitativeRange extends js.Object {
  /** Specifies the ending range to which the qualitative ranges will render.
    * @Default {3}
    */
  var rangeEnd: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity for the qualitative ranges.
    * @Default {1}
    */
  var rangeOpacity: js.UndefOr[Double] = js.undefined
  /** Specifies the stroke for the qualitative ranges.
    * @Default {null}
    */
  var rangeStroke: js.UndefOr[String] = js.undefined
}

object QualitativeRange {
  @scala.inline
  def apply(
    rangeEnd: js.UndefOr[Double] = js.undefined,
    rangeOpacity: js.UndefOr[Double] = js.undefined,
    rangeStroke: String = null
  ): QualitativeRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rangeEnd)) __obj.updateDynamic("rangeEnd")(rangeEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeOpacity)) __obj.updateDynamic("rangeOpacity")(rangeOpacity.get.asInstanceOf[js.Any])
    if (rangeStroke != null) __obj.updateDynamic("rangeStroke")(rangeStroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualitativeRange]
  }
}

