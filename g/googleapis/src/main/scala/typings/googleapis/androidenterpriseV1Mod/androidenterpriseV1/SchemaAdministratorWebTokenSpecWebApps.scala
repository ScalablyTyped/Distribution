package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministratorWebTokenSpecWebApps extends StObject {
  
  /**
    * Whether the Web Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaAdministratorWebTokenSpecWebApps {
  
  inline def apply(): SchemaAdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecWebApps]
  }
  
  extension [Self <: SchemaAdministratorWebTokenSpecWebApps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
