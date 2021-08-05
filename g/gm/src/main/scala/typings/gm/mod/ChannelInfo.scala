package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelInfo[T] extends StObject {
  
  var Blue: T
  
  var Green: T
  
  var Red: T
}
object ChannelInfo {
  
  inline def apply[T](Blue: T, Green: T, Red: T): ChannelInfo[T] = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo[T]]
  }
  
  extension [Self <: ChannelInfo[?], T](x: Self & ChannelInfo[T]) {
    
    inline def setBlue(value: T): Self = StObject.set(x, "Blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: T): Self = StObject.set(x, "Green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: T): Self = StObject.set(x, "Red", value.asInstanceOf[js.Any])
  }
}
