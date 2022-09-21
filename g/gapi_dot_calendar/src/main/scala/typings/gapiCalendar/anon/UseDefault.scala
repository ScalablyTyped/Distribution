package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseDefault extends StObject {
  
  var overrides: js.UndefOr[js.Array[Method]] = js.undefined
  
  var useDefault: Boolean
}
object UseDefault {
  
  inline def apply(useDefault: Boolean): UseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDefault]
  }
  
  extension [Self <: UseDefault](x: Self) {
    
    inline def setOverrides(value: js.Array[Method]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: Method*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
  }
}
