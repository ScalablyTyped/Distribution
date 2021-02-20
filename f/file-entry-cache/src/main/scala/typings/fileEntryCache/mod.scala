package typings.fileEntryCache

import typings.fileEntryCache.anon.Hash
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-entry-cache", "create")
  @js.native
  def create(cacheName: String): FileEntryCache = js.native
  @JSImport("file-entry-cache", "create")
  @js.native
  def create(cacheName: String, directory: js.UndefOr[scala.Nothing], usecheckSum: Boolean): FileEntryCache = js.native
  @JSImport("file-entry-cache", "create")
  @js.native
  def create(cacheName: String, directory: String): FileEntryCache = js.native
  @JSImport("file-entry-cache", "create")
  @js.native
  def create(cacheName: String, directory: String, usecheckSum: Boolean): FileEntryCache = js.native
  
  @JSImport("file-entry-cache", "createFromFile")
  @js.native
  def createFromFile(pathToCache: String): FileEntryCache = js.native
  @JSImport("file-entry-cache", "createFromFile")
  @js.native
  def createFromFile(pathToCache: String, useCheckSum: Boolean): FileEntryCache = js.native
  
  @js.native
  trait AnalyzedFilesInfo extends StObject {
    
    val changedFiles: js.Array[String] = js.native
    
    val notChangedFiles: js.Array[String] = js.native
    
    val notFoundFiles: js.Array[String] = js.native
  }
  object AnalyzedFilesInfo {
    
    @scala.inline
    def apply(changedFiles: js.Array[String], notChangedFiles: js.Array[String], notFoundFiles: js.Array[String]): AnalyzedFilesInfo = {
      val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], notChangedFiles = notChangedFiles.asInstanceOf[js.Any], notFoundFiles = notFoundFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyzedFilesInfo]
    }
    
    @scala.inline
    implicit class AnalyzedFilesInfoMutableBuilder[Self <: AnalyzedFilesInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedFiles(value: js.Array[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedFilesVarargs(value: String*): Self = StObject.set(x, "changedFiles", js.Array(value :_*))
      
      @scala.inline
      def setNotChangedFiles(value: js.Array[String]): Self = StObject.set(x, "notChangedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotChangedFilesVarargs(value: String*): Self = StObject.set(x, "notChangedFiles", js.Array(value :_*))
      
      @scala.inline
      def setNotFoundFiles(value: js.Array[String]): Self = StObject.set(x, "notFoundFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundFilesVarargs(value: String*): Self = StObject.set(x, "notFoundFiles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FileDescriptor extends StObject {
    
    val changed: js.UndefOr[Boolean] = js.native
    
    val err: js.UndefOr[Error] = js.native
    
    val key: String = js.native
    
    val meta: js.UndefOr[Hash] = js.native
    
    val notFound: Boolean = js.native
  }
  object FileDescriptor {
    
    @scala.inline
    def apply(key: String, notFound: Boolean): FileDescriptor = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDescriptor]
    }
    
    @scala.inline
    implicit class FileDescriptorMutableBuilder[Self <: FileDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Hash): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setNotFound(value: Boolean): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileEntryCache extends StObject {
    
    /**
      * given an array of file paths it return and object with three arrays:
      *  - changedFiles: Files that changed since previous run
      *  - notChangedFiles: Files that haven't change
      *  - notFoundFiles: Files that were not found, probably deleted
      */
    def analyzeFiles(): AnalyzedFilesInfo = js.native
    def analyzeFiles(files: js.Array[String]): AnalyzedFilesInfo = js.native
    
    /** the flat cache storage used to persist the metadata of the `files */
    var cache: js.Object = js.native
    
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
}
