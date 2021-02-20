package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortRequestOptions extends StObject {
  
  var filters: js.Array[SerialPortFilter] = js.native
}
object SerialPortRequestOptions {
  
  @scala.inline
  def apply(filters: js.Array[SerialPortFilter]): SerialPortRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortRequestOptions]
  }
  
  @scala.inline
  implicit class SerialPortRequestOptionsMutableBuilder[Self <: SerialPortRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[SerialPortFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: SerialPortFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
