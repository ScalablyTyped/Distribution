package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificatePrincipal extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/certificate-principal
  /**
    * Common Name.
    */
  var commonName: String
  
  /**
    * Country or region.
    */
  var country: String
  
  /**
    * Locality.
    */
  var locality: String
  
  /**
    * Organization Unit names.
    */
  var organizationUnits: js.Array[String]
  
  /**
    * Organization names.
    */
  var organizations: js.Array[String]
  
  /**
    * State or province.
    */
  var state: String
}
object CertificatePrincipal {
  
  inline def apply(
    commonName: String,
    country: String,
    locality: String,
    organizationUnits: js.Array[String],
    organizations: js.Array[String],
    state: String
  ): CertificatePrincipal = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organizationUnits = organizationUnits.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatePrincipal]
  }
  
  extension [Self <: CertificatePrincipal](x: Self) {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUnits(value: js.Array[String]): Self = StObject.set(x, "organizationUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUnitsVarargs(value: String*): Self = StObject.set(x, "organizationUnits", js.Array(value :_*))
    
    inline def setOrganizations(value: js.Array[String]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(value: String*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
