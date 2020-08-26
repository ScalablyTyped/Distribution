package typings.googleCloudStorage.fileMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionKeyOptions extends js.Object {
  var encryptionKey: js.UndefOr[String | Buffer] = js.native
  var kmsKeyName: js.UndefOr[String] = js.native
}

object EncryptionKeyOptions {
  @scala.inline
  def apply(): EncryptionKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionKeyOptions]
  }
  @scala.inline
  implicit class EncryptionKeyOptionsOps[Self <: EncryptionKeyOptions] (val x: Self) extends AnyVal {
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
    def setEncryptionKey(value: String | Buffer): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
  }
  
}

