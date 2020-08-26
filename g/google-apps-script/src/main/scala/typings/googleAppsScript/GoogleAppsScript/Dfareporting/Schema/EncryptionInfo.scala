package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInfo extends js.Object {
  var encryptionEntityId: js.UndefOr[String] = js.native
  var encryptionEntityType: js.UndefOr[String] = js.native
  var encryptionSource: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object EncryptionInfo {
  @scala.inline
  def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  @scala.inline
  implicit class EncryptionInfoOps[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
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
    def setEncryptionEntityId(value: String): Self = this.set("encryptionEntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionEntityId: Self = this.set("encryptionEntityId", js.undefined)
    @scala.inline
    def setEncryptionEntityType(value: String): Self = this.set("encryptionEntityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionEntityType: Self = this.set("encryptionEntityType", js.undefined)
    @scala.inline
    def setEncryptionSource(value: String): Self = this.set("encryptionSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionSource: Self = this.set("encryptionSource", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

