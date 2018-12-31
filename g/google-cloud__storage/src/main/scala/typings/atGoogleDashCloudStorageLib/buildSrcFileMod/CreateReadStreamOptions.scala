package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReadStreamOptions extends js.Object {
  /**
    * A byte offset to stop reading the file at.
    * NOTE: Byte ranges are inclusive; that is, `options.start = 0` and
    * `options.end = 999` represent the first 1000 bytes in a file or object.
    * NOTE: when specifying a byte range, data integrity is not available.
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /**
    * A byte offset to begin the file's download
    * from. Default is 0. NOTE: Byte ranges are inclusive; that is,
    * `options.start = 0` and `options.end = 999` represent the first 1000
    * bytes in a file or object. NOTE: when specifying a byte range, data
    * integrity is not available.
    */
  var start: js.UndefOr[scala.Double] = js.undefined
  /**
    * The ID of the project which will be billed for the request.
    */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, data integrity is validated with a
    * CRC32c checksum. You may use MD5 if preferred, but that hash is not
    * supported for composite objects. An error will be raised if MD5 is
    * specified but is not available. You may also choose to skip validation
    * completely, however this is **not recommended**.
    */
  var validation: js.UndefOr[
    atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.md5 | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.crc32c | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`false` | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`true`
  ] = js.undefined
}

