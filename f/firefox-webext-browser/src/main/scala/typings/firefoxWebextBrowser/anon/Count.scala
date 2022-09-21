package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var rangeData: js.UndefOr[js.Array[EndOffset]] = js.undefined
  
  var rectData: js.UndefOr[js.Array[RectsAndTexts]] = js.undefined
}
object Count {
  
  inline def apply(count: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setRangeData(value: js.Array[EndOffset]): Self = StObject.set(x, "rangeData", value.asInstanceOf[js.Any])
    
    inline def setRangeDataUndefined: Self = StObject.set(x, "rangeData", js.undefined)
    
    inline def setRangeDataVarargs(value: EndOffset*): Self = StObject.set(x, "rangeData", js.Array(value*))
    
    inline def setRectData(value: js.Array[RectsAndTexts]): Self = StObject.set(x, "rectData", value.asInstanceOf[js.Any])
    
    inline def setRectDataUndefined: Self = StObject.set(x, "rectData", js.undefined)
    
    inline def setRectDataVarargs(value: RectsAndTexts*): Self = StObject.set(x, "rectData", js.Array(value*))
  }
}
