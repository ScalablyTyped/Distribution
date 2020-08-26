package typings.easyXHeaders.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureContextOptions extends js.Object {
    // string | buffer
  var ca: js.UndefOr[js.Any] = js.native
  var cert: js.UndefOr[js.Any] = js.native
     // string | string[]
  var ciphers: js.UndefOr[String] = js.native
      // string | buffer
  var crl: js.UndefOr[js.Any] = js.native
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
     //string | buffer
  var key: js.UndefOr[js.Any] = js.native
     //string | buffer
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[js.Any] = js.native
}

object SecureContextOptions {
  @scala.inline
  def apply(): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureContextOptions]
  }
  @scala.inline
  implicit class SecureContextOptionsOps[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
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
  }
  
}

