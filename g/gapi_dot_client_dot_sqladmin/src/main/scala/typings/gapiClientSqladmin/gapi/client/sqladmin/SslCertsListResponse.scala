package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsListResponse extends js.Object {
  /** List of client certificates for the instance. */
  var items: js.UndefOr[js.Array[SslCert]] = js.native
  /** This is always sql#sslCertsList. */
  var kind: js.UndefOr[String] = js.native
}

object SslCertsListResponse {
  @scala.inline
  def apply(): SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsListResponse]
  }
  @scala.inline
  implicit class SslCertsListResponseOps[Self <: SslCertsListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SslCert*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SslCert]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

