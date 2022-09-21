package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dataSeries
  extends StObject
     with seriesOptions {
  
  var data: js.Array[Any]
}
object dataSeries {
  
  inline def apply(data: js.Array[Any]): dataSeries = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataSeries]
  }
  
  extension [Self <: dataSeries](x: Self) {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
