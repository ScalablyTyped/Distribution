package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends StObject {
  
  /**
    * Copy an entry to a different location on the file system. It is an error to try to:
    *
    * <ul>
    * <li> copy a directory inside itself or to any child at any depth;</li>
    * <li> copy an entry into its parent if a name different from its current one isn't provided;</li>
    * <li> copy a file to a path occupied by a directory;</li>
    * <li> copy a directory to a path occupied by a file;</li>
    * <li> copy any element to a path occupied by a directory which is not empty.</li>
    * <li> A copy of a file on top of an existing file must attempt to delete and replace that file.</li>
    * <li> A copy of a directory on top of an existing empty directory must attempt to delete and replace that directory.</li>
    * </ul>
    *
    * Directory copies are always recursive--that is, they copy all contents of the directory.
    */
  def copyTo(parent: FileSystemDirectoryEntry): Unit = js.native
  def copyTo(parent: FileSystemDirectoryEntry, newName: String): Unit = js.native
  def copyTo(
    parent: FileSystemDirectoryEntry,
    newName: String,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyTo(parent: FileSystemDirectoryEntry, newName: String, successCallback: EntryCallback): Unit = js.native
  def copyTo(
    parent: FileSystemDirectoryEntry,
    newName: String,
    successCallback: EntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyTo(
    parent: FileSystemDirectoryEntry,
    newName: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyTo(parent: FileSystemDirectoryEntry, newName: Unit, successCallback: EntryCallback): Unit = js.native
  def copyTo(
    parent: FileSystemDirectoryEntry,
    newName: Unit,
    successCallback: EntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * The file system on which the entry resides.
    */
  val filesystem: FileSystem = js.native
  
  /**
    * The full absolute path from the root to the entry.
    */
  val fullPath: String = js.native
  
  /**
    * Look up metadata about this entry.
    * @param successCallback A callback that is called with the time of the last modification.
    * @param errorCallback ErrorCallback A callback that is called when errors happen.
    */
  def getMetadata(successCallback: MetadataCallback): Unit = js.native
  def getMetadata(successCallback: MetadataCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Look up the parent DirectoryEntry containing this Entry. If this Entry is the root of its filesystem, its parent is itself.
    * @param successCallback A callback that is called to return the parent Entry.
    * @param errorCallback A callback that is called when errors happen.
    */
  def getParent(successCallback: DirectoryEntryCallback): Unit = js.native
  def getParent(successCallback: DirectoryEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Entry is a directory.
    */
  val isDirectory: Boolean = js.native
  
  /**
    * Entry is a file.
    */
  val isFile: Boolean = js.native
  
  /**
    * Move an entry to a different location on the file system. It is an error to try to:
    *
    * <ui>
    * <li>move a directory inside itself or to any child at any depth;</li>
    * <li>move an entry into its parent if a name different from its current one isn't provided;</li>
    * <li>move a file to a path occupied by a directory;</li>
    * <li>move a directory to a path occupied by a file;</li>
    * <li>move any element to a path occupied by a directory which is not empty.</li>
    * <ul>
    *
    * A move of a file on top of an existing file must attempt to delete and replace that file.
    * A move of a directory on top of an existing empty directory must attempt to delete and replace that directory.
    */
  def moveTo(parent: FileSystemDirectoryEntry): Unit = js.native
  def moveTo(parent: FileSystemDirectoryEntry, newName: String): Unit = js.native
  def moveTo(
    parent: FileSystemDirectoryEntry,
    newName: String,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveTo(parent: FileSystemDirectoryEntry, newName: String, successCallback: EntryCallback): Unit = js.native
  def moveTo(
    parent: FileSystemDirectoryEntry,
    newName: String,
    successCallback: EntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveTo(
    parent: FileSystemDirectoryEntry,
    newName: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveTo(parent: FileSystemDirectoryEntry, newName: Unit, successCallback: EntryCallback): Unit = js.native
  def moveTo(
    parent: FileSystemDirectoryEntry,
    newName: Unit,
    successCallback: EntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * The name of the entry, excluding the path leading to it.
    */
  val name: String = js.native
  
  /**
    * Deletes a file or directory. It is an error to attempt to delete a directory that is not empty. It is an error to attempt to delete the root directory of a filesystem.
    * @param successCallback A callback that is called on success.
    * @param errorCallback A callback that is called when errors happen.
    */
  def remove(successCallback: VoidCallback): Unit = js.native
  def remove(successCallback: VoidCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Returns a URL that can be used to identify this entry. Unlike the URN defined in [FILE-API-ED], it has no specific expiration; as it describes a location on disk, it should be valid at least as long as that location exists.
    */
  def toURL(): String = js.native
}
