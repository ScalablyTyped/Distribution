package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains alignment position settings for floating objects.
  */
trait FloatingObjectAlignmentPositionSettings extends StObject {
  
  /**
    * Gets or sets a value specifying how a floating object is horizontally aligned relative to an element specified by the FloatingObjectAlignmentPositionSettings.horizontalPositionAlignment property.
    */
  var horizontalPositionAlignment: FloatingObjectHorizontalPositionAlignment
  
  /**
    * Gets or sets a value specifying to what element the horizontal alignment of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType
  
  /**
    * Gets or sets a value specifying how a floating object is vertically aligned relative to an element specified by the FloatingObjectAlignmentPositionSettings.verticalPositionAlignment property.
    */
  var verticalPositionAlignment: FloatingObjectVerticalPositionAlignment
  
  /**
    * Gets or sets a value specifying to what element the vertical alignment of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType
}
object FloatingObjectAlignmentPositionSettings {
  
  @scala.inline
  def apply(
    horizontalPositionAlignment: FloatingObjectHorizontalPositionAlignment,
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    verticalPositionAlignment: FloatingObjectVerticalPositionAlignment,
    verticalPositionType: FloatingObjectVerticalPositionType
  ): FloatingObjectAlignmentPositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionAlignment = horizontalPositionAlignment.asInstanceOf[js.Any], horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], verticalPositionAlignment = verticalPositionAlignment.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAlignmentPositionSettings]
  }
  
  @scala.inline
  implicit class FloatingObjectAlignmentPositionSettingsMutableBuilder[Self <: FloatingObjectAlignmentPositionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalPositionAlignment(value: FloatingObjectHorizontalPositionAlignment): Self = StObject.set(x, "horizontalPositionAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = StObject.set(x, "horizontalPositionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPositionAlignment(value: FloatingObjectVerticalPositionAlignment): Self = StObject.set(x, "verticalPositionAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = StObject.set(x, "verticalPositionType", value.asInstanceOf[js.Any])
  }
}
