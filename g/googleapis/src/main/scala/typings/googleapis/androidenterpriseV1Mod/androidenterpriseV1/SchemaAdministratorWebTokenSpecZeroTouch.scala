package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministratorWebTokenSpecZeroTouch extends StObject {
  
  /**
    * Whether zero-touch embedded UI is usable with this token. If enabled, the admin can link zero-touch customers to this enterprise.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAdministratorWebTokenSpecZeroTouch {
  
  inline def apply(): SchemaAdministratorWebTokenSpecZeroTouch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecZeroTouch]
  }
  
  extension [Self <: SchemaAdministratorWebTokenSpecZeroTouch](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
