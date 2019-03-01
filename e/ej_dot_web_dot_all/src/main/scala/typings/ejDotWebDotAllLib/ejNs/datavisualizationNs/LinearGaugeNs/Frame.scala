package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specifies the frame background image URL of linear gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the frame InnerWidth
    * @Default {8}
    */
  var innerWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the frame OuterWidth
    * @Default {12}
    */
  var outerWidth: js.UndefOr[scala.Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    backgroundImageUrl: java.lang.String = null,
    innerWidth: scala.Int | scala.Double = null,
    outerWidth: scala.Int | scala.Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl)
    if (innerWidth != null) __obj.updateDynamic("innerWidth")(innerWidth.asInstanceOf[js.Any])
    if (outerWidth != null) __obj.updateDynamic("outerWidth")(outerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

