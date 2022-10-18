package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostAcknowledgement extends StObject {
  
  var license: js.Array[String]
  
  var message: String
}
object LicensePostAcknowledgement {
  
  inline def apply(license: js.Array[String], message: String): LicensePostAcknowledgement = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensePostAcknowledgement]
  }
  
  extension [Self <: LicensePostAcknowledgement](x: Self) {
    
    inline def setLicense(value: js.Array[String]): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseVarargs(value: String*): Self = StObject.set(x, "license", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
