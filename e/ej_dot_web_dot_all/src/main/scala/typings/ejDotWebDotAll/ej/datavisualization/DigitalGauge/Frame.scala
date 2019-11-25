package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specifies the URL of an image to be displayed as background of the Digital gauge.
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  /** Specifies the inner width for the frame, when the background image has been set for the Digital gauge..
    * @Default {6}
    */
  var innerWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the outer width of the frame, when the background image has been set for the Digital gauge.
    * @Default {10}
    */
  var outerWidth: js.UndefOr[Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    backgroundImageUrl: String = null,
    innerWidth: Int | Double = null,
    outerWidth: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (innerWidth != null) __obj.updateDynamic("innerWidth")(innerWidth.asInstanceOf[js.Any])
    if (outerWidth != null) __obj.updateDynamic("outerWidth")(outerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

