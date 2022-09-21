package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGatewaySipAccess extends StObject {
  
  /**
    * Permanent numeric code for manual entry on specially configured devices, currently the same as the PSTN "Universal pin".
    */
  var sipAccessCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SIP URI the conference can be reached through. The string is on one of the formats: "sip:@" "sips:@" where currently is the 13-digit universal pin (with the future option to support using a Meet meeting code as well), and is a valid address to be resolved using a DNS SRV lookup, or a dotted quad.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGatewaySipAccess {
  
  inline def apply(): SchemaGatewaySipAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewaySipAccess]
  }
  
  extension [Self <: SchemaGatewaySipAccess](x: Self) {
    
    inline def setSipAccessCode(value: String): Self = StObject.set(x, "sipAccessCode", value.asInstanceOf[js.Any])
    
    inline def setSipAccessCodeNull: Self = StObject.set(x, "sipAccessCode", null)
    
    inline def setSipAccessCodeUndefined: Self = StObject.set(x, "sipAccessCode", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
