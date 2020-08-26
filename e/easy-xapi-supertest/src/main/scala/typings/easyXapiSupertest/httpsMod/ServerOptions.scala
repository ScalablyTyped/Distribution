package typings.easyXapiSupertest.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.native
  var SNICallback: js.UndefOr[js.Function1[/* servername */ String, _]] = js.native
  var ca: js.UndefOr[js.Any] = js.native
  var cert: js.UndefOr[js.Any] = js.native
  var ciphers: js.UndefOr[String] = js.native
  var crl: js.UndefOr[js.Any] = js.native
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[js.Any] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var requestCert: js.UndefOr[Boolean] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setNPNProtocols(value: js.Any): Self = this.set("NPNProtocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNPNProtocols: Self = this.set("NPNProtocols", js.undefined)
    @scala.inline
    def setSNICallback(value: /* servername */ String => _): Self = this.set("SNICallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSNICallback: Self = this.set("SNICallback", js.undefined)
    @scala.inline
    def setCa(value: js.Any): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCert(value: js.Any): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setCrl(value: js.Any): Self = this.set("crl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = this.set("honorCipherOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorCipherOrder: Self = this.set("honorCipherOrder", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPfx(value: js.Any): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setRequestCert(value: Boolean): Self = this.set("requestCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCert: Self = this.set("requestCert", js.undefined)
  }
  
}

