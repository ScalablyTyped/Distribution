package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a directory on a file system.
  */
@js.native
trait DirectoryEntry extends Entry {
  
  /**
    * Creates a new DirectoryReader to read Entries from this Directory.
    */
  def createReader(): DirectoryReader = js.native
  
  /**
    * Creates or looks up a directory.
    * @param path Either an absolute path or a relative path from this DirectoryEntry to the directory to be looked up or created. It is an error to attempt to create a directory whose immediate parent does not yet exist.
    * @param options
    *     <ul>
    *     <li>If create and exclusive are both true and the path already exists, getDirectory must fail.</li>
    *     <li>If create is true, the path doesn't exist, and no other error occurs, getDirectory must create and return a corresponding DirectoryEntry.</li>
    *     <li>If create is not true and the path doesn't exist, getDirectory must fail.</li>
    *     <li>If create is not true and the path exists, but is a file, getDirectory must fail.</li>
    *     <li>Otherwise, if no other error occurs, getDirectory must return a DirectoryEntry corresponding to path.</li>
    *     </ul>
    * @param successCallback   A callback that is called to return the DirectoryEntry selected or created.
    * @param errorCallback A callback that is called when errors happen.
    *
    */
  def getDirectory(path: String): Unit = js.native
  def getDirectory(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getDirectory(path: String, options: js.UndefOr[scala.Nothing], successCallback: DirectoryEntryCallback): Unit = js.native
  def getDirectory(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: DirectoryEntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getDirectory(path: String, options: Flags): Unit = js.native
  def getDirectory(
    path: String,
    options: Flags,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getDirectory(path: String, options: Flags, successCallback: DirectoryEntryCallback): Unit = js.native
  def getDirectory(
    path: String,
    options: Flags,
    successCallback: DirectoryEntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Creates or looks up a file.
    * @param path Either an absolute path or a relative path from this DirectoryEntry to the file to be looked up or created. It is an error to attempt to create a file whose immediate parent does not yet exist.
    * @param options
    *     <ul>
    *     <li>If create and exclusive are both true, and the path already exists, getFile must fail.</li>
    *     <li>If create is true, the path doesn't exist, and no other error occurs, getFile must create it as a zero-length file and return a corresponding FileEntry.</li>
    *     <li>If create is not true and the path doesn't exist, getFile must fail.</li>
    *     <li>If create is not true and the path exists, but is a directory, getFile must fail.</li>
    *     <li>Otherwise, if no other error occurs, getFile must return a FileEntry corresponding to path.</li>
    *     </ul>
    * @param successCallback A callback that is called to return the File selected or created.
    * @param errorCallback A callback that is called when errors happen.
    */
  def getFile(path: String): Unit = js.native
  def getFile(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getFile(path: String, options: js.UndefOr[scala.Nothing], successCallback: FileEntryCallback): Unit = js.native
  def getFile(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: FileEntryCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getFile(path: String, options: Flags): Unit = js.native
  def getFile(
    path: String,
    options: Flags,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def getFile(path: String, options: Flags, successCallback: FileEntryCallback): Unit = js.native
  def getFile(path: String, options: Flags, successCallback: FileEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes a directory and all of its contents, if any. In the event of an error [e.g. trying to delete a directory that contains a file that cannot be removed], some of the contents of the directory may be deleted. It is an error to attempt to delete the root directory of a filesystem.
    * @param successCallback A callback that is called on success.
    * @param errorCallback A callback that is called when errors happen.
    */
  def removeRecursively(successCallback: VoidCallback): Unit = js.native
  def removeRecursively(successCallback: VoidCallback, errorCallback: ErrorCallback): Unit = js.native
}
