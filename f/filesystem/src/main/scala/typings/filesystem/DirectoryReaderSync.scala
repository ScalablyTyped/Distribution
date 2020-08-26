package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface lets a user list files and directories in a directory. If there are no additions to or deletions from a directory between the first and last call to readEntries, and no errors occur, then:
  * <ul>
  * <li> A series of calls to readEntries must return each entry in the directory exactly once.</li>
  * <li> Once all entries have been returned, the next call to readEntries must produce an empty array.</li>
  * <li> If not all entries have been returned, the array produced by readEntries must not be empty.</li>
  * <li> The entries produced by readEntries must not include the directory itself ["."] or its parent [".."].</li>
  * </ul>
  */
@js.native
trait DirectoryReaderSync extends js.Object {
  /**
    * Read the next block of entries from this directory.
    */
  def readEntries(): js.Array[EntrySync] = js.native
}

object DirectoryReaderSync {
  @scala.inline
  def apply(readEntries: () => js.Array[EntrySync]): DirectoryReaderSync = {
    val __obj = js.Dynamic.literal(readEntries = js.Any.fromFunction0(readEntries))
    __obj.asInstanceOf[DirectoryReaderSync]
  }
  @scala.inline
  implicit class DirectoryReaderSyncOps[Self <: DirectoryReaderSync] (val x: Self) extends AnyVal {
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
    def setReadEntries(value: () => js.Array[EntrySync]): Self = this.set("readEntries", js.Any.fromFunction0(value))
  }
  
}

