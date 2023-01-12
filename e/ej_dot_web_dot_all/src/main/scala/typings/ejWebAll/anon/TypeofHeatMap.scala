package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.HeatMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHeatMap extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: HeatMap
}
object TypeofHeatMap {
  
  inline def apply(Locale: Any, fn: HeatMap): TypeofHeatMap = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHeatMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofHeatMap] (val x: Self) extends AnyVal {
    
    inline def setFn(value: HeatMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
