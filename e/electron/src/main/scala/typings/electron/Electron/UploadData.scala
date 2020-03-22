package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-data
  /**
    * UUID of blob data. Use ses.getBlobData method to retrieve the data.
    */
  var blobUUID: js.UndefOr[String] = js.undefined
  /**
    * Content being sent.
    */
  var bytes: Buffer
  /**
    * Path of file being uploaded.
    */
  var file: js.UndefOr[String] = js.undefined
}

object UploadData {
  @scala.inline
  def apply(bytes: Buffer, blobUUID: String = null, file: String = null): UploadData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    if (blobUUID != null) __obj.updateDynamic("blobUUID")(blobUUID.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
}

