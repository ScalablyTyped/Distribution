package typings
package filesystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a file system.
  */
trait FileSystem extends js.Object {
  /**
    * This is the name of the file system. The specifics of naming filesystems is unspecified, but a name must be unique across the list of exposed file systems.
    * @readonly
    */
  var name: java.lang.String
  /**
    * The root directory of the file system.
    * @readonly
    */
  var root: DirectoryEntry
}

object FileSystem {
  @scala.inline
  def apply(name: java.lang.String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name, root = root)
  
    __obj.asInstanceOf[FileSystem]
  }
}

