package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains absolute size settings for floating objects.
  */
trait FloatingObjectAbsoluteSizeSettings extends js.Object {
  /**
    * Gets or sets a floating object's absolute height.
    * Value: An integer value specifying the height in twips.
    */
  var absoluteHeight: Double
  /**
    * Gets or sets a floating object's absolute width.
    * Value: An integer value specifying the width in twips.
    */
  var absoluteWidth: Double
}

object FloatingObjectAbsoluteSizeSettings {
  @scala.inline
  def apply(absoluteHeight: Double, absoluteWidth: Double): FloatingObjectAbsoluteSizeSettings = {
    val __obj = js.Dynamic.literal(absoluteHeight = absoluteHeight, absoluteWidth = absoluteWidth)
  
    __obj.asInstanceOf[FloatingObjectAbsoluteSizeSettings]
  }
}

