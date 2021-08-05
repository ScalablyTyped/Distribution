package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client rectangle object.
  */
trait ASPxClientRect extends StObject {
  
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  def GetBottom(): Double
  
  /**
    * Gets the rectangle's height.
    */
  def GetHeight(): Double
  
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  def GetLeft(): Double
  
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  def GetRight(): Double
  
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  def GetTop(): Double
  
  /**
    * Gets the rectangle's width.
    */
  def GetWidth(): Double
}
object ASPxClientRect {
  
  inline def apply(
    GetBottom: () => Double,
    GetHeight: () => Double,
    GetLeft: () => Double,
    GetRight: () => Double,
    GetTop: () => Double,
    GetWidth: () => Double
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal(GetBottom = js.Any.fromFunction0(GetBottom), GetHeight = js.Any.fromFunction0(GetHeight), GetLeft = js.Any.fromFunction0(GetLeft), GetRight = js.Any.fromFunction0(GetRight), GetTop = js.Any.fromFunction0(GetTop), GetWidth = js.Any.fromFunction0(GetWidth))
    __obj.asInstanceOf[ASPxClientRect]
  }
  
  extension [Self <: ASPxClientRect](x: Self) {
    
    inline def setGetBottom(value: () => Double): Self = StObject.set(x, "GetBottom", js.Any.fromFunction0(value))
    
    inline def setGetHeight(value: () => Double): Self = StObject.set(x, "GetHeight", js.Any.fromFunction0(value))
    
    inline def setGetLeft(value: () => Double): Self = StObject.set(x, "GetLeft", js.Any.fromFunction0(value))
    
    inline def setGetRight(value: () => Double): Self = StObject.set(x, "GetRight", js.Any.fromFunction0(value))
    
    inline def setGetTop(value: () => Double): Self = StObject.set(x, "GetTop", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "GetWidth", js.Any.fromFunction0(value))
  }
}
