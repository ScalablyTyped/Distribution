package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative size settings for floating objects.
  */
trait TextBoxRelativeSizeSettings extends js.Object {
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  var relativeHeight: Double
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  var relativeHeightType: FloatingObjectRelativeHeightType
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  var relativeWidth: Double
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  var relativeWidthType: FloatingObjectRelativeWidthType
}

object TextBoxRelativeSizeSettings {
  @scala.inline
  def apply(
    relativeHeight: Double,
    relativeHeightType: FloatingObjectRelativeHeightType,
    relativeWidth: Double,
    relativeWidthType: FloatingObjectRelativeWidthType
  ): TextBoxRelativeSizeSettings = {
    val __obj = js.Dynamic.literal(relativeHeight = relativeHeight.asInstanceOf[js.Any], relativeHeightType = relativeHeightType.asInstanceOf[js.Any], relativeWidth = relativeWidth.asInstanceOf[js.Any], relativeWidthType = relativeWidthType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxRelativeSizeSettings]
  }
}

