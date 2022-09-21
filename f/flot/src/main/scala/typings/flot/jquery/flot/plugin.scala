package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait plugin extends StObject {
  
  def init(options: plotOptions): Any
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object plugin {
  
  inline def apply(init: plotOptions => Any): plugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[plugin]
  }
  
  extension [Self <: plugin](x: Self) {
    
    inline def setInit(value: plotOptions => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
