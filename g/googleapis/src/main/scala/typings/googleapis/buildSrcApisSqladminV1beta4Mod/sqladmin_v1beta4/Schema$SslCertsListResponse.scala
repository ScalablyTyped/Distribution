package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts list response.
  */
@js.native
trait Schema$SslCertsListResponse extends js.Object {
  /**
    * List of client certificates for the instance.
    */
  var items: js.UndefOr[js.Array[Schema$SslCert]] = js.native
  /**
    * This is always sql#sslCertsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$SslCertsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$SslCert] = null, kind: String = null): Schema$SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslCertsListResponse]
  }
}

