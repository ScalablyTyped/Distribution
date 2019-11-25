package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  /** The X coordinate scaling element. */
  var scaleX: js.UndefOr[Double] = js.undefined
  /** The Y coordinate scaling element. */
  var scaleY: js.UndefOr[Double] = js.undefined
  /** The X coordinate shearing element. */
  var shearX: js.UndefOr[Double] = js.undefined
  /** The Y coordinate shearing element. */
  var shearY: js.UndefOr[Double] = js.undefined
  /** The X coordinate translation element. */
  var translateX: js.UndefOr[Double] = js.undefined
  /** The Y coordinate translation element. */
  var translateY: js.UndefOr[Double] = js.undefined
  /** The units for translate elements. */
  var unit: js.UndefOr[String] = js.undefined
}

object AffineTransform {
  @scala.inline
  def apply(
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    shearX: Int | Double = null,
    shearY: Int | Double = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    unit: String = null
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (shearX != null) __obj.updateDynamic("shearX")(shearX.asInstanceOf[js.Any])
    if (shearY != null) __obj.updateDynamic("shearY")(shearY.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffineTransform]
  }
}

