package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTooltip extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Tooltip
}
object TypeofTooltip {
  
  inline def apply(Locale: Any, fn: Tooltip): TypeofTooltip = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTooltip]
  }
  
  extension [Self <: TypeofTooltip](x: Self) {
    
    inline def setFn(value: Tooltip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
