package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains relative size settings for floating objects.
  */
trait TextBoxRelativeSizeSettings extends StObject {
  
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
  
  @scala.inline
  implicit class TextBoxRelativeSizeSettingsMutableBuilder[Self <: TextBoxRelativeSizeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeHeight(value: Double): Self = StObject.set(x, "relativeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHeightType(value: FloatingObjectRelativeHeightType): Self = StObject.set(x, "relativeHeightType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidth(value: Double): Self = StObject.set(x, "relativeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidthType(value: FloatingObjectRelativeWidthType): Self = StObject.set(x, "relativeWidthType", value.asInstanceOf[js.Any])
  }
}
