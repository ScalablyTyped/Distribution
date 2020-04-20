package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a file system.
  */
trait FileSystemSync extends js.Object {
  /**
    * This is the name of the file system. The specifics of naming filesystems is unspecified, but a name must be unique across the list of exposed file systems.
    */
  var name: String
  /**
    * root The root directory of the file system.
    */
  var root: DirectoryEntrySync
}

object FileSystemSync {
  @scala.inline
  def apply(name: String, root: DirectoryEntrySync): FileSystemSync = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSync]
  }
}

