package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGetResponse extends StObject {
  
  var license: LicenseGetLicenseInformation
}
object LicenseGetResponse {
  
  inline def apply(license: LicenseGetLicenseInformation): LicenseGetResponse = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseGetResponse]
  }
  
  extension [Self <: LicenseGetResponse](x: Self) {
    
    inline def setLicense(value: LicenseGetLicenseInformation): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
