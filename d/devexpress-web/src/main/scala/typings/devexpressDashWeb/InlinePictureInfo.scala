package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains in-line picture settings.
  */
trait InlinePictureInfo extends js.Object {
  /**
    * Gets the actual image height.
    * Value: An integer value specifying the image height.
    */
  var actualHeight: Double
  /**
    * Gets the actual image width.
    * Value: An integer value specifying the image width.
    */
  var actualWidth: Double
  /**
    * Gets the image identifier.
    * Value: An integer value specifying the image identifier.
    */
  var id: Double
  /**
    * Gets the initial image height.
    * Value: An integer value specifying the image height.
    */
  var initialHeight: Double
  /**
    * Gets the initial image width.
    * Value: An integer value specifying the image width.
    */
  var initialWidth: Double
  /**
    * Gets the image position.
    * Value: An integer value specifying the image position.
    */
  var position: Double
  /**
    * Gets the X-scaling factor of the inline image.
    * Value: An integer value specifying the scaling factor for the X-axis.
    */
  var scaleX: Double
  /**
    * Gets the Y-scaling factor of the inline image.
    * Value: An integer value specifying the scaling factor for the Y-axis.
    */
  var scaleY: Double
}

object InlinePictureInfo {
  @scala.inline
  def apply(
    actualHeight: Double,
    actualWidth: Double,
    id: Double,
    initialHeight: Double,
    initialWidth: Double,
    position: Double,
    scaleX: Double,
    scaleY: Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight, actualWidth = actualWidth, id = id, initialHeight = initialHeight, initialWidth = initialWidth, position = position, scaleX = scaleX, scaleY = scaleY)
  
    __obj.asInstanceOf[InlinePictureInfo]
  }
}

