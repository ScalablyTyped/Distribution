package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-file
  /**
    * Path of file to be uploaded.
    */
  var filePath: String
  /**
    * Number of bytes to read from `offset`. Defaults to `0`.
    */
  var length: Double
  /**
    * Last Modification time in number of seconds since the UNIX epoch.
    */
  var modificationTime: Double
  /**
    * Defaults to `0`.
    */
  var offset: Double
  /**
    * `file`.
    */
  var `type`: String
}

object UploadFile {
  @scala.inline
  def apply(filePath: String, length: Double, modificationTime: Double, offset: Double, `type`: String): UploadFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFile]
  }
}

