package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  /**
    * The rotation angle of the crop window around its center, in radians.
    * Rotation angle is applied after the offset.
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset specifies the bottom edge of the crop rectangle that is located
    * above the original bounding rectangle bottom edge, relative to the object's
    * original height.
    */
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset specifies the left edge of the crop rectangle that is located to
    * the right of the original bounding rectangle left edge, relative to the
    * object's original width.
    */
  var leftOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset specifies the right edge of the crop rectangle that is located
    * to the left of the original bounding rectangle right edge, relative to the
    * object's original width.
    */
  var rightOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset specifies the top edge of the crop rectangle that is located
    * below the original bounding rectangle top edge, relative to the object's
    * original height.
    */
  var topOffset: js.UndefOr[scala.Double] = js.undefined
}

