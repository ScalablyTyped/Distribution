package typings.ejWebAll.anon

import typings.ejWebAll.ej.SunburstChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSunburstChart extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: SunburstChart
}
object TypeofSunburstChart {
  
  inline def apply(Locale: Any, fn: SunburstChart): TypeofSunburstChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSunburstChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSunburstChart] (val x: Self) extends AnyVal {
    
    inline def setFn(value: SunburstChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
