package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaaData extends StObject {
  
  var flags: js.UndefOr[Double] = js.undefined
  
  var issuerCritical: js.UndefOr[Boolean] = js.undefined
  
  var tag: String
  
  var value: String
}
object CaaData {
  
  inline def apply(tag: String, value: String): CaaData = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaaData]
  }
  
  extension [Self <: CaaData](x: Self) {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setIssuerCritical(value: Boolean): Self = StObject.set(x, "issuerCritical", value.asInstanceOf[js.Any])
    
    inline def setIssuerCriticalUndefined: Self = StObject.set(x, "issuerCritical", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
