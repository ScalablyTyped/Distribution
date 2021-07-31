package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains relative size settings for floating objects.
  */
@JSGlobal("TextBoxRelativeSizeSettings")
@js.native
class TextBoxRelativeSizeSettings ()
  extends StObject
     with typings.devexpressWeb.TextBoxRelativeSizeSettings {
  
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  /* CompleteClass */
  var relativeHeight: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  /* CompleteClass */
  var relativeHeightType: typings.devexpressWeb.FloatingObjectRelativeHeightType = js.native
  
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  /* CompleteClass */
  var relativeWidth: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  /* CompleteClass */
  var relativeWidthType: typings.devexpressWeb.FloatingObjectRelativeWidthType = js.native
}
