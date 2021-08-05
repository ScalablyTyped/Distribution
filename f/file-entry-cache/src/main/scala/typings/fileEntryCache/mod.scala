package typings.fileEntryCache

import typings.fileEntryCache.anon.Hash
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-entry-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(cacheName: String): FileEntryCache = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheName.asInstanceOf[js.Any]).asInstanceOf[FileEntryCache]
  inline def create(cacheName: String, directory: String): FileEntryCache = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheName.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[FileEntryCache]
  inline def create(cacheName: String, directory: String, usecheckSum: Boolean): FileEntryCache = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheName.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], usecheckSum.asInstanceOf[js.Any])).asInstanceOf[FileEntryCache]
  inline def create(cacheName: String, directory: Unit, usecheckSum: Boolean): FileEntryCache = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(cacheName.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], usecheckSum.asInstanceOf[js.Any])).asInstanceOf[FileEntryCache]
  
  inline def createFromFile(pathToCache: String): FileEntryCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(pathToCache.asInstanceOf[js.Any]).asInstanceOf[FileEntryCache]
  inline def createFromFile(pathToCache: String, useCheckSum: Boolean): FileEntryCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(pathToCache.asInstanceOf[js.Any], useCheckSum.asInstanceOf[js.Any])).asInstanceOf[FileEntryCache]
  
  trait AnalyzedFilesInfo extends StObject {
    
    val changedFiles: js.Array[String]
    
    val notChangedFiles: js.Array[String]
    
    val notFoundFiles: js.Array[String]
  }
  object AnalyzedFilesInfo {
    
    inline def apply(changedFiles: js.Array[String], notChangedFiles: js.Array[String], notFoundFiles: js.Array[String]): AnalyzedFilesInfo = {
      val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], notChangedFiles = notChangedFiles.asInstanceOf[js.Any], notFoundFiles = notFoundFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyzedFilesInfo]
    }
    
    extension [Self <: AnalyzedFilesInfo](x: Self) {
      
      inline def setChangedFiles(value: js.Array[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesVarargs(value: String*): Self = StObject.set(x, "changedFiles", js.Array(value :_*))
      
      inline def setNotChangedFiles(value: js.Array[String]): Self = StObject.set(x, "notChangedFiles", value.asInstanceOf[js.Any])
      
      inline def setNotChangedFilesVarargs(value: String*): Self = StObject.set(x, "notChangedFiles", js.Array(value :_*))
      
      inline def setNotFoundFiles(value: js.Array[String]): Self = StObject.set(x, "notFoundFiles", value.asInstanceOf[js.Any])
      
      inline def setNotFoundFilesVarargs(value: String*): Self = StObject.set(x, "notFoundFiles", js.Array(value :_*))
    }
  }
  
  trait FileDescriptor extends StObject {
    
    val changed: js.UndefOr[Boolean] = js.undefined
    
    val err: js.UndefOr[Error] = js.undefined
    
    val key: String
    
    val meta: js.UndefOr[Hash] = js.undefined
    
    val notFound: Boolean
  }
  object FileDescriptor {
    
    inline def apply(key: String, notFound: Boolean): FileDescriptor = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDescriptor]
    }
    
    extension [Self <: FileDescriptor](x: Self) {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Hash): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNotFound(value: Boolean): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
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
