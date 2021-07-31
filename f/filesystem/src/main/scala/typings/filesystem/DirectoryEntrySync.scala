package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a directory on a file system.
  */
@js.native
trait DirectoryEntrySync
  extends StObject
     with EntrySync {
  
  /**
    * Creates a new DirectoryReaderSync to read EntrySyncs from this DirectorySync.
    */
  def createReader(): DirectoryReaderSync = js.native
  
  /**
    * Creates or looks up a directory.
    * @param path Either an absolute path or a relative path from this DirectoryEntrySync to the directory to be looked up or created. It is an error to attempt to create a directory whose immediate parent does not yet exist.
    * @param options
    *     <ul>
    *     <li> If create and exclusive are both true and the path already exists, getDirectory must fail.</li>
    *     <li> If create is true, the path doesn't exist, and no other error occurs, getDirectory must create and return a corresponding DirectoryEntry.</li>
    *     <li> If create is not true and the path doesn't exist, getDirectory must fail.</li>
    *     <li> If create is not true and the path exists, but is a file, getDirectory must fail.</li>
    *     <li> Otherwise, if no other error occurs, getDirectory must return a DirectoryEntrySync corresponding to path.</li>
    *     </ul>
    */
  def getDirectory(path: String): DirectoryEntrySync = js.native
  def getDirectory(path: String, options: Flags): DirectoryEntrySync = js.native
  
  /**
    * Creates or looks up a directory.
    * @param path Either an absolute path or a relative path from this DirectoryEntrySync to the file to be looked up or created. It is an error to attempt to create a file whose immediate parent does not yet exist.
    * @param options
    *     <ul>
    *     <li> If create and exclusive are both true and the path already exists, getFile must fail.</li>
    *     <li> If create is true, the path doesn't exist, and no other error occurs, getFile must create it as a zero-length file and return a corresponding FileEntry.</li>
    *     <li> If create is not true and the path doesn't exist, getFile must fail.</li>
    *     <li> If create is not true and the path exists, but is a directory, getFile must fail.</li>
    *     <li> Otherwise, if no other error occurs, getFile must return a FileEntrySync corresponding to path.</li>
    *     </ul>
    */
  def getFile(path: String): FileEntrySync = js.native
  def getFile(path: String, options: Flags): FileEntrySync = js.native
  
  /**
    * Deletes a directory and all of its contents, if any. In the event of an error [e.g. trying to delete a directory that contains a file that cannot be removed], some of the contents of the directory may be deleted. It is an error to attempt to delete the root directory of a filesystem.
    */
  def removeRecursively(): Unit = js.native
}
