package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsSegmentSettings extends js.Object {
  /** Set the color for the text segments.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Set the gradient for the text segments.
    * @Default {null}
    */
  var gradient: js.UndefOr[js.Any] = js.undefined
  /** Set the length for the text segments.
    * @Default {2}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Set the opacity for the text segments.
    * @Default {0}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Set the spacing for the text segments.
    * @Default {1}
    */
  var spacing: js.UndefOr[scala.Double] = js.undefined
  /** Set the width for the text segments.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ItemsSegmentSettings {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    gradient: js.Any = null,
    length: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    spacing: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ItemsSegmentSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSegmentSettings]
  }
}

