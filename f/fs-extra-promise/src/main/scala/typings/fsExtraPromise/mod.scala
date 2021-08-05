package typings.fsExtraPromise

import org.scalablytyped.runtime.StringDictionary
import typings.fsExtra.anon.BufferBytesRead
import typings.fsExtra.anon.BufferDataView
import typings.fsExtra.anon.BufferDataViewBytesWrittenNumber
import typings.fsExtra.anon.BufferFloat32Array
import typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferFloat64Array
import typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt16Array
import typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt32Array
import typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt8Array
import typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferString
import typings.fsExtra.anon.BufferUint16Array
import typings.fsExtra.anon.BufferUint32Array
import typings.fsExtra.anon.BytesRead
import typings.fsExtra.anon.BytesWrittenNumber
import typings.fsExtra.anon.Encoding
import typings.fsExtra.anon.EncodingWithFileTypes
import typings.fsExtra.anon.WithFileTypes
import typings.fsExtra.anon.`0`
import typings.fsExtra.anon.`1`
import typings.fsExtra.mod.CopyOptions
import typings.fsExtra.mod.CopyOptionsSync
import typings.fsExtra.mod.EnsureOptions
import typings.fsExtra.mod.Mode
import typings.fsExtra.mod.MoveOptions
import typings.fsExtra.mod.ReadOptions
import typings.fsExtra.mod.SymlinkType
import typings.fsExtra.mod.WriteOptions
import typings.fsExtra.mod.WritevResult
import typings.fsExtraPromise.fsExtraPromiseStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.AutoClose
import typings.node.anon.BaseEncodingOptionsflagOp
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.BaseEncodingOptionsmodeMo
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.BufferBytesWritten
import typings.node.anon.BytesWritten
import typings.node.anon.EmitClose
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.Interval
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.Persistent
import typings.node.anon.Recursive
import typings.node.anon.`3`
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.promisesMod.FileHandle
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.DataView
import typings.std.Date
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-extra-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs-extra-promise", "BigIntStats")
  @js.native
  class BigIntStats ()
    extends typings.fsExtra.mod.BigIntStats
  
  @JSImport("fs-extra-promise", "Dir")
  @js.native
  class Dir ()
    extends typings.fsExtra.mod.Dir
  
  @JSImport("fs-extra-promise", "Dirent")
  @js.native
  class Dirent ()
    extends typings.fsExtra.mod.Dirent
  
  @JSImport("fs-extra-promise", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.fsExtra.mod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-extra-promise", "Stats")
  @js.native
  class Stats ()
    extends typings.fsExtra.mod.Stats
  
  @JSImport("fs-extra-promise", "WriteStream")
  @js.native
  class WriteStream ()
    extends typings.fsExtra.mod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def access(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def access(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendFile(file: Double, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(file: Double, data: js.Any, options: Encoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(
    file: Double,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(file: PathLike, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(file: PathLike, data: js.Any, options: Encoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(
    file: PathLike,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendFileAsync(filename: String, data: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def appendFileAsync(filename: String, data: js.Any, option: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def appendFileAsync(filename: String, data: js.Any, option: WriteOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def appendFileSync(file: Double, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: Double, data: Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: Double, data: Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: PathLike, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: PathLike, data: Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(file: PathLike, data: Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def chmod(path: PathLike, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmodAsync(path: String, mode: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def chmodAsync(path: String, mode: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def chmodSync(path: PathLike, mode: typings.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def chown(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chownAsync(path: String, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chownAsync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def close(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def close(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def closeAsync(fd: Double): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object constants {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    @JSImport("fs-extra-promise", "constants.COPYFILE_EXCL")
    @js.native
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    @JSImport("fs-extra-promise", "constants.COPYFILE_FICLONE")
    @js.native
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    @JSImport("fs-extra-promise", "constants.COPYFILE_FICLONE_FORCE")
    @js.native
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    @JSImport("fs-extra-promise", "constants.F_OK")
    @js.native
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    @JSImport("fs-extra-promise", "constants.O_APPEND")
    @js.native
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    @JSImport("fs-extra-promise", "constants.O_CREAT")
    @js.native
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    @JSImport("fs-extra-promise", "constants.O_DIRECT")
    @js.native
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    @JSImport("fs-extra-promise", "constants.O_DIRECTORY")
    @js.native
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    @JSImport("fs-extra-promise", "constants.O_DSYNC")
    @js.native
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    @JSImport("fs-extra-promise", "constants.O_EXCL")
    @js.native
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    @JSImport("fs-extra-promise", "constants.O_NOATIME")
    @js.native
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    @JSImport("fs-extra-promise", "constants.O_NOCTTY")
    @js.native
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    @JSImport("fs-extra-promise", "constants.O_NOFOLLOW")
    @js.native
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    @JSImport("fs-extra-promise", "constants.O_NONBLOCK")
    @js.native
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    @JSImport("fs-extra-promise", "constants.O_RDONLY")
    @js.native
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    @JSImport("fs-extra-promise", "constants.O_RDWR")
    @js.native
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    @JSImport("fs-extra-promise", "constants.O_SYMLINK")
    @js.native
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    @JSImport("fs-extra-promise", "constants.O_SYNC")
    @js.native
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    @JSImport("fs-extra-promise", "constants.O_TRUNC")
    @js.native
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    @JSImport("fs-extra-promise", "constants.O_WRONLY")
    @js.native
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    @JSImport("fs-extra-promise", "constants.R_OK")
    @js.native
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    @JSImport("fs-extra-promise", "constants.S_IFBLK")
    @js.native
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    @JSImport("fs-extra-promise", "constants.S_IFCHR")
    @js.native
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    @JSImport("fs-extra-promise", "constants.S_IFDIR")
    @js.native
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    @JSImport("fs-extra-promise", "constants.S_IFIFO")
    @js.native
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    @JSImport("fs-extra-promise", "constants.S_IFLNK")
    @js.native
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    @JSImport("fs-extra-promise", "constants.S_IFMT")
    @js.native
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    @JSImport("fs-extra-promise", "constants.S_IFREG")
    @js.native
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    @JSImport("fs-extra-promise", "constants.S_IFSOCK")
    @js.native
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    @JSImport("fs-extra-promise", "constants.S_IRGRP")
    @js.native
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    @JSImport("fs-extra-promise", "constants.S_IROTH")
    @js.native
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    @JSImport("fs-extra-promise", "constants.S_IRUSR")
    @js.native
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    @JSImport("fs-extra-promise", "constants.S_IRWXG")
    @js.native
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    @JSImport("fs-extra-promise", "constants.S_IRWXO")
    @js.native
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    @JSImport("fs-extra-promise", "constants.S_IRWXU")
    @js.native
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    @JSImport("fs-extra-promise", "constants.S_IWGRP")
    @js.native
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    @JSImport("fs-extra-promise", "constants.S_IWOTH")
    @js.native
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    @JSImport("fs-extra-promise", "constants.S_IWUSR")
    @js.native
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    @JSImport("fs-extra-promise", "constants.S_IXGRP")
    @js.native
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    @JSImport("fs-extra-promise", "constants.S_IXOTH")
    @js.native
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    @JSImport("fs-extra-promise", "constants.S_IXUSR")
    @js.native
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    @JSImport("fs-extra-promise", "constants.UV_FS_O_FILEMAP")
    @js.native
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    @JSImport("fs-extra-promise", "constants.W_OK")
    @js.native
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    @JSImport("fs-extra-promise", "constants.X_OK")
    @js.native
    val X_OK: Double = js.native
  }
  
  inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copy(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copy(src: String, dest: String, options: CopyOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyAsync(src: String, dest: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def copyAsync(
    src: String,
    dest: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CopyFilter */ js.Any
  ): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def copyAsync(src: String, dest: String, options: CopyOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def copyFile(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyFile(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyFile(src: String, dest: String, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyFile(src: String, dest: String, flags: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copySync(src: String, dest: String, options: CopyOptionsSync): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def createFile(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFileAsync(file: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def createFileSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createLink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs-extra-promise", "createLinkSync")
  @js.native
  val createLinkSync: js.Function2[/* src */ String, /* dest */ String, Unit] = js.native
  
  inline def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: String): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: AutoClose): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  
  inline def createSymlink(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSymlink_Promise(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: EmitClose): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  
  inline def emptyDirSync_(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def emptyDir_(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def emptyDir_(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def emptydir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def emptydir(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs-extra-promise", "emptydirSync")
  @js.native
  val emptydirSync: js.Function1[/* path */ String, Unit] = js.native
  
  inline def ensureDir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: EnsureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: EnsureOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureDirAsync(path: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def ensureDirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ensureDirSync(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDirSync(path: String, options: EnsureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureDir_Promise(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ensureDir_Promise(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureDir_Promise(path: String, options: EnsureOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def ensureFile(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ensureFile(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureFileSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ensureLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureLink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureLinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureSymlink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureSymlinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def existsAsync(path: String): typings.bluebird.mod.^[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("existsAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Boolean]]
  
  inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fchmod(fd: Double, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def fchmod(fd: Double, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchmodAsync(fd: Double, mode: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodAsync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def fchmodAsync(fd: Double, mode: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodAsync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def fchmodSync(fd: Double, mode: typings.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchownAsync(fd: Double, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownAsync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fdatasync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def fdatasync(fd: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fstat(fd: Double): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
  inline def fstat(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fstatAsync(fd: Double): typings.bluebird.mod.^[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[typings.node.fsMod.Stats]]
  
  inline def fstatSync(fd: Double): typings.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  
  inline def fsync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def fsync(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fsyncAsync(fd: Double): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ftruncate(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ftruncate(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ftruncate(fd: Double, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ftruncate(fd: Double, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimes(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(fd: Double, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def futimesAsync(fd: Double, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesAsync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def futimesSync(fd: Double, atime: String, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: String, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: String, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Double, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Date, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDirectory(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isDirectory(path: String, callback: js.Function2[/* err */ Error, /* isDirectory */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDirectoryAsync(path: String): typings.bluebird.mod.^[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectoryAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Boolean]]
  
  inline def isDirectorySync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectorySync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lchmod(path: PathLike, mode: typings.node.fsMod.Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchmodAsync(path: String, mode: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def lchmodAsync(path: String, mode: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def lchmodSync(path: PathLike, mode: typings.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lchown(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchownAsync(path: String, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownAsync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def link(existingPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def linkAsync(srcpath: String, dstpath: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
  inline def lstat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lstatAsync(path: String): typings.bluebird.mod.^[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstatAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[typings.node.fsMod.Stats]]
  
  inline def lstatSync(path: PathLike): typings.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  
  inline def lutimes(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: String, mtime: Date, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Double, mtime: Date, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Date, mtime: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Date, mtime: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimes(path: PathLike, atime: Date, mtime: Date, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: String, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Double, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Date, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Date, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lutimesSync(path: PathLike, atime: Date, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: PathLike, options: Null, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: PathLike, options: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirAsync(path: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def mkdirAsync(path: String, mode: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def mkdirAsync(path: String, mode: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: typings.node.fsMod.Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirSync_Unit(path: PathLike, options: typings.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirp(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdirp(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirpAsync(dir: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def mkdirpAsync(dir: String, options: MkdirOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def mkdirpSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mkdirs(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdirs(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirsAsync(dir: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def mkdirsAsync(dir: String, options: MkdirOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def mkdirsSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mkdtemp(prefix: String, callback: js.Function2[/* err */ ErrnoException, /* folder */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdtempAsync(prefix: String, options: String): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempAsync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  inline def mkdtempAsync(prefix: String, options: typings.fsExtraPromise.anon.Encoding): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempAsync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  
  inline def mkdtempSync(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mkdtempSync(prefix: String, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def mkdtempSync(prefix: String, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mkdtempSync(prefix: String, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def mkdtempSync_Union(prefix: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def mkdtempSync_Union(prefix: String, options: BaseEncodingOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def move(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def move(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def move(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveAsync(src: String, dest: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def moveAsync(src: String, dest: String, options: MoveOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def moveSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def moveSync(src: String, dest: String, options: MoveOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(path: PathLike, flags: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def open(
    path: PathLike,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(path: PathLike, flags: String, mode: Mode): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def open(
    path: PathLike,
    flags: String,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(path: PathLike, flags: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def open(
    path: PathLike,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def open(
    path: PathLike,
    flags: Double,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openAsync(path: String, flags: String): typings.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAsync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Double]]
  inline def openAsync(path: String, flags: String, mode: String): typings.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAsync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Double]]
  
  inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def openSync(path: PathLike, flags: OpenMode, mode: typings.node.fsMod.Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def opendir(path: String): js.Promise[typings.node.fsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
  inline def opendir(
    path: String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def opendir(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
  inline def opendir(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def opendirSync(path: String): typings.node.fsMod.Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
  inline def opendirSync(path: String, options: OpenDirOptions): typings.node.fsMod.Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]
  
  inline def outputFile(file: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: js.Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(
    file: String,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputFileAsync(file: String, data: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileAsync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def outputFileSync(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFileSync(file: String, data: js.Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFileSync(file: String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJSONAsync_(file: String, data: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONAsync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def outputJSONSync_(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJSONSync_(file: String, data: js.Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJSON_(file: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJSON_(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJSON_(file: String, data: js.Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJSON_(file: String, data: js.Any, options: WriteOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJson(file: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJson(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJson(file: String, data: js.Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJson(file: String, data: js.Any, options: WriteOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJsonAsync(file: String, data: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonAsync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def outputJsonSync(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJsonSync(file: String, data: js.Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pathExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def pathExists(path: String, callback: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pathExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object promises {
    
    @JSImport("fs-extra-promise", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    inline def appendFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    inline def chmod(path: PathLike, mode: typings.node.fsMod.Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation. The only
      * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
      * `dest` already exists.
      */
    inline def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param handle A `FileHandle`.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    inline def fchmod(handle: FileHandle, mode: typings.node.fsMod.Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(handle.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param handle A `FileHandle`.
      */
    inline def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(handle.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param handle A `FileHandle`.
      */
    inline def fdatasync(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param handle A `FileHandle`.
      */
    inline def fstat(handle: FileHandle): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param handle A `FileHandle`.
      */
    inline def fsync(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param handle A `FileHandle`.
      * @param len If not specified, defaults to `0`.
      */
    inline def ftruncate(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(handle.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    inline def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Date, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    inline def lchmod(path: PathLike, mode: typings.node.fsMod.Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
    
    /**
      * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
      * with the difference that if the path refers to a symbolic link, then the link is not
      * dereferenced: instead, the timestamps of the symbolic link itself are changed.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    inline def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def lutimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def mkdir(path: PathLike, options: typings.node.fsMod.Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def mkdtemp(prefix: String, options: BaseEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
      * supplied, defaults to `0o666`.
      */
    inline def open(path: PathLike, flags: String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: String, mode: typings.node.fsMod.Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: Double, mode: typings.node.fsMod.Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    
    inline def opendir(path: String): js.Promise[typings.node.fsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
    inline def opendir(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.fsMod.Dir]]
    
    /**
      * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If
      * `null`, data will be read from the current position.
      */
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
    
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    inline def readFile(path: PathLike, options: EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: PathLike, options: Flag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    inline def readFile(path: FileHandle, options: EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: FileHandle, options: Flag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    inline def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[typings.node.fsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.fsMod.Dirent]]]
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readdir(path: PathLike, options: typings.node.anon.Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
    
    inline def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
    
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    inline def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
      */
    inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
    
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    inline def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    inline def write(handle: FileHandle, string: String): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
    inline def write(handle: FileHandle, string: String, position: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
    inline def write(handle: FileHandle, string: String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
    inline def write(handle: FileHandle, string: String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
    inline def write(handle: FileHandle, string: String, position: Unit, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    inline def writeFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  inline def read(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataView]]
  inline def read(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataView]]
  inline def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32Array]]
  inline def read(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32Array]]
  inline def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64Array]]
  inline def read(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64Array]]
  inline def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16Array]]
  inline def read(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16Array]]
  inline def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32Array]]
  inline def read(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32Array]]
  inline def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8Array]]
  inline def read(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8Array]]
  inline def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesRead]]
  inline def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesRead]]
  inline def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint32Array]]
  inline def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint32Array]]
  inline def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.Buffer]]
  inline def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.Buffer]]
  inline def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
  inline def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
  inline def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[js.Tuple2[Double, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Tuple2[Double, Buffer]]]
  
  inline def readFile(file: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(file: Double, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: Double, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: Double,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: Double, options: typings.fsExtra.anon.EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: Double,
    options: typings.fsExtra.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: Double, options: typings.fsExtra.anon.Flag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: Double,
    options: typings.fsExtra.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(file: PathLike, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: PathLike, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: PathLike,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: PathLike, options: typings.fsExtra.anon.EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: PathLike,
    options: typings.fsExtra.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(file: PathLike, options: typings.fsExtra.anon.Flag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(
    file: PathLike,
    options: typings.fsExtra.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFileAsync(filename: String): typings.bluebird.mod.^[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Buffer]]
  inline def readFileAsync(filename: String, options: String): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  inline def readFileAsync(filename: String, options: ReadOptions): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  
  inline def readFileSync(path: Double): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readFileSync(path: Double, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def readFileSync(path: Double, options: EncodingBufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: Double, options: `3`): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readFileSync(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readFileSync(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: PathLike, options: `3`): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def readFileSync_Buffer(path: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def readFileSync_Buffer(path: PathLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def readJSONAsync_(file: String): typings.bluebird.mod.^[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONAsync")(file.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Any]]
  inline def readJSONAsync_(file: String, options: ReadOptions): typings.bluebird.mod.^[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Any]]
  
  inline def readJSONSync_(file: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readJSONSync_(file: String, options: ReadOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def readJSON_(file: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def readJSON_(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJSON_(file: String, options: ReadOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def readJSON_(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJson(file: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def readJson(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJson(file: String, options: ReadOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def readJson(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJsonAsync(file: String): typings.bluebird.mod.^[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonAsync")(file.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Any]]
  inline def readJsonAsync(file: String, options: ReadOptions): typings.bluebird.mod.^[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Any]]
  
  inline def readJsonSync(file: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readJsonSync(file: String, options: ReadOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdir(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdir(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  inline def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdir(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer | String]]]
  inline def readdir(path: PathLike, options: `1`): js.Promise[js.Array[typings.node.fsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.fsMod.Dirent]]]
  inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def readdirAsync(path: String): typings.bluebird.mod.^[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Array[String]]]
  
  inline def readdirSync(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
  inline def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
  inline def readdirSync(path: PathLike, options: typings.node.anon.Encoding): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  inline def readdirSync(path: PathLike, options: typings.node.anon.WithFileTypes): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  inline def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readlink(path: PathLike, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readlinkAsync(path: String): typings.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[String]]
  
  inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readlinkSync(path: PathLike, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def readlinkSync(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def realpath(path: PathLike, cache: StringDictionary[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def realpath(
    path: PathLike,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def realpath(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def realpathAsync(path: String): typings.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[String]]
  inline def realpathAsync(path: String, cache: StringDictionary[String]): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpathAsync")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  
  object realpathSync {
    
    inline def apply(path: PathLike): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(path: PathLike, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    inline def apply(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(path: PathLike, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("fs-extra-promise", "realpathSync")
    @js.native
    val ^ : js.Any = js.native
    
    inline def native(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def native(path: PathLike, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    inline def native(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def native(path: PathLike, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def native_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  }
  
  inline def remove(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAsync(dir: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def removeSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def rename(oldPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renameAsync(oldPath: String, newPath: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameAsync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rm(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rmdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdirAsync(path: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.fsMod.Stats]]
  inline def stat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statAsync(path: String): typings.bluebird.mod.^[typings.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("statAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[typings.node.fsMod.Stats]]
  
  inline def statSync(path: PathLike): typings.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  inline def statSync(path: PathLike, options: BigIntOptions): typings.node.fsMod.BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.BigIntStats]
  inline def statSync(path: PathLike, options: StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats]
  
  inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def symlink(target: PathLike, path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(
    target: PathLike,
    path: PathLike,
    `type`: Unit,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(target: PathLike, path: PathLike, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def symlink(
    target: PathLike,
    path: PathLike,
    `type`: SymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def symlinkAsync(srcpath: String, dstpath: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def symlinkAsync(srcpath: String, dstpath: String, `type`: Type): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def truncate(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def truncate(path: PathLike, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncateAsync(fd: Double, len: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateAsync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unlink(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlinkAsync(path: String): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkAsync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def utimesAsync(path: String, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesAsync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def utimesSync(path: PathLike, atime: String, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, js.Any]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: Unit,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: BufferEncoding): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: Persistent): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: Recursive): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  inline def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def watchFile(
    filename: PathLike,
    options: Unit,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watch_buffer(filename: PathLike, options: buffer): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  inline def write(fd: Double, buffer: DataView): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: DataView, offset: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: DataView, offset: Double, length: Unit, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: DataView, offset: Unit, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: DataView, offset: Unit, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: DataView, offset: Unit, length: Unit, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array, offset: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Float32Array, offset: Double, length: Unit, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array, offset: Unit, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array, offset: Unit, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float32Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array, offset: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Float64Array, offset: Double, length: Unit, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array, offset: Unit, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array, offset: Unit, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Float64Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array, offset: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int16Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array, offset: Unit, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int16Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array, offset: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int32Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array, offset: Unit, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int32Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array, offset: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Int8Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array, offset: Unit, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Int8Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint16Array): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint16Array, offset: Double, length: Unit, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint16Array, offset: Unit, length: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint16Array, offset: Unit, length: Double, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint16Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
  inline def write(fd: Double, buffer: Uint32Array): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint32Array, offset: Double, length: Unit, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint32Array, offset: Unit, length: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint32Array, offset: Unit, length: Double, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint32Array, offset: Unit, length: Unit, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
  inline def write(fd: Double, buffer: Uint8Array): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint8Array, offset: Double, length: Unit, position: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8Array, offset: Unit, length: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8Array, offset: Unit, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8Array, offset: Unit, length: Unit, position: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Unit, position: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Unit, length: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Unit, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, buffer: Uint8ClampedArray, offset: Unit, length: Unit, position: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.fsExtra.anon.BufferBytesWritten]]
  inline def write(fd: Double, data: js.Any): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
  inline def write(
    fd: Double,
    data: js.Any,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, data: js.Any, offset: Double): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
  inline def write(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, data: js.Any, offset: Double, encoding: String): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
  inline def write(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(fd: Double, data: js.Any, offset: Unit, encoding: String): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
  
  inline def writeAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[js.Tuple2[Double, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Tuple2[Double, Buffer]]]
  
  inline def writeFile(file: Double, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: Double, data: js.Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(
    file: Double,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: Double, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(
    file: Double,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: PathLike, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: PathLike, data: js.Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(
    file: PathLike,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(file: PathLike, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(
    file: PathLike,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileAsync(filename: String, data: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def writeFileAsync(filename: String, data: js.Any, options: String): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def writeFileAsync(filename: String, data: js.Any, options: WriteOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def writeFileSync(path: Double, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: Double, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: PathLike, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSONAsync_(file: String, `object`: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def writeJSONAsync_(file: String, `object`: js.Any, options: WriteOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def writeJSONSync_(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync_(file: String, `object`: js.Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSON_(file: String, `object`: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJSON_(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJSON_(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJson(file: String, `object`: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJson(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJson(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJsonAsync(file: String, `object`: js.Any): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  inline def writeJsonAsync(file: String, `object`: js.Any, options: WriteOptions): typings.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  inline def writeJsonSync(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJsonSync(file: String, `object`: js.Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writev(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[WritevResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WritevResult]]
  inline def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writev(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WritevResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WritevResult]]
  inline def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait MkdirOptions extends StObject {
    
    var fs: js.UndefOr[js.Any] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object MkdirOptions {
    
    inline def apply(): MkdirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MkdirOptions]
    }
    
    extension [Self <: MkdirOptions](x: Self) {
      
      inline def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
