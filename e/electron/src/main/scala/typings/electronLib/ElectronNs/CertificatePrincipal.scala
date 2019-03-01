package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePrincipal extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate-principal
  /**
    * Common Name.
    */
  var commonName: java.lang.String
  /**
    * Country or region.
    */
  var country: java.lang.String
  /**
    * Locality.
    */
  var locality: java.lang.String
  /**
    * Organization Unit names.
    */
  var organizationUnits: js.Array[java.lang.String]
  /**
    * Organization names.
    */
  var organizations: js.Array[java.lang.String]
  /**
    * State or province.
    */
  var state: java.lang.String
}

object CertificatePrincipal {
  @scala.inline
  def apply(
    commonName: java.lang.String,
    country: java.lang.String,
    locality: java.lang.String,
    organizationUnits: js.Array[java.lang.String],
    organizations: js.Array[java.lang.String],
    state: java.lang.String
  ): CertificatePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commonName")(commonName)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("locality")(locality)
    __obj.updateDynamic("organizationUnits")(organizationUnits)
    __obj.updateDynamic("organizations")(organizations)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CertificatePrincipal]
  }
}

