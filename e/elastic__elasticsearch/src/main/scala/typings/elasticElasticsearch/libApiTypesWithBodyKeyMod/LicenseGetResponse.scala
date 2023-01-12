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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseGetResponse] (val x: Self) extends AnyVal {
    
    inline def setLicense(value: LicenseGetLicenseInformation): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
