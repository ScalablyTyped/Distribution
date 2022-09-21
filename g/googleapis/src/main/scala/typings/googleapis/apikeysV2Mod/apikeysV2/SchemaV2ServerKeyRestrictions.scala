package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2ServerKeyRestrictions extends StObject {
  
  /**
    * A list of the caller IP addresses that are allowed to make API calls with this key.
    */
  var allowedIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaV2ServerKeyRestrictions {
  
  inline def apply(): SchemaV2ServerKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2ServerKeyRestrictions]
  }
  
  extension [Self <: SchemaV2ServerKeyRestrictions](x: Self) {
    
    inline def setAllowedIps(value: js.Array[String]): Self = StObject.set(x, "allowedIps", value.asInstanceOf[js.Any])
    
    inline def setAllowedIpsNull: Self = StObject.set(x, "allowedIps", null)
    
    inline def setAllowedIpsUndefined: Self = StObject.set(x, "allowedIps", js.undefined)
    
    inline def setAllowedIpsVarargs(value: String*): Self = StObject.set(x, "allowedIps", js.Array(value*))
  }
}
