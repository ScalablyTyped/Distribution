package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsSegmentSettings extends js.Object {
  /** Set the color for the text segments.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Set the gradient for the text segments.
    * @Default {null}
    */
  var gradient: js.UndefOr[js.Any] = js.undefined
  /** Set the length for the text segments.
    * @Default {2}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Set the opacity for the text segments.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Set the spacing for the text segments.
    * @Default {1}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  /** Set the width for the text segments.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ItemsSegmentSettings {
  @scala.inline
  def apply(
    color: String = null,
    gradient: js.Any = null,
    length: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    spacing: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ItemsSegmentSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSegmentSettings]
  }
}

