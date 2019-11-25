package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileMapping extends js.Object {
  /**
    * Offset in the mapped file on disk, in bytes.
    */
  var offset: Double
  /**
    * Full filesystem path.
    */
  var path: String
  /**
    * Size in the mapped file on disk, in bytes.
    */
  var size: Double
}

object FileMapping {
  @scala.inline
  def apply(offset: Double, path: String, size: Double): FileMapping = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileMapping]
  }
}

