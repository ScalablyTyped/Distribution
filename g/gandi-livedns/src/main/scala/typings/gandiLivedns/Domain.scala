package typings.gandiLivedns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var fqdn: String
  
  var zone_uuid: String
}
object Domain {
  
  inline def apply(fqdn: String, zone_uuid: String): Domain = {
    val __obj = js.Dynamic.literal(fqdn = fqdn.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setZone_uuid(value: String): Self = StObject.set(x, "zone_uuid", value.asInstanceOf[js.Any])
  }
}
