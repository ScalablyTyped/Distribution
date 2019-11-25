package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsListResponse extends js.Object {
  /** List of client certificates for the instance. */
  var items: js.UndefOr[js.Array[SslCert]] = js.undefined
  /** This is always sql#sslCertsList. */
  var kind: js.UndefOr[String] = js.undefined
}

object SslCertsListResponse {
  @scala.inline
  def apply(items: js.Array[SslCert] = null, kind: String = null): SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslCertsListResponse]
  }
}

