package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains text wrapping settings for floating objects.
  */
trait FloatingObjectTextWrappingSettings extends StObject {
  
  /**
    * Gets or sets the bottom offset of text wrapping.
    */
  var bottomDistance: Double
  
  /**
    * Gets or sets a value specifying how text can wrap around a floating object's left and right sides.
    */
  var floatingObjectTextWrapSide: FloatingObjectTextWrapSide
  
  /**
    * Gets or sets a value specifying how text is wrapped around a floating object.
    */
  var floatingObjectTextWrapType: FloatingObjectTextWrapType
  
  /**
    * Gets or sets the left offset of text wrapping.
    */
  var leftDistance: Double
  
  /**
    * Gets or sets the right offset of text wrapping.
    */
  var rightDistance: Double
  
  /**
    * Gets or sets the top offset of text wrapping.
    */
  var topDistance: Double
}
object FloatingObjectTextWrappingSettings {
  
  inline def apply(
    bottomDistance: Double,
    floatingObjectTextWrapSide: FloatingObjectTextWrapSide,
    floatingObjectTextWrapType: FloatingObjectTextWrapType,
    leftDistance: Double,
    rightDistance: Double,
    topDistance: Double
  ): FloatingObjectTextWrappingSettings = {
    val __obj = js.Dynamic.literal(bottomDistance = bottomDistance.asInstanceOf[js.Any], floatingObjectTextWrapSide = floatingObjectTextWrapSide.asInstanceOf[js.Any], floatingObjectTextWrapType = floatingObjectTextWrapType.asInstanceOf[js.Any], leftDistance = leftDistance.asInstanceOf[js.Any], rightDistance = rightDistance.asInstanceOf[js.Any], topDistance = topDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectTextWrappingSettings]
  }
  
  extension [Self <: FloatingObjectTextWrappingSettings](x: Self) {
    
    inline def setBottomDistance(value: Double): Self = StObject.set(x, "bottomDistance", value.asInstanceOf[js.Any])
    
    inline def setFloatingObjectTextWrapSide(value: FloatingObjectTextWrapSide): Self = StObject.set(x, "floatingObjectTextWrapSide", value.asInstanceOf[js.Any])
    
    inline def setFloatingObjectTextWrapType(value: FloatingObjectTextWrapType): Self = StObject.set(x, "floatingObjectTextWrapType", value.asInstanceOf[js.Any])
    
    inline def setLeftDistance(value: Double): Self = StObject.set(x, "leftDistance", value.asInstanceOf[js.Any])
    
    inline def setRightDistance(value: Double): Self = StObject.set(x, "rightDistance", value.asInstanceOf[js.Any])
    
    inline def setTopDistance(value: Double): Self = StObject.set(x, "topDistance", value.asInstanceOf[js.Any])
  }
}
