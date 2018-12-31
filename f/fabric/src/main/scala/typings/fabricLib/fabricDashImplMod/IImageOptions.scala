package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageOptions extends IObjectOptions {
  /**
  	 * AlignX value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
  	 * This parameter defines how the picture is aligned to its viewport when image element width differs from image width.
  	 */
  var alignX: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * AlignY value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
  	 * This parameter defines how the picture is aligned to its viewport when image element height differs from image height.
  	 */
  var alignY: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * crossOrigin value (one of "", "anonymous", "allow-credentials")
  	 */
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Image filter array
  	 */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.undefined
  /**
  	 * meetOrSlice value, part of preserveAspectRatio  (one of "meet", "slice").
  	 * if meet the image is always fully visibile, if slice the viewport is always filled with image.
  	 * @see http://www.w3.org/TR/SVG/coords.html#PreserveAspectRatioAttribute
  	 */
  var meetOrSlice: js.UndefOr[java.lang.String] = js.undefined
}

