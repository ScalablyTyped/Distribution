package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.LinearGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLinearGauge extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: LinearGauge
}
object TypeofLinearGauge {
  
  inline def apply(Locale: Any, fn: LinearGauge): TypeofLinearGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinearGauge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLinearGauge] (val x: Self) extends AnyVal {
    
    inline def setFn(value: LinearGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
