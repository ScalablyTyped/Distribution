package typings.devexpressDashWeb

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
  var relativeHeight: Double
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    * Value: One of the <see cref="FloatingObjectRelativeHeightType" /> enumeration values.
    */
  var relativeHeightType: js.Any
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the relativeWidthType property.
    * Value: An integer value specifying the relative width, as a percentage.
    */
  var relativeWidth: Double
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    * Value: One of the <see cref="FloatingObjectRelativeWidthType" /> enumeration values.
    */
  var relativeWidthType: js.Any
}

object TextBoxRelativeSizeSettings {
  @scala.inline
  def apply(
    relativeHeight: Double,
    relativeHeightType: js.Any,
    relativeWidth: Double,
    relativeWidthType: js.Any
  ): TextBoxRelativeSizeSettings = {
    val __obj = js.Dynamic.literal(relativeHeight = relativeHeight, relativeHeightType = relativeHeightType, relativeWidth = relativeWidth, relativeWidthType = relativeWidthType)
  
    __obj.asInstanceOf[TextBoxRelativeSizeSettings]
  }
}

