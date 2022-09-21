package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortRequestOptions extends StObject {
  
  var filters: js.Array[SerialPortFilter]
}
object SerialPortRequestOptions {
  
  inline def apply(filters: js.Array[SerialPortFilter]): SerialPortRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortRequestOptions]
  }
  
  extension [Self <: SerialPortRequestOptions](x: Self) {
    
    inline def setFilters(value: js.Array[SerialPortFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: SerialPortFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
