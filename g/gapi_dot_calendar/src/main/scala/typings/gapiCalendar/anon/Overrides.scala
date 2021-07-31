package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overrides extends StObject {
  
  var overrides: js.Array[Minutes]
  
  var useDefault: Boolean
}
object Overrides {
  
  @scala.inline
  def apply(overrides: js.Array[Minutes], useDefault: Boolean): Overrides = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[Minutes]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesVarargs(value: Minutes*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
  }
}
