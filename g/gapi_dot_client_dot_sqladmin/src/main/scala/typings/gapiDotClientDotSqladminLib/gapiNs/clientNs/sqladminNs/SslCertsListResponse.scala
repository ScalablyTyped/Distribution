package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsListResponse extends js.Object {
  /** List of client certificates for the instance. */
  var items: js.UndefOr[js.Array[SslCert]] = js.undefined
  /** This is always sql#sslCertsList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object SslCertsListResponse {
  @scala.inline
  def apply(items: js.Array[SslCert] = null, kind: java.lang.String = null): SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[SslCertsListResponse]
  }
}

