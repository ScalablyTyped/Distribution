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
    val __obj = js.Dynamic.literal(commonName = commonName, country = country, locality = locality, organizationUnits = organizationUnits, organizations = organizations, state = state)
  
    __obj.asInstanceOf[CertificatePrincipal]
  }
}

