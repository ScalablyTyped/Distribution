package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaEventReminder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overrides extends StObject {
  
  var overrides: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  
  var useDefault: js.UndefOr[Boolean] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[SchemaEventReminder]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: SchemaEventReminder*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
