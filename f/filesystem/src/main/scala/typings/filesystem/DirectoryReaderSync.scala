package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait DirectoryReaderSync extends StObject {
  
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
  implicit class DirectoryReaderSyncMutableBuilder[Self <: DirectoryReaderSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadEntries(value: () => js.Array[EntrySync]): Self = StObject.set(x, "readEntries", js.Any.fromFunction0(value))
  }
}
