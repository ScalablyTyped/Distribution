package typings.fileServicesTypes

import typings.fileServicesTypes.anon.Encoding
import typings.fileServicesTypes.anon.EncodingWithFileTypes
import typings.fileServicesTypes.anon.Flag
import typings.fileServicesTypes.anon.Recursive
import typings.fileServicesTypes.anon.WithFileTypes
import typings.fileServicesTypes.anon.`0`
import typings.fileServicesTypes.commonFsTypesMod.BufferEncoding
import typings.fileServicesTypes.commonFsTypesMod.CallbackFn
import typings.fileServicesTypes.commonFsTypesMod.CallbackFnVoid
import typings.fileServicesTypes.commonFsTypesMod.IDirectoryEntry
import typings.fileServicesTypes.commonFsTypesMod.IFileSystemStats
import typings.fileServicesTypes.commonFsTypesMod.ReadFileOptions
import typings.fileServicesTypes.commonFsTypesMod.RmOptions
import typings.fileServicesTypes.commonFsTypesMod.WriteFileOptions
import typings.fileServicesTypes.commonFsTypesMod.global.Buffer
import typings.fileServicesTypes.fileServicesTypesStrings.dir
import typings.fileServicesTypes.fileServicesTypesStrings.file
import typings.fileServicesTypes.fileServicesTypesStrings.junction
import typings.fileServicesTypes.pathMod.IFileSystemPath
import typings.fileServicesTypes.watchApiMod.IWatchService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseApiAsyncMod {
  
  @js.native
  trait IBaseFileSystemAsync
    extends StObject
       with IBaseFileSystemCallbackActions
       with IFileSystemPath {
    
    var caseSensitive: Boolean = js.native
    
    var promises: IBaseFileSystemPromiseActions = js.native
    
    var watchService: IWatchService = js.native
  }
  
  @js.native
  trait IBaseFileSystemCallbackActions extends StObject {
    
    /**
      * Copy `sourcePath` to `destinationPath`.
      * By default, if destination already exists, it will be overwritten.
      *
      * @param flags passing `FileSystemConstants.COPYFILE_EXCL` will cause operation to fail if destination exists.
      */
    def copyFile(sourcePath: String, destinationPath: String, callback: CallbackFnVoid): Unit = js.native
    def copyFile(sourcePath: String, destinationPath: String, flags: Double, callback: CallbackFnVoid): Unit = js.native
    
    /**
      * Check if a path points to an existing file/directory/link.
      *
      * @param path possible file path.
      * @param statFn optional custom stat function (e.g. lstat to detect links).
      */
    def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /**
      * Get path's `IFileSystemStats`. Does not dereference symbolic links.
      */
    def lstat(path: String, callback: CallbackFn[IFileSystemStats]): Unit = js.native
    
    /**
      * Create a directory.
      */
    def mkdir(filePath: String, callback: CallbackFnVoid): Unit = js.native
    def mkdir(filePath: String, options: Recursive, callback: CallbackFnVoid): Unit = js.native
    
    def readFile(path: String, callback: CallbackFn[Buffer]): Unit = js.native
    def readFile(path: String, options: Null, callback: CallbackFn[Buffer]): Unit = js.native
    def readFile(path: String, options: Unit, callback: CallbackFn[Buffer | String]): Unit = js.native
    /**
      * Read the entire contents of a file.
      */
    def readFile(path: String, options: Encoding, callback: CallbackFn[Buffer]): Unit = js.native
    def readFile(path: String, options: Flag, callback: CallbackFn[String]): Unit = js.native
    def readFile(path: String, options: BufferEncoding, callback: CallbackFn[String]): Unit = js.native
    def readFile(path: String, options: ReadFileOptions, callback: CallbackFn[String | Buffer]): Unit = js.native
    
    /**
      * Read the names of items in a directory.
      */
    def readdir(directoryPath: String, callback: CallbackFn[js.Array[String]]): Unit = js.native
    def readdir(directoryPath: String, options: Null, callback: CallbackFn[js.Array[String]]): Unit = js.native
    def readdir(directoryPath: String, options: Unit, callback: CallbackFn[js.Array[String]]): Unit = js.native
    def readdir(directoryPath: String, options: WithFileTypes, callback: CallbackFn[js.Array[String]]): Unit = js.native
    def readdir(directoryPath: String, options: `0`, callback: CallbackFn[js.Array[IDirectoryEntry]]): Unit = js.native
    def readdir(directoryPath: String, options: BufferEncoding, callback: CallbackFn[js.Array[String]]): Unit = js.native
    
    /**
      * Read value of a symbolic link.
      */
    def readlink(path: String, callback: CallbackFn[String]): Unit = js.native
    
    /**
      * Gets the canonicalized absolute pathname.
      * If path is linked, returns the actual target path.
      */
    def realpath(path: String, callback: CallbackFn[String]): Unit = js.native
    
    /**
      * Rename (move) a file or a directory
      */
    def rename(sourcePath: String, destinationPath: String, callback: CallbackFnVoid): Unit = js.native
    
    /**
      * Delete a directory.
      */
    def rmdir(filePath: String, callback: CallbackFnVoid): Unit = js.native
    
    /**
      * Get path's `IFileSystemStats`.
      */
    def stat(path: String, callback: CallbackFn[IFileSystemStats]): Unit = js.native
    
    /**
      * Delete a name and possibly the file it refers to.
      */
    def unlink(filePath: String, callback: CallbackFnVoid): Unit = js.native
    
    def writeFile(path: String, data: String, callback: CallbackFnVoid): Unit = js.native
    /**
      * Write data to a file, replacing the file if already exists.
      * `encoding` is used when a string `content` (not `Buffer`) was provided (with default 'utf8').
      */
    def writeFile(path: String, data: String, options: WriteFileOptions, callback: CallbackFnVoid): Unit = js.native
    def writeFile(path: String, data: js.typedarray.Uint8Array, callback: CallbackFnVoid): Unit = js.native
    def writeFile(path: String, data: js.typedarray.Uint8Array, options: WriteFileOptions, callback: CallbackFnVoid): Unit = js.native
  }
  
  @js.native
  trait IBaseFileSystemPromiseActions extends StObject {
    
    /**
      * Copy `sourcePath` to `destinationPath`.
      * By default, if destination already exists, it will be overwritten.
      *
      * @param flags passing `FileSystemConstants.COPYFILE_EXCL` will cause operation to fail if destination exists.
      */
    def copyFile(sourcePath: String, destinationPath: String): js.Promise[Unit] = js.native
    def copyFile(sourcePath: String, destinationPath: String, flags: Double): js.Promise[Unit] = js.native
    
    /**
      * Check if a path points to an existing file/directory/link.
      *
      * @param path possible file path.
      * @param statFn optional custom stat function (e.g. lstat to detect links).
      */
    def exists(path: String): js.Promise[Boolean] = js.native
    
    /**
      * Get path's `IFileSystemStats`. Does not dereference symbolic links.
      */
    def lstat(path: String): js.Promise[IFileSystemStats] = js.native
    
    /**
      * Create a directory.
      */
    def mkdir(directoryPath: String): js.Promise[js.UndefOr[String]] = js.native
    def mkdir(directoryPath: String, options: Recursive): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * Read the entire contents of a file.
      */
    def readFile(path: String): js.Promise[Buffer] = js.native
    def readFile(path: String, options: Encoding): js.Promise[Buffer] = js.native
    def readFile(path: String, options: Flag): js.Promise[String] = js.native
    def readFile(path: String, options: BufferEncoding): js.Promise[String] = js.native
    def readFile(path: String, options: ReadFileOptions): js.Promise[String | Buffer] = js.native
    
    /**
      * Read the names of items in a directory.
      */
    def readdir(directoryPath: String): js.Promise[js.Array[String]] = js.native
    def readdir(directoryPath: String, options: EncodingWithFileTypes): js.Promise[js.Array[String]] = js.native
    def readdir(directoryPath: String, options: `0`): js.Promise[js.Array[IDirectoryEntry]] = js.native
    def readdir(directoryPath: String, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    
    /**
      * Read value of a symbolic link.
      */
    def readlink(path: String): js.Promise[String] = js.native
    
    /**
      * Gets the canonicalized absolute pathname.
      * If path is linked, returns the actual target path.
      */
    def realpath(path: String): js.Promise[String] = js.native
    
    /**
      * Rename (move) a file or a directory
      */
    def rename(sourcePath: String, destinationPath: String): js.Promise[Unit] = js.native
    
    /**
      * Removes files and directories.
      */
    def rm(path: String): js.Promise[Unit] = js.native
    def rm(path: String, options: RmOptions): js.Promise[Unit] = js.native
    
    /**
      * Delete a directory.
      */
    def rmdir(directoryPath: String): js.Promise[Unit] = js.native
    
    /**
      * Get path's `IFileSystemStats`.
      */
    def stat(path: String): js.Promise[IFileSystemStats] = js.native
    
    /**
      * Creates a symbolic link for `target` at `path`. default type is 'file'.
      */
    def symlink(target: String, path: String): js.Promise[Unit] = js.native
    def symlink(target: String, path: String, `type`: dir | file | junction): js.Promise[Unit] = js.native
    
    /**
      * Delete a name and possibly the file it refers to.
      */
    def unlink(filePath: String): js.Promise[Unit] = js.native
    
    /**
      * Write data to a file, replacing the file if already exists.
      * `encoding` is used when a string `content` (not `Buffer`) was provided (with default 'utf8').
      */
    def writeFile(path: String, data: String): js.Promise[Unit] = js.native
    def writeFile(path: String, data: String, options: WriteFileOptions): js.Promise[Unit] = js.native
    def writeFile(path: String, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(path: String, data: js.typedarray.Uint8Array, options: WriteFileOptions): js.Promise[Unit] = js.native
  }
}
