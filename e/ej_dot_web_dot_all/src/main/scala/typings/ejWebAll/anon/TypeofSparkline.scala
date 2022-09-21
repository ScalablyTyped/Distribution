package typings.ejWebAll.anon

import typings.ejWebAll.ej.Sparkline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSparkline extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Sparkline
}
object TypeofSparkline {
  
  inline def apply(Locale: Any, fn: Sparkline): TypeofSparkline = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSparkline]
  }
  
  extension [Self <: TypeofSparkline](x: Self) {
    
    inline def setFn(value: Sparkline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
