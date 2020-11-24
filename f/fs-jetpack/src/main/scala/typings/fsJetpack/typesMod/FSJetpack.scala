package typings.fsJetpack.typesMod

import typings.fsJetpack.anon.FnCall
import typings.fsJetpack.anon.FnCallPathOptions
import typings.fsJetpack.fsJetpackStrings.buffer
import typings.fsJetpack.fsJetpackStrings.json
import typings.fsJetpack.fsJetpackStrings.jsonWithDates
import typings.fsJetpack.fsJetpackStrings.utf8
import typings.node.Buffer
import typings.node.anon.AutoClose
import typings.node.anon.EmitClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSJetpack extends js.Object {
  
  /**
    * Appends given data to the end of file. If file or any parent directory doesn't exist it will be created.
    *
    * @param path  the path to file.
    * @param data  data to append (can be `String` or `Buffer`).
    * @param options
    */
  def append(path: String, data: AppendData): Unit = js.native
  def append(path: String, data: AppendData, options: AppendOptions): Unit = js.native
  
  /**
    * Appends given data to the end of file. If file or any parent directory doesn't exist it will be created.
    *
    * @param path  the path to file.
    * @param data  data to append (can be `String` or `Buffer`).
    * @param options
    */
  def appendAsync(path: String, data: AppendData): js.Promise[Unit] = js.native
  def appendAsync(path: String, data: AppendData, options: AppendOptions): js.Promise[Unit] = js.native
  
  /**
    * Copies given file or directory (with everything inside).
    *
    * @param from path to location you want to copy.
    * @param to path to destination location, where the copy should be placed.
    * @param options
    */
  def copy(from: String, to: String): Unit = js.native
  def copy(from: String, to: String, options: CopyOptions): Unit = js.native
  
  /**
    * Copies given file or directory (with everything inside).
    *
    * @param from path to location you want to copy.
    * @param to path to destination location, where the copy should be placed.
    * @param options
    */
  def copyAsync(from: String, to: String): js.Promise[Unit] = js.native
  def copyAsync(from: String, to: String, options: CopyOptions): js.Promise[Unit] = js.native
  
  /**
    * Just an alias to vanilla [fs.createReadStream](http://nodejs.org/api/fs.html#fs_fs_createreadstream_path_options).
    */
  def createReadStream(path: PathLike): ReadStream = js.native
  /**
    * Just an alias to vanilla [fs.createReadStream](http://nodejs.org/api/fs.html#fs_fs_createreadstream_path_options).
    */
  def createReadStream(path: PathLike, options: String): ReadStream = js.native
  /**
    * Just an alias to vanilla [fs.createReadStream](http://nodejs.org/api/fs.html#fs_fs_createreadstream_path_options).
    */
  def createReadStream(path: PathLike, options: AutoClose): ReadStream = js.native
  /**
    * Just an alias to vanilla [fs.createReadStream](http://nodejs.org/api/fs.html#fs_fs_createreadstream_path_options).
    */
  @JSName("createReadStream")
  var createReadStream_Original: FnCall = js.native
  
  /**
    * Just an alias to vanilla [fs.createWriteStream](http://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options).
    */
  def createWriteStream(path: PathLike): WriteStream = js.native
  /**
    * Just an alias to vanilla [fs.createWriteStream](http://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options).
    */
  def createWriteStream(path: PathLike, options: String): WriteStream = js.native
  /**
    * Just an alias to vanilla [fs.createWriteStream](http://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options).
    */
  def createWriteStream(path: PathLike, options: EmitClose): WriteStream = js.native
  /**
    * Just an alias to vanilla [fs.createWriteStream](http://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options).
    */
  @JSName("createWriteStream")
  var createWriteStream_Original: FnCallPathOptions = js.native
  
  /**
    * Returns Current Working Directory (CWD) for this instance of jetpack, or creates new jetpack object with given path as its internal CWD.
    *
    * **Note:** fs-jetpack never changes value of `process.cwd()`, the CWD we are talking about here is internal value inside every jetpack instance.
    *
    *  @param path (optional) path (or many path parts) to become new CWD. Could be absolute, or relative. If relative path given new CWD will be resolved basing on current CWD of this jetpack instance.
    */
  def cwd(): String = js.native
  /**
    * Returns Current Working Directory (CWD) for this instance of jetpack, or creates new jetpack object with given path as its internal CWD.
    *
    * **Note:** fs-jetpack never changes value of `process.cwd()`, the CWD we are talking about here is internal value inside every jetpack instance.
    *
    *  @param path (optional) path (or many path parts) to become new CWD. Could be absolute, or relative. If relative path given new CWD will be resolved basing on current CWD of this jetpack instance.
    */
  def cwd(pathParts: String*): FSJetpack = js.native
  
  /**
    * Ensures that directory on given path exists and meets given criteria. If any criterium is not met it will be
    * after this call. If any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path path to directory to examine
    * @param criteria criteria to be met by the directory
    */
  def dir(path: String): FSJetpack = js.native
  def dir(path: String, criteria: DirCriteria): FSJetpack = js.native
  
  /**
    * Ensures that directory on given path exists and meets given criteria. If any criterium is not met it will be
    * after this call. If any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path path to directory to examine
    * @param criteria criteria to be met by the directory
    */
  def dirAsync(path: String): js.Promise[FSJetpack] = js.native
  def dirAsync(path: String, criteria: DirCriteria): js.Promise[FSJetpack] = js.native
  
  /**
    * Checks whether something exists on given `path`. This method returns values more specific than `true/false` to
    * protect from errors like "I was expecting directory, but it was a file".
    *
    * @param path path to look for
    *
    * Returns:
    *  - `false` if path doesn't exist.
    *  - `"dir"` if path is a directory.
    *  - `"file"` if path is a file.
    *  - `"other"` if none of the above.
    */
  def exists(path: String): ExistsResult = js.native
  
  /**
    * Checks whether something exists on given `path`. This method returns values more specific than `true/false` to
    * protect from errors like "I was expecting directory, but it was a file".
    *
    * @param path path to look for
    *
    * Returns:
    *  - `false` if path doesn't exist.
    *  - `"dir"` if path is a directory.
    *  - `"file"` if path is a file.
    *  - `"other"` if none of the above.
    */
  def existsAsync(path: String): js.Promise[ExistsResult] = js.native
  
  /**
    * Ensures that file exists and meets given criteria. If any criterium is not met it will be after this call. If
    * any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path the path to create
    * @param criteria criteria to be met by the file
    */
  def file(path: String): FSJetpack = js.native
  def file(path: String, criteria: FileOptions): FSJetpack = js.native
  
  /**
    * Ensures that file exists and meets given criteria. If any criterium is not met it will be after this call. If
    * any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path the path to create
    * @param criteria criteria to be met by the file
    */
  def fileAsync(path: String): js.Promise[FSJetpack] = js.native
  def fileAsync(path: String, criteria: FileOptions): js.Promise[FSJetpack] = js.native
  
  /**
    * Finds in directory specified by `path` all files fulfilling `searchOptions`. Returned paths are relative to current CWD of jetpack instance.
    * @param options search options
    */
  def find(): js.Array[String] = js.native
  def find(options: FindOptions): js.Array[String] = js.native
  /**
    * Finds in directory specified by `path` all files fulfilling `searchOptions`. Returned paths are relative to current CWD of jetpack instance.
    * @param startPath Path to start search in (all subdirectories will be searched).
    * @param options search options
    */
  def find(startPath: String): js.Array[String] = js.native
  def find(startPath: String, options: FindOptions): js.Array[String] = js.native
  
  /**
    * Finds in directory specified by `path` all files fulfilling `searchOptions`. Returned paths are relative to current CWD of jetpack instance.
    * @param options search options
    */
  def findAsync(): js.Promise[js.Array[String]] = js.native
  def findAsync(options: FindOptions): js.Promise[js.Array[String]] = js.native
  /**
    * Finds in directory specified by `path` all files fulfilling `searchOptions`. Returned paths are relative to current CWD of jetpack instance.
    * @param startPath Path to start search in (all subdirectories will be searched).
    * @param options search options
    */
  def findAsync(startPath: String): js.Promise[js.Array[String]] = js.native
  def findAsync(startPath: String, options: FindOptions): js.Promise[js.Array[String]] = js.native
  
  /**
    * Inspects given path (replacement for `fs.stat`). Returned object by default contains only very basic, not
    * platform-dependent properties (so you have something e.g. your unit tests can rely on), you can enable more
    * properties through options object.
    *
    * @param path path to inspect
    * @param options
    */
  def inspect(path: String): js.UndefOr[InspectResult] = js.native
  def inspect(path: String, options: InspectOptions): js.UndefOr[InspectResult] = js.native
  
  /**
    * Inspects given path (replacement for `fs.stat`). Returned object by default contains only very basic, not
    * platform-dependent properties (so you have something e.g. your unit tests can rely on), you can enable more
    * properties through options object.
    *
    * @param path path to inspect
    * @param options
    */
  def inspectAsync(path: String): js.Promise[js.UndefOr[InspectResult]] = js.native
  def inspectAsync(path: String, options: InspectOptions): js.Promise[js.UndefOr[InspectResult]] = js.native
  
  /**
    * Calls inspect recursively on given path so it creates a tree of all directories and sub-directories inside it.
    *
    * @param path starting path to inspect
    * @param options
    */
  def inspectTree(path: String): js.UndefOr[InspectTreeResult] = js.native
  def inspectTree(path: String, options: InspectTreeOptions): js.UndefOr[InspectTreeResult] = js.native
  
  /**
    * Calls inspect recursively on given path so it creates a tree of all directories and sub-directories inside it.
    *
    * @param path starting path to inspect
    * @param options
    */
  def inspectTreeAsync(path: String): js.Promise[js.UndefOr[InspectTreeResult]] = js.native
  def inspectTreeAsync(path: String, options: InspectTreeOptions): js.Promise[js.UndefOr[InspectTreeResult]] = js.native
  
  /**
    * Lists the contents of directory. Equivalent of `fs.readdir`.
    * @param path directory to list
    */
  def list(): js.UndefOr[js.Array[String]] = js.native
  def list(path: String): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Lists the contents of directory. Equivalent of `fs.readdir`.
    * @param path directory to list
    */
  def listAsync(): js.Promise[js.UndefOr[js.Array[String]]] = js.native
  def listAsync(path: String): js.Promise[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Moves given path to new location.
    *
    * @param from path
    * @param to path
    * @param options
    */
  def move(from: String, to: String): Unit = js.native
  def move(from: String, to: String, options: MoveOptions): Unit = js.native
  
  /**
    * Moves given path to new location.
    *
    * @param from path
    * @param to path
    * @param options
    */
  def moveAsync(from: String, to: String): js.Promise[Unit] = js.native
  def moveAsync(from: String, to: String, options: MoveOptions): js.Promise[Unit] = js.native
  
  def path(pathParts: String*): String = js.native
  
  /**
    * Reads content of file.
    *
    * @param path path to file
    * @param returnAs a custom return types
    */
  def read(path: String): js.UndefOr[String] = js.native
  
  /**
    * Reads content of file.
    *
    * @param path path to file
    * @param returnAs a custom return types
    */
  def readAsync(path: String): js.Promise[js.UndefOr[String]] = js.native
  @JSName("readAsync")
  def readAsync_buffer(path: String, returnAs: buffer): js.Promise[js.UndefOr[Buffer]] = js.native
  @JSName("readAsync")
  def readAsync_json(path: String, returnAs: json): js.Promise[js.UndefOr[_]] = js.native
  @JSName("readAsync")
  def readAsync_jsonWithDates(path: String, returnAs: jsonWithDates): js.Promise[js.UndefOr[_]] = js.native
  @JSName("readAsync")
  def readAsync_utf8(path: String, returnAs: utf8): js.Promise[js.UndefOr[String]] = js.native
  
  @JSName("read")
  def read_buffer(path: String, returnAs: buffer): js.UndefOr[Buffer] = js.native
  @JSName("read")
  def read_json(path: String, returnAs: json): js.UndefOr[js.Any] = js.native
  @JSName("read")
  def read_jsonWithDates(path: String, returnAs: jsonWithDates): js.UndefOr[js.Any] = js.native
  @JSName("read")
  def read_utf8(path: String, returnAs: utf8): js.UndefOr[String] = js.native
  
  /**
    * Deletes given path, no matter what it is (file, directory or non-empty directory). If path already doesn't exist
    * terminates gracefully without throwing, so you can use it as 'ensure path doesn't exist'.
    *
    * @param path path to delete
    */
  def remove(): Unit = js.native
  def remove(path: String): Unit = js.native
  
  /**
    * Deletes given path, no matter what it is (file, directory or non-empty directory). If path already doesn't exist
    * terminates gracefully without throwing, so you can use it as 'ensure path doesn't exist'.
    *
    * @param path path to delete
    */
  def removeAsync(): js.Promise[Unit] = js.native
  def removeAsync(path: String): js.Promise[Unit] = js.native
  
  /**
    * Renames given file or directory.
    *
    * @param path path to file being renamed
    * @param newName just the name of the thing being renamed
    * @param options
    */
  def rename(path: String, newName: String): Unit = js.native
  def rename(path: String, newName: String, options: RenameOptions): Unit = js.native
  
  /**
    * Renames given file or directory.
    *
    * @param path path to file being renamed
    * @param newName just the name of the thing being renamed
    * @param options
    */
  def renameAsync(path: String, newName: String): js.Promise[Unit] = js.native
  def renameAsync(path: String, newName: String, options: RenameOptions): js.Promise[Unit] = js.native
  
  /**
    * Creates symbolic link.
    *
    * @param symlinkValue path where symbolic link should point.
    * @param path  where symbolic link should be put.
    */
  def symlink(symlinkValue: String, path: String): Unit = js.native
  
  /**
    * Creates symbolic link.
    *
    * @param symlinkValue path where symbolic link should point.
    * @param path  where symbolic link should be put.
    */
  def symlinkAsync(symlinkValue: String, path: String): js.Promise[Unit] = js.native
  
  /**
    * Creates temporary directory.
    *
    * @param options
    */
  def tmpDir(): FSJetpack = js.native
  def tmpDir(options: TmpDirOptions): FSJetpack = js.native
  
  /**
    * Creates temporary directory.
    *
    * @param options
    */
  def tmpDirAsync(): js.Promise[FSJetpack] = js.native
  def tmpDirAsync(options: TmpDirOptions): js.Promise[FSJetpack] = js.native
  
  /**
    * Writes data to file. If any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path path to file
    * @param data data to be written. This could be `String`, `Buffer`, `Object` or `Array` (if last two used, the data will be outputted into file as JSON).
    * @param options
    */
  def write(path: String, data: WritableData): Unit = js.native
  def write(path: String, data: WritableData, options: WriteOptions): Unit = js.native
  
  /**
    * Writes data to file. If any parent directory in `path` doesn't exist it will be created (like `mkdir -p`).
    *
    * @param path path to file
    * @param data data to be written. This could be `String`, `Buffer`, `Object` or `Array` (if last two used, the data will be outputted into file as JSON).
    * @param options
    */
  def writeAsync(path: String, data: WritableData): js.Promise[Unit] = js.native
  def writeAsync(path: String, data: WritableData, options: WriteOptions): js.Promise[Unit] = js.native
}
