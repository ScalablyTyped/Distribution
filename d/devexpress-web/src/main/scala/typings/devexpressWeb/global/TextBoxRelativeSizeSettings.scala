package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative size settings for floating objects.
  */
@JSGlobal("TextBoxRelativeSizeSettings")
@js.native
class TextBoxRelativeSizeSettings ()
  extends typings.devexpressWeb.TextBoxRelativeSizeSettings {
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  /* CompleteClass */
  override var relativeHeight: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  /* CompleteClass */
  override var relativeHeightType: typings.devexpressWeb.FloatingObjectRelativeHeightType = js.native
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  /* CompleteClass */
  override var relativeWidth: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  /* CompleteClass */
  override var relativeWidthType: typings.devexpressWeb.FloatingObjectRelativeWidthType = js.native
}

