package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-data
  /**
    * UUID of blob data. Use ses.getBlobData method to retrieve the data.
    */
  var blobUUID: js.UndefOr[String] = js.native
  /**
    * Content being sent.
    */
  var bytes: Buffer = js.native
  /**
    * Path of file being uploaded.
    */
  var file: js.UndefOr[String] = js.native
}

object UploadData {
  @scala.inline
  def apply(bytes: Buffer): UploadData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  @scala.inline
  implicit class UploadDataOps[Self <: UploadData] (val x: Self) extends AnyVal {
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
    def setBytes(value: Buffer): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlobUUID(value: String): Self = this.set("blobUUID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobUUID: Self = this.set("blobUUID", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

