package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract interface representing entries in a file system, each of which may be a FileEntrySync or DirectoryEntrySync.
  */
@js.native
trait EntrySync extends js.Object {
  /**
    * The file system on which the entry resides.
    */
  var filesystem: FileSystemSync = js.native
  /**
    * The full absolute path from the root to the entry.
    */
  var fullPath: String = js.native
  /**
    * EntrySync is a directory.
    * @readonly
    */
  var isDirectory: Boolean = js.native
  /**
    * EntrySync is a file.
    * @readonly
    */
  var isFile: Boolean = js.native
  /**
    * The name of the entry, excluding the path leading to it.
    */
  var name: String = js.native
  /**
    * Copy an entry to a different location on the file system. It is an error to try to:
    * <ul>
    * <li> copy a directory inside itself or to any child at any depth;</li>
    * <li> copy an entry into its parent if a name different from its current one isn't provided;</li>
    * <li> copy a file to a path occupied by a directory;</li>
    * <li> copy a directory to a path occupied by a file;</li>
    * <li> copy any element to a path occupied by a directory which is not empty.</li>
    * </ui>
    * A copy of a file on top of an existing file must attempt to delete and replace that file.
    * A copy of a directory on top of an existing empty directory must attempt to delete and replace that directory.
    * Directory copies are always recursive--that is, they copy all contents of the directory.
    */
  def copyTo(parent: DirectoryEntrySync): EntrySync = js.native
  def copyTo(parent: DirectoryEntrySync, newName: String): EntrySync = js.native
  /**
    * Look up metadata about this entry.
    */
  def getMetadata(): Metadata = js.native
  /**
    * Look up the parent DirectoryEntrySync containing this Entry. If this EntrySync is the root of its filesystem, its parent is itself.
    */
  def getParent(): DirectoryEntrySync = js.native
  /**
    * Move an entry to a different location on the file system. It is an error to try to:
    * <ul>
    * <li> move a directory inside itself or to any child at any depth;</li>
    * <li> move an entry into its parent if a name different from its current one isn't provided;</li>
    * <li> move a file to a path occupied by a directory;</li>
    * <li> move a directory to a path occupied by a file;</li>
    * <li> move any element to a path occupied by a directory which is not empty.</li>
    * </ui>
    * A move of a file on top of an existing file must attempt to delete and replace that file. A move of a directory on top of an existing empty directory must attempt to delete and replace that directory.
    * @param parent The directory to which to move the entry.
    * @param newName The new name of the entry. Defaults to the EntrySync's current name if unspecified.
    */
  def moveTo(parent: DirectoryEntrySync): EntrySync = js.native
  def moveTo(parent: DirectoryEntrySync, newName: String): EntrySync = js.native
  /**
    * Deletes a file or directory. It is an error to attempt to delete a directory that is not empty. It is an error to attempt to delete the root directory of a filesystem.
    */
  def remove(): Unit = js.native
  /**
    * Returns a URL that can be used to identify this entry. Unlike the URN defined in [FILE-API-ED], it has no specific expiration; as it describes a location on disk, it should be valid at least as long as that location exists.
    */
  def toURL(): String = js.native
}

