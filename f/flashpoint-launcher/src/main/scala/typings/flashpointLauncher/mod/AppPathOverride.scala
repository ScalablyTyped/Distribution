package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPathOverride extends StObject {
  
  var enabled: Boolean
  
  var `override`: String
  
  var path: String
}
object AppPathOverride {
  
  inline def apply(enabled: Boolean, `override`: String, path: String): AppPathOverride = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPathOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppPathOverride] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: String): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
