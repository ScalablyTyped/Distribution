package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.RangeNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRangeNavigator extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: RangeNavigator
}
object TypeofRangeNavigator {
  
  inline def apply(Locale: Any, fn: RangeNavigator): TypeofRangeNavigator = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRangeNavigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRangeNavigator] (val x: Self) extends AnyVal {
    
    inline def setFn(value: RangeNavigator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
