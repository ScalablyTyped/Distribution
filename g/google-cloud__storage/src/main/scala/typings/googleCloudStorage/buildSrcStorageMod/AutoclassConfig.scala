package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoclassConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AutoclassConfig {
  
  inline def apply(): AutoclassConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoclassConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoclassConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
