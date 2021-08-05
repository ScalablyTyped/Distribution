package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains page margin settings.
  */
trait FloatingObjectAbsolutePositionSettings extends StObject {
  
  /**
    * Gets or sets a floating object's horizontal position relative to an element specified by the FloatingObjectAbsolutePositionSettings.horizontalPositionType property.
    */
  var horizontalAbsolutePosition: Double
  
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType
  
  /**
    * Gets or sets a floating object's vertical position relative to an element specified by the FloatingObjectAbsolutePositionSettings.verticalPositionType property.
    */
  var verticalAbsolutePosition: Double
  
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType
}
object FloatingObjectAbsolutePositionSettings {
  
  inline def apply(
    horizontalAbsolutePosition: Double,
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    verticalAbsolutePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType
  ): FloatingObjectAbsolutePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalAbsolutePosition = horizontalAbsolutePosition.asInstanceOf[js.Any], horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], verticalAbsolutePosition = verticalAbsolutePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsolutePositionSettings]
  }
  
  extension [Self <: FloatingObjectAbsolutePositionSettings](x: Self) {
    
    inline def setHorizontalAbsolutePosition(value: Double): Self = StObject.set(x, "horizontalAbsolutePosition", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = StObject.set(x, "horizontalPositionType", value.asInstanceOf[js.Any])
    
    inline def setVerticalAbsolutePosition(value: Double): Self = StObject.set(x, "verticalAbsolutePosition", value.asInstanceOf[js.Any])
    
    inline def setVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = StObject.set(x, "verticalPositionType", value.asInstanceOf[js.Any])
  }
}
