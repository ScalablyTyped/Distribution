package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlob extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-blob
  /**
    * UUID of blob data to upload.
    */
  var blobUUID: String = js.native
  /**
    * `blob`.
    */
  var `type`: String = js.native
}

object UploadBlob {
  @scala.inline
  def apply(blobUUID: String, `type`: String): UploadBlob = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBlob]
  }
  @scala.inline
  implicit class UploadBlobOps[Self <: UploadBlob] (val x: Self) extends AnyVal {
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
    def setBlobUUID(value: String): Self = this.set("blobUUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

