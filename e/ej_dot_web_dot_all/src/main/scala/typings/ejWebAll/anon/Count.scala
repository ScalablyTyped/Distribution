package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var result: Any
}
object Count {
  
  inline def apply(count: Double, result: Any): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
