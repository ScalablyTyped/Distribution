package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object metadata that can be set at upload.
  */
@js.native
trait UploadMetadata extends SettableMetadata {
  /**
    * A Base64-encoded MD5 hash of the object being uploaded.
    */
  var md5Hash: js.UndefOr[String | Null] = js.native
}

object UploadMetadata {
  @scala.inline
  def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  @scala.inline
  implicit class UploadMetadataOps[Self <: UploadMetadata] (val x: Self) extends AnyVal {
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
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    @scala.inline
    def setMd5HashNull: Self = this.set("md5Hash", null)
  }
  
}

