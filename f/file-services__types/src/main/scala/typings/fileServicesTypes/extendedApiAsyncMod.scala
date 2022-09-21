package typings.fileServicesTypes

import typings.fileServicesTypes.anon.EncodingBufferEncoding
import typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemAsync
import typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemPromiseActions
import typings.fileServicesTypes.commonFsTypesMod.BufferEncoding
import typings.fileServicesTypes.commonFsTypesMod.IDirectoryContents
import typings.fileServicesTypes.commonFsTypesMod.IFileSystemStats
import typings.fileServicesTypes.commonFsTypesMod.IWalkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedApiAsyncMod {
  
  @js.native
  trait IFileSystemAsync
    extends StObject
       with IBaseFileSystemAsync {
    
    @JSName("promises")
    var promises_IFileSystemAsync: IFileSystemPromiseActions = js.native
  }
  
  @js.native
  trait IFileSystemExtendedPromiseActions extends StObject {
    
    /**
      * Recursively copy a directory and its contents.
      */
    def copyDirectory(sourcePath: String, destinationPath: String): js.Promise[Unit] = js.native
    
    /**
      * Check if a path points to an existing directory.
      *
      * @param directoryPath possible directory path
      * @param statFn optional custom stat function (e.g. lstatSync to detect links)
      */
    def directoryExists(directoryPath: String): js.Promise[Boolean] = js.native
    def directoryExists(directoryPath: String, statFn: js.Function1[/* path */ String, js.Promise[IFileSystemStats]]): js.Promise[Boolean] = js.native
    
    /**
      * Ensure that a directory and all its parent directories exist
      */
    def ensureDirectory(directoryPath: String): js.Promise[Unit] = js.native
    
    /**
      * Check if a path points to an existing file.
      *
      * @param filePath possible file path
      * @param statFn optional custom stat function (e.g. lstat to detect links)
      */
    def fileExists(filePath: String): js.Promise[Boolean] = js.native
    def fileExists(filePath: String, statFn: js.Function1[/* path */ String, js.Promise[IFileSystemStats]]): js.Promise[Boolean] = js.native
    
    /**
      * Search for a specific file name in parent directory chain.
      * Useful for finding configuration or manifest files.
      *
      * @returns absolute path of first found file, or `undefined` if none found.
      */
    def findClosestFile(initialDirectoryPath: String, fileName: String): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * Search for files inside `rootDirectory`.
      *
      * @returns absolute paths of all found files.
      */
    def findFiles(rootDirectory: String): js.Promise[js.Array[String]] = js.native
    def findFiles(rootDirectory: String, options: IWalkOptions): js.Promise[js.Array[String]] = js.native
    
    /**
      * Search for a specific file name in parent chain.
      * Useful for finding configuration or manifest files.
      *
      * @returns absolute paths of all found files (ordered from inner most directory and up).
      */
    def findFilesInAncestors(initialDirectory: String, fileName: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Populates the provided directory with given contents.
      *
      * @returns absolute paths of written files.
      */
    def populateDirectory(directoryPath: String, contents: IDirectoryContents): js.Promise[js.Array[String]] = js.native
    
    /**
      * Read a file and parse it using `JSON.parse`.
      *
      * @param filePath path pointing to a `json` file.
      * @param options text encoding to decode file with (defaults to `utf8`).
      * @rejects if there is a reading or parsing error.
      */
    def readJsonFile(filePath: String): js.Promise[Any] = js.native
    def readJsonFile(filePath: String, options: EncodingBufferEncoding): js.Promise[Any] = js.native
    def readJsonFile(filePath: String, options: BufferEncoding): js.Promise[Any] = js.native
  }
  
  @js.native
  trait IFileSystemPromiseActions
    extends StObject
       with IBaseFileSystemPromiseActions
       with IFileSystemExtendedPromiseActions
}
