package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChart extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Chart
}
object TypeofChart {
  
  inline def apply(Locale: Any, fn: Chart): TypeofChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChart]
  }
  
  extension [Self <: TypeofChart](x: Self) {
    
    inline def setFn(value: Chart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
