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

