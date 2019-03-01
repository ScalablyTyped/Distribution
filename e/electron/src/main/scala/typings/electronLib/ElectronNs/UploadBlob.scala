package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBlob extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-blob
  /**
    * UUID of blob data to upload.
    */
  var blobUUID: java.lang.String
  /**
    * blob.
    */
  var `type`: java.lang.String
}

object UploadBlob {
  @scala.inline
  def apply(blobUUID: java.lang.String, `type`: java.lang.String): UploadBlob = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("blobUUID")(blobUUID)
    __obj.asInstanceOf[UploadBlob]
  }
}

