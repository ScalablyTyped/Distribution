package typings.filesystem

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
  var name: String
  /**
    * The root directory of the file system.
    * @readonly
    */
  var root: DirectoryEntry
}

object FileSystem {
  @scala.inline
  def apply(name: String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystem]
  }
}

