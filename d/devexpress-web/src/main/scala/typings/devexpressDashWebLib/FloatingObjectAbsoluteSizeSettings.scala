package typings
package devexpressDashWebLib

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
  var absoluteHeight: scala.Double
  /**
    * Gets or sets a floating object's absolute width.
    * Value: An integer value specifying the width in twips.
    */
  var absoluteWidth: scala.Double
}

object FloatingObjectAbsoluteSizeSettings {
  @scala.inline
  def apply(absoluteHeight: scala.Double, absoluteWidth: scala.Double): FloatingObjectAbsoluteSizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absoluteHeight")(absoluteHeight)
    __obj.updateDynamic("absoluteWidth")(absoluteWidth)
    __obj.asInstanceOf[FloatingObjectAbsoluteSizeSettings]
  }
}

