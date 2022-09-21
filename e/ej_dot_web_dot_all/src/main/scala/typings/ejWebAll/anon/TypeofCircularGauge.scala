package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.CircularGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCircularGauge extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: CircularGauge
}
object TypeofCircularGauge {
  
  inline def apply(Locale: Any, fn: CircularGauge): TypeofCircularGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCircularGauge]
  }
  
  extension [Self <: TypeofCircularGauge](x: Self) {
    
    inline def setFn(value: CircularGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
