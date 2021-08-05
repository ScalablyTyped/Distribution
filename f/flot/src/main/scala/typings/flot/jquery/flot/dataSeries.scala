package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dataSeries
  extends StObject
     with seriesOptions {
  
  var data: js.Array[js.Any]
}
object dataSeries {
  
  inline def apply(data: js.Array[js.Any]): dataSeries = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataSeries]
  }
  
  extension [Self <: dataSeries](x: Self) {
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
