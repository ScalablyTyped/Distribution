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

object Metadata {
  @scala.inline
  def apply(modificationTime: stdLib.Date, size: scala.Double): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modificationTime")(modificationTime)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Metadata]
  }
}

