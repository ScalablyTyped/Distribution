package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2AndroidKeyRestrictions extends StObject {
  
  /**
    * A list of Android applications that are allowed to make API calls with this key.
    */
  var allowedApplications: js.UndefOr[js.Array[SchemaV2AndroidApplication]] = js.undefined
}
object SchemaV2AndroidKeyRestrictions {
  
  inline def apply(): SchemaV2AndroidKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2AndroidKeyRestrictions]
  }
  
  extension [Self <: SchemaV2AndroidKeyRestrictions](x: Self) {
    
    inline def setAllowedApplications(value: js.Array[SchemaV2AndroidApplication]): Self = StObject.set(x, "allowedApplications", value.asInstanceOf[js.Any])
    
    inline def setAllowedApplicationsUndefined: Self = StObject.set(x, "allowedApplications", js.undefined)
    
    inline def setAllowedApplicationsVarargs(value: SchemaV2AndroidApplication*): Self = StObject.set(x, "allowedApplications", js.Array(value*))
  }
}
