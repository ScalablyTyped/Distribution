package typings.fileEntryCache.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEntryCache extends js.Object {
  /** the flat cache storage used to persist the metadata of the `files */
  var cache: js.Object = js.native
  /**
    * given an array of file paths it return and object with three arrays:
    *  - changedFiles: Files that changed since previous run
    *  - notChangedFiles: Files that haven't change
    *  - notFoundFiles: Files that were not found, probably deleted
    */
  def analyzeFiles(): AnalyzedFilesInfo = js.native
  def analyzeFiles(files: js.Array[String]): AnalyzedFilesInfo = js.native
  /**
    * Delete the cache file from the disk
    */
  def deleteCacheFile(): Unit = js.native
  /**
    * remove the cache from the file and clear the memory cache
    */
  def destroy(): Unit = js.native
  def getFileDescriptor(file: String): FileDescriptor = js.native
  /** Given a buffer, calculate md5 hash of its content. */
  def getHash(buffer: Buffer): String = js.native
  /**
    * Return the list o the files that changed compared
    * against the ones stored in the cache
    */
  def getUpdatedFiles(): js.Array[String] = js.native
  def getUpdatedFiles(files: js.Array[String]): js.Array[String] = js.native
  /**  Return whether or not a file has changed since last time reconcile was called */
  def hasFileChanged(file: String): Boolean = js.native
  /**
    * return the list of file
    */
  def normalizeEntries(): js.Array[FileDescriptor] = js.native
  def normalizeEntries(files: js.Array[String]): js.Array[FileDescriptor] = js.native
  /**
    * Sync the files and persist them to the cache
    */
  def reconcile(): Unit = js.native
  def reconcile(noPrune: Boolean): Unit = js.native
  /**
    * Remove an entry from the file-entry-cache.
    * Useful to force the file to still be considered
    * modified the next time the process is run
    */
  def removeEntry(entryName: String): Unit = js.native
}

