package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBlob extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-blob
  /**
    * UUID of blob data to upload.
    */
  var blobUUID: String
  /**
    * blob.
    */
  var `type`: String
}

object UploadBlob {
  @scala.inline
  def apply(blobUUID: String, `type`: String): UploadBlob = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UploadBlob]
  }
}

