package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative size settings for floating objects.
  */
@JSGlobal("TextBoxRelativeSizeSettings")
@js.native
class TextBoxRelativeSizeSettings () extends js.Object {
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  var relativeHeight: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  var relativeHeightType: FloatingObjectRelativeHeightType = js.native
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  var relativeWidth: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  var relativeWidthType: FloatingObjectRelativeWidthType = js.native
}

