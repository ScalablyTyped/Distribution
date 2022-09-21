package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotGauge extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotGauge
}
object TypeofPivotGauge {
  
  inline def apply(Locale: Any, fn: PivotGauge): TypeofPivotGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGauge]
  }
  
  extension [Self <: TypeofPivotGauge](x: Self) {
    
    inline def setFn(value: PivotGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
