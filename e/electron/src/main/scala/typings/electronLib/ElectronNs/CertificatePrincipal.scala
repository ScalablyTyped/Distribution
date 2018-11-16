package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CertificatePrincipal extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/certificate-principal
  /**
       * Common Name
       */
  var commonName: java.lang.String
  /**
       * Country or region
       */
  var country: java.lang.String
  /**
       * Locality
       */
  var locality: java.lang.String
  /**
       * Organization Unit names
       */
  var organizationUnits: js.Array[java.lang.String]
  /**
       * Organization names
       */
  var organizations: js.Array[java.lang.String]
  /**
       * State or province
       */
  var state: java.lang.String
}

