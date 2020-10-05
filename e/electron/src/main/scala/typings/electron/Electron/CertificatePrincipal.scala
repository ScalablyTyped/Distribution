package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatePrincipal extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate-principal
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
  implicit class CertificatePrincipalOps[Self <: CertificatePrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationUnitsVarargs(value: String*): Self = this.set("organizationUnits", js.Array(value :_*))
    @scala.inline
    def setOrganizationUnits(value: js.Array[String]): Self = this.set("organizationUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationsVarargs(value: String*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[String]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

