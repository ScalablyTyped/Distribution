package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2IosKeyRestrictions extends StObject {
  
  /**
    * A list of bundle IDs that are allowed when making API calls with this key.
    */
  var allowedBundleIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaV2IosKeyRestrictions {
  
  inline def apply(): SchemaV2IosKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2IosKeyRestrictions]
  }
  
  extension [Self <: SchemaV2IosKeyRestrictions](x: Self) {
    
    inline def setAllowedBundleIds(value: js.Array[String]): Self = StObject.set(x, "allowedBundleIds", value.asInstanceOf[js.Any])
    
    inline def setAllowedBundleIdsNull: Self = StObject.set(x, "allowedBundleIds", null)
    
    inline def setAllowedBundleIdsUndefined: Self = StObject.set(x, "allowedBundleIds", js.undefined)
    
    inline def setAllowedBundleIdsVarargs(value: String*): Self = StObject.set(x, "allowedBundleIds", js.Array(value*))
  }
}
