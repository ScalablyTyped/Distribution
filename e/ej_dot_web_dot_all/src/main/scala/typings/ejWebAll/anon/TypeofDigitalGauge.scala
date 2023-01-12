package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.DigitalGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDigitalGauge extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DigitalGauge
}
object TypeofDigitalGauge {
  
  inline def apply(Locale: Any, fn: DigitalGauge): TypeofDigitalGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDigitalGauge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDigitalGauge] (val x: Self) extends AnyVal {
    
    inline def setFn(value: DigitalGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
