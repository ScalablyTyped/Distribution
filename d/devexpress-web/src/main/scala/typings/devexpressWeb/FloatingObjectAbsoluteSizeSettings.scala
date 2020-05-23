package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains absolute size settings for floating objects.
  */
trait FloatingObjectAbsoluteSizeSettings extends js.Object {
  /**
    * Gets or sets a floating object's absolute height.
    */
  var absoluteHeight: Double
  /**
    * Gets or sets a floating object's absolute width.
    */
  var absoluteWidth: Double
}

object FloatingObjectAbsoluteSizeSettings {
  @scala.inline
  def apply(absoluteHeight: Double, absoluteWidth: Double): FloatingObjectAbsoluteSizeSettings = {
    val __obj = js.Dynamic.literal(absoluteHeight = absoluteHeight.asInstanceOf[js.Any], absoluteWidth = absoluteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsoluteSizeSettings]
  }
}

