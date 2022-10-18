package typings.fileServicesTypes

import typings.fileServicesTypes.anon.EncodingBufferEncoding
import typings.fileServicesTypes.anon.FnCall
import typings.fileServicesTypes.distBaseApiSyncMod.IBaseFileSystemSync
import typings.fileServicesTypes.distCommonFsTypesMod.BufferEncoding
import typings.fileServicesTypes.distCommonFsTypesMod.IDirectoryContents
import typings.fileServicesTypes.distCommonFsTypesMod.IWalkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExtendedApiSyncMod {
  
  @js.native
  trait IFileSystemExtendedSyncActions extends StObject {
    
    /**
      * Recursively copy a directory and its contents.
      */
    def copyDirectorySync(sourcePath: String, destinationPath: String): Unit = js.native
    
    /**
      * Check if a path points to an existing directory.
      *
      * @param directoryPath possible directory path.
      * @param statFn optional custom stat function (e.g. lstatSync to detect links).
      */
    def directoryExistsSync(directoryPath: String): Boolean = js.native
    def directoryExistsSync(directoryPath: String, statFn: FnCall): Boolean = js.native
    
    /**
      * Ensure that a directory and all its parent directories exist
      */
    def ensureDirectorySync(directoryPath: String): Unit = js.native
    
    /**
      * Check if a path points to an existing file.
      *
      * @param filePath possible file path.
      * @param statFn optional custom stat function (e.g. lstat to detect links).
      */
    def fileExistsSync(filePath: String): Boolean = js.native
    def fileExistsSync(filePath: String, statFn: FnCall): Boolean = js.native
    
    /**
      * Search for a specific file name in parent directory chain.
      * Useful for finding configuration or manifest files.
      *
      * @returns absolute path of first found file, or `undefined` if none found.
      */
    def findClosestFileSync(initialDirectoryPath: String, fileName: String): js.UndefOr[String] = js.native
    
    /**
      * Search for a specific file name in parent directory chain.
      * Useful for finding configuration or manifest files.
      *
      * @returns absolute paths of all found files (ordered from inner most directory and up).
      */
    def findFilesInAncestorsSync(initialDirectory: String, fileName: String): js.Array[String] = js.native
    
    /**
      * Search for files inside `rootDirectory`.
      *
      * @returns absolute paths of all found files.
      */
    def findFilesSync(rootDirectory: String): js.Array[String] = js.native
    def findFilesSync(rootDirectory: String, options: IWalkOptions): js.Array[String] = js.native
    
    /**
      * Populates the provided directory with given contents.
      *
      * @returns absolute paths of written files.
      */
    def populateDirectorySync(directoryPath: String, contents: IDirectoryContents): js.Array[String] = js.native
    
    /**
      * Read a file and parse it using `JSON.parse`.
      *
      * @param filePath path pointing to a `json` file.
      * @param options text encoding to decode file with (defaults to `utf8`).
      * @throws if there is a reading or parsing error.
      */
    def readJsonFileSync(filePath: String): Any = js.native
    def readJsonFileSync(filePath: String, options: EncodingBufferEncoding): Any = js.native
    def readJsonFileSync(filePath: String, options: BufferEncoding): Any = js.native
  }
  
  @js.native
  trait IFileSystemSync
    extends StObject
       with IBaseFileSystemSync
       with IFileSystemExtendedSyncActions
}
