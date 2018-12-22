package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RemoveClientCertificate extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-client-certificate
  /**
       * Origin of the server whose associated client certificate must be removed from
       * the cache.
       */
  var origin: java.lang.String
  /**
       * clientCertificate.
       */
  var `type`: java.lang.String
}

