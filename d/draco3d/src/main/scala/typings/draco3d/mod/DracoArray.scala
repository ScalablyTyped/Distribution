package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DracoArray extends StObject {
  
  def GetValue(index: Double): Double
}
object DracoArray {
  
  inline def apply(GetValue: Double => Double): DracoArray = {
    val __obj = js.Dynamic.literal(GetValue = js.Any.fromFunction1(GetValue))
    __obj.asInstanceOf[DracoArray]
  }
  
  extension [Self <: DracoArray](x: Self) {
    
    inline def setGetValue(value: Double => Double): Self = StObject.set(x, "GetValue", js.Any.fromFunction1(value))
  }
}
