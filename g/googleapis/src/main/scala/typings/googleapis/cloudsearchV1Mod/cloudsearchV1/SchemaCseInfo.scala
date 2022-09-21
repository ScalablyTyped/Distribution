package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCseInfo extends StObject {
  
  /**
    * CSE domain name claimed by the meeting owner's company. This field is expected to be used for display purposes only, i.e., "Extra encryption added by $cse_domain". It can differ from the `cse_domain` as defined elsewhere on the User, in the case of cross-domain meetings.
    */
  var cseDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The wrapped CSE key used by this conference.
    */
  var wrappedKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaCseInfo {
  
  inline def apply(): SchemaCseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCseInfo]
  }
  
  extension [Self <: SchemaCseInfo](x: Self) {
    
    inline def setCseDomain(value: String): Self = StObject.set(x, "cseDomain", value.asInstanceOf[js.Any])
    
    inline def setCseDomainNull: Self = StObject.set(x, "cseDomain", null)
    
    inline def setCseDomainUndefined: Self = StObject.set(x, "cseDomain", js.undefined)
    
    inline def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedKeyNull: Self = StObject.set(x, "wrappedKey", null)
    
    inline def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
