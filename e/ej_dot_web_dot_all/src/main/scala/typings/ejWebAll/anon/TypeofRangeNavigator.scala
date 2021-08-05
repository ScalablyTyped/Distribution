package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.RangeNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRangeNavigator extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: RangeNavigator
}
object TypeofRangeNavigator {
  
  inline def apply(Locale: js.Any, fn: RangeNavigator): TypeofRangeNavigator = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRangeNavigator]
  }
  
  extension [Self <: TypeofRangeNavigator](x: Self) {
    
    inline def setFn(value: RangeNavigator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
