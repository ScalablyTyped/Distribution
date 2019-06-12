package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileMapping extends js.Object {
  /**
    * Offset in the mapped file on disk, in bytes.
    */
  var offset: scala.Double
  /**
    * Full filesystem path.
    */
  var path: java.lang.String
  /**
    * Size in the mapped file on disk, in bytes.
    */
  var size: scala.Double
}

object FileMapping {
  @scala.inline
  def apply(offset: scala.Double, path: java.lang.String, size: scala.Double): FileMapping = {
    val __obj = js.Dynamic.literal(offset = offset, path = path, size = size)
  
    __obj.asInstanceOf[FileMapping]
  }
}

