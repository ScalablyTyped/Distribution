package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a file system.
  */
@js.native
trait FileSystemSync extends js.Object {
  /**
    * This is the name of the file system. The specifics of naming filesystems is unspecified, but a name must be unique across the list of exposed file systems.
    */
  var name: String = js.native
  /**
    * root The root directory of the file system.
    */
  var root: DirectoryEntrySync = js.native
}

object FileSystemSync {
  @scala.inline
  def apply(name: String, root: DirectoryEntrySync): FileSystemSync = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSync]
  }
  @scala.inline
  implicit class FileSystemSyncOps[Self <: FileSystemSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: DirectoryEntrySync): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

