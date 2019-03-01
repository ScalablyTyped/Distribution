package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-file
  /**
    * Path of file to be uploaded.
    */
  var filePath: java.lang.String
  /**
    * Number of bytes to read from offset. Defaults to 0.
    */
  var length: scala.Double
  /**
    * Last Modification time in number of seconds since the UNIX epoch.
    */
  var modificationTime: scala.Double
  /**
    * Defaults to 0.
    */
  var offset: scala.Double
  /**
    * file.
    */
  var `type`: java.lang.String
}

object UploadFile {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    length: scala.Double,
    modificationTime: scala.Double,
    offset: scala.Double,
    `type`: java.lang.String
  ): UploadFile = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("modificationTime")(modificationTime)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[UploadFile]
  }
}

