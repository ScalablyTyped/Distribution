package typings.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  /** The ID of an image file in Drive to use for the background image. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The width of the cropped image in the closed range of 0 to 1. This value represents the width of the cropped image divided by the width of the entire
    * image. The height is computed by applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280 pixels wide and 144
    * pixels high.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The X coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the horizontal distance from the left side of the entire image to the left side of the cropping area divided by the width of the entire
    * image.
    */
  var xCoordinate: js.UndefOr[Double] = js.undefined
  /**
    * The Y coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the vertical distance from the top side of the entire image to the top side of the cropping area divided by the height of the entire image.
    */
  var yCoordinate: js.UndefOr[Double] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(
    id: String = null,
    width: Int | Double = null,
    xCoordinate: Int | Double = null,
    yCoordinate: Int | Double = null
  ): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate.asInstanceOf[js.Any])
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

