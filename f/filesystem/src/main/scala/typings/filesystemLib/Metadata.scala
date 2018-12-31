package typings
package filesystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /**
    * This is the time at which the file or directory was last modified.
    * @readonly
    */
  var modificationTime: stdLib.Date
  /**
    * The size of the file, in bytes. This must return 0 for directories.
    * @readonly
    */
  var size: scala.Double
}

