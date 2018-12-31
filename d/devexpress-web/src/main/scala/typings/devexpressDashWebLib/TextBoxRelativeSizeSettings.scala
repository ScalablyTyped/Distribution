package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative size settings for floating objects.
  */
trait TextBoxRelativeSizeSettings extends js.Object {
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the relativeHeightType property.
    * Value: An integer value specifying the relative height, as a percentage.
    */
  var relativeHeight: scala.Double
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    * Value: One of the <see cref="FloatingObjectRelativeHeightType" /> enumeration values.
    */
  var relativeHeightType: js.Any
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the relativeWidthType property.
    * Value: An integer value specifying the relative width, as a percentage.
    */
  var relativeWidth: scala.Double
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    * Value: One of the <see cref="FloatingObjectRelativeWidthType" /> enumeration values.
    */
  var relativeWidthType: js.Any
}

