package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaEventReminder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overrides extends StObject {
  
  var overrides: js.UndefOr[js.Array[SchemaEventReminder]] = js.undefined
  
  var useDefault: js.UndefOr[Boolean] = js.undefined
}
object Overrides {
  
  inline def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  extension [Self <: Overrides](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaEventReminder]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaEventReminder*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
