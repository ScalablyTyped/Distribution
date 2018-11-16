package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_XCoordinate extends js.Object {
  /** The ID of an image file in Drive to use for the background image. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The width of the cropped image in the closed range of 0 to 1. This value represents the width of the cropped image divided by the width of the entire
                   * image. The height is computed by applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280 pixels wide and 144
                   * pixels high.
                   */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The X coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
                   * represents the horizontal distance from the left side of the entire image to the left side of the cropping area divided by the width of the entire
                   * image.
                   */
  var xCoordinate: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The Y coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
                   * represents the vertical distance from the top side of the entire image to the top side of the cropping area divided by the height of the entire image.
                   */
  var yCoordinate: js.UndefOr[scala.Double] = js.undefined
}

