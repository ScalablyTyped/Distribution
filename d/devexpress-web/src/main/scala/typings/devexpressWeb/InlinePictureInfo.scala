package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains in-line picture settings.
  */
trait InlinePictureInfo extends js.Object {
  /**
    * Gets the actual image height.
    */
  val actualHeight: Double
  val actualHeigth: Double
  /**
    * Gets the actual image width.
    */
  val actualWidth: Double
  /**
    * Gets the image identifier.
    */
  val id: Double
  /**
    * Gets the initial image height.
    */
  val initialHeight: Double
  /**
    * Gets the initial image width.
    */
  val initialWidth: Double
  /**
    * Gets the image position.
    */
  val position: Double
  /**
    * Gets the X-scaling factor of the inline image.
    */
  val scaleX: Double
  /**
    * Gets the Y-scaling factor of the inline image.
    */
  val scaleY: Double
}

object InlinePictureInfo {
  @scala.inline
  def apply(
    actualHeight: Double,
    actualHeigth: Double,
    actualWidth: Double,
    id: Double,
    initialHeight: Double,
    initialWidth: Double,
    position: Double,
    scaleX: Double,
    scaleY: Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight.asInstanceOf[js.Any], actualHeigth = actualHeigth.asInstanceOf[js.Any], actualWidth = actualWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialHeight = initialHeight.asInstanceOf[js.Any], initialWidth = initialWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureInfo]
  }
}

