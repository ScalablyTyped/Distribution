package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMap extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Map
}
object TypeofMap {
  
  inline def apply(Locale: js.Any, fn: Map): TypeofMap = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMap]
  }
  
  extension [Self <: TypeofMap](x: Self) {
    
    inline def setFn(value: Map): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
