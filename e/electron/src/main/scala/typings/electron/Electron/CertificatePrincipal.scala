package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatePrincipal extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/certificate-principal
  /**
    * Common Name.
    */
  var commonName: String = js.native
  
  /**
    * Country or region.
    */
  var country: String = js.native
  
  /**
    * Locality.
    */
  var locality: String = js.native
  
  /**
    * Organization Unit names.
    */
  var organizationUnits: js.Array[String] = js.native
  
  /**
    * Organization names.
    */
  var organizations: js.Array[String] = js.native
  
  /**
    * State or province.
    */
  var state: String = js.native
}
object CertificatePrincipal {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CertificatePrincipalMutableBuilder[Self <: CertificatePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUnits(value: js.Array[String]): Self = StObject.set(x, "organizationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUnitsVarargs(value: String*): Self = StObject.set(x, "organizationUnits", js.Array(value :_*))
    
    @scala.inline
    def setOrganizations(value: js.Array[String]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsVarargs(value: String*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
