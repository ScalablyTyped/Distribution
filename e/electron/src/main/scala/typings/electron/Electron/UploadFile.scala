package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFile extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-file
  /**
    * Path of file to be uploaded.
    */
  var filePath: String = js.native
  /**
    * Number of bytes to read from `offset`. Defaults to `0`.
    */
  var length: Double = js.native
  /**
    * Last Modification time in number of seconds since the UNIX epoch.
    */
  var modificationTime: Double = js.native
  /**
    * Defaults to `0`.
    */
  var offset: Double = js.native
  /**
    * `file`.
    */
  var `type`: String = js.native
}

object UploadFile {
  @scala.inline
  def apply(filePath: String, length: Double, modificationTime: Double, offset: Double, `type`: String): UploadFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFile]
  }
  @scala.inline
  implicit class UploadFileOps[Self <: UploadFile] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setModificationTime(value: Double): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

