package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client point object.
  */
trait ASPxClientPoint extends StObject {
  
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): Double
  
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): Double
}
object ASPxClientPoint {
  
  @scala.inline
  def apply(GetX: () => Double, GetY: () => Double): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = js.Any.fromFunction0(GetX), GetY = js.Any.fromFunction0(GetY))
    __obj.asInstanceOf[ASPxClientPoint]
  }
  
  @scala.inline
  implicit class ASPxClientPointMutableBuilder[Self <: ASPxClientPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetX(value: () => Double): Self = StObject.set(x, "GetX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetY(value: () => Double): Self = StObject.set(x, "GetY", js.Any.fromFunction0(value))
  }
}
