package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  var total: js.UndefOr[Double] = js.undefined
}
object Total {
  
  inline def apply(): Total = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Total]
  }
  
  extension [Self <: Total](x: Self) {
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
