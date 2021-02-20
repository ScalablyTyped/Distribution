package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDefault extends StObject {
  
  var overrides: js.UndefOr[js.Array[Method]] = js.native
  
  var useDefault: Boolean = js.native
}
object UseDefault {
  
  @scala.inline
  def apply(useDefault: Boolean): UseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDefault]
  }
  
  @scala.inline
  implicit class UseDefaultMutableBuilder[Self <: UseDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[Method]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: Method*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
  }
}
