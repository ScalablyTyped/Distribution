package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveClientCertificate extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-client-certificate
  /**
    * Origin of the server whose associated client certificate must be removed from
    * the cache.
    */
  var origin: String
  /**
    * clientCertificate.
    */
  var `type`: String
}

object RemoveClientCertificate {
  @scala.inline
  def apply(origin: String, `type`: String): RemoveClientCertificate = {
    val __obj = js.Dynamic.literal(origin = origin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveClientCertificate]
  }
}

