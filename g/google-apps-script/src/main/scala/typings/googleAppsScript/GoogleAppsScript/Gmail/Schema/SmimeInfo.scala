package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmimeInfo extends js.Object {
  var encryptedKeyPassword: js.UndefOr[String] = js.native
  var expiration: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var issuerCn: js.UndefOr[String] = js.native
  var pem: js.UndefOr[String] = js.native
  var pkcs12: js.UndefOr[String] = js.native
}

object SmimeInfo {
  @scala.inline
  def apply(): SmimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmimeInfo]
  }
  @scala.inline
  implicit class SmimeInfoOps[Self <: SmimeInfo] (val x: Self) extends AnyVal {
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
    def setEncryptedKeyPassword(value: String): Self = this.set("encryptedKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptedKeyPassword: Self = this.set("encryptedKeyPassword", js.undefined)
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setIssuerCn(value: String): Self = this.set("issuerCn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerCn: Self = this.set("issuerCn", js.undefined)
    @scala.inline
    def setPem(value: String): Self = this.set("pem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePem: Self = this.set("pem", js.undefined)
    @scala.inline
    def setPkcs12(value: String): Self = this.set("pkcs12", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkcs12: Self = this.set("pkcs12", js.undefined)
  }
  
}

