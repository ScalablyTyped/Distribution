package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains relative position settings for floating objects.
  */
trait FloatingObjectRelativePositionSettings extends StObject {
  
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType
  
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.horizontalRelativePosition property
    */
  var horizontalRelativePosition: Double
  
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType
  
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.verticalRelativePosition property
    */
  var verticalRelativePosition: Double
}
object FloatingObjectRelativePositionSettings {
  
  @scala.inline
  def apply(
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    horizontalRelativePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType,
    verticalRelativePosition: Double
  ): FloatingObjectRelativePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], horizontalRelativePosition = horizontalRelativePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any], verticalRelativePosition = verticalRelativePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectRelativePositionSettings]
  }
  
  @scala.inline
  implicit class FloatingObjectRelativePositionSettingsMutableBuilder[Self <: FloatingObjectRelativePositionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = StObject.set(x, "horizontalPositionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRelativePosition(value: Double): Self = StObject.set(x, "horizontalRelativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = StObject.set(x, "verticalPositionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRelativePosition(value: Double): Self = StObject.set(x, "verticalRelativePosition", value.asInstanceOf[js.Any])
  }
}
