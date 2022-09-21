package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2BrowserKeyRestrictions extends StObject {
  
  /**
    * A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
    */
  var allowedReferrers: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaV2BrowserKeyRestrictions {
  
  inline def apply(): SchemaV2BrowserKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2BrowserKeyRestrictions]
  }
  
  extension [Self <: SchemaV2BrowserKeyRestrictions](x: Self) {
    
    inline def setAllowedReferrers(value: js.Array[String]): Self = StObject.set(x, "allowedReferrers", value.asInstanceOf[js.Any])
    
    inline def setAllowedReferrersNull: Self = StObject.set(x, "allowedReferrers", null)
    
    inline def setAllowedReferrersUndefined: Self = StObject.set(x, "allowedReferrers", js.undefined)
    
    inline def setAllowedReferrersVarargs(value: String*): Self = StObject.set(x, "allowedReferrers", js.Array(value*))
  }
}
