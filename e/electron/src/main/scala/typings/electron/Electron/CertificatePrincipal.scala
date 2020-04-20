package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePrincipal extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate-principal
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
}

