package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Sparkline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSparklineFn extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Sparkline
}
object TypeofSparklineFn {
  
  inline def apply(Locale: Any, fn: Sparkline): TypeofSparklineFn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSparklineFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSparklineFn] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Sparkline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
