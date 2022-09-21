package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compliancestatus extends StObject {
  
  var compliance_status: String
  
  var country: String
  
  var createdAt: String
}
object Compliancestatus {
  
  inline def apply(compliance_status: String, country: String, createdAt: String): Compliancestatus = {
    val __obj = js.Dynamic.literal(compliance_status = compliance_status.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compliancestatus]
  }
  
  extension [Self <: Compliancestatus](x: Self) {
    
    inline def setCompliance_status(value: String): Self = StObject.set(x, "compliance_status", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
  }
}
