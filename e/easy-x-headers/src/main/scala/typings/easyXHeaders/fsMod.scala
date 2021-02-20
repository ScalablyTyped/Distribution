package typings.easyXHeaders

import org.scalablytyped.runtime.StringDictionary
import typings.easyXHeaders.NodeJS.ErrnoException
import typings.easyXHeaders.anon.BufferSize
import typings.easyXHeaders.anon.EncodingFlag
import typings.easyXHeaders.anon.Fd
import typings.easyXHeaders.anon.Flag
import typings.easyXHeaders.anon.Flags
import typings.easyXHeaders.anon.Interval
import typings.easyXHeaders.anon.Mode
import typings.easyXHeaders.anon.Persistent
import typings.easyXHeaders.anon.`1`
import typings.easyXHeaders.eventsMod.EventEmitter
import typings.easyXHeaders.streamMod.Readable
import typings.easyXHeaders.streamMod.Writable
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs", "F_OK")
  @js.native
  def F_OK: Double = js.native
  @scala.inline
  def F_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("fs", "R_OK")
  @js.native
  def R_OK: Double = js.native
  @scala.inline
  def R_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("fs", "W_OK")
  @js.native
  def W_OK: Double = js.native
  @scala.inline
  def W_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("fs", "X_OK")
  @js.native
  def X_OK: Double = js.native
  @scala.inline
  def X_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("fs", "access")
  @js.native
  def access(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("fs", "access")
  @js.native
  def access(path: String, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("fs", "accessSync")
  @js.native
  def accessSync(path: String): Unit = js.native
  @JSImport("fs", "accessSync")
  @js.native
  def accessSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(
    filename: String,
    data: js.Any,
    options: EncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, options: Mode): Unit = js.native
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(
    filename: String,
    data: js.Any,
    options: Mode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  @JSImport("fs", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any, options: Mode): Unit = js.native
  
  @JSImport("fs", "chmod")
  @js.native
  def chmod(path: String, mode: String): Unit = js.native
  @JSImport("fs", "chmod")
  @js.native
  def chmod(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "chmod")
  @js.native
  def chmod(path: String, mode: Double): Unit = js.native
  @JSImport("fs", "chmod")
  @js.native
  def chmod(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "chmodSync")
  @js.native
  def chmodSync(path: String, mode: String): Unit = js.native
  @JSImport("fs", "chmodSync")
  @js.native
  def chmodSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "chown")
  @js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs", "chown")
  @js.native
  def chown(
    path: String,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "chownSync")
  @js.native
  def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "close")
  @js.native
  def close(fd: Double): Unit = js.native
  @JSImport("fs", "close")
  @js.native
  def close(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "closeSync")
  @js.native
  def closeSync(fd: Double): Unit = js.native
  
  @JSImport("fs", "createReadStream")
  @js.native
  def createReadStream(path: String): ReadStream = js.native
  @JSImport("fs", "createReadStream")
  @js.native
  def createReadStream(path: String, options: BufferSize): ReadStream = js.native
  @JSImport("fs", "createReadStream")
  @js.native
  def createReadStream(path: String, options: Fd): ReadStream = js.native
  
  @JSImport("fs", "createWriteStream")
  @js.native
  def createWriteStream(path: String): WriteStream = js.native
  @JSImport("fs", "createWriteStream")
  @js.native
  def createWriteStream(path: String, options: Flags): WriteStream = js.native
  
  @JSImport("fs", "exists")
  @js.native
  def exists(path: String): Unit = js.native
  @JSImport("fs", "exists")
  @js.native
  def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("fs", "existsSync")
  @js.native
  def existsSync(path: String): Boolean = js.native
  
  @JSImport("fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String): Unit = js.native
  @JSImport("fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  @JSImport("fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  @JSImport("fs", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  
  @JSImport("fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs", "fchown")
  @js.native
  def fchown(
    fd: Double,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "fchownSync")
  @js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "fstat")
  @js.native
  def fstat(fd: Double): Unit = js.native
  @JSImport("fs", "fstat")
  @js.native
  def fstat(fd: Double, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
  
  @JSImport("fs", "fstatSync")
  @js.native
  def fstatSync(fd: Double): Stats = js.native
  
  @JSImport("fs", "fsync")
  @js.native
  def fsync(fd: Double): Unit = js.native
  @JSImport("fs", "fsync")
  @js.native
  def fsync(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "fsyncSync")
  @js.native
  def fsyncSync(fd: Double): Unit = js.native
  
  @JSImport("fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double): Unit = js.native
  @JSImport("fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double): Unit = js.native
  @JSImport("fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double): Unit = js.native
  @JSImport("fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  @JSImport("fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs", "futimes")
  @js.native
  def futimes(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  @JSImport("fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: Date): Unit = js.native
  @JSImport("fs", "futimes")
  @js.native
  def futimes(
    fd: Double,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("fs", "lchmod")
  @js.native
  def lchmod(path: String, mode: String): Unit = js.native
  @JSImport("fs", "lchmod")
  @js.native
  def lchmod(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "lchmod")
  @js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  @JSImport("fs", "lchmod")
  @js.native
  def lchmod(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "lchmodSync")
  @js.native
  def lchmodSync(path: String, mode: String): Unit = js.native
  @JSImport("fs", "lchmodSync")
  @js.native
  def lchmodSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "lchown")
  @js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs", "lchown")
  @js.native
  def lchown(
    path: String,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "lchownSync")
  @js.native
  def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "link")
  @js.native
  def link(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs", "link")
  @js.native
  def link(
    srcpath: String,
    dstpath: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "linkSync")
  @js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  
  @JSImport("fs", "lstat")
  @js.native
  def lstat(path: String): Unit = js.native
  @JSImport("fs", "lstat")
  @js.native
  def lstat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
  
  @JSImport("fs", "lstatSync")
  @js.native
  def lstatSync(path: String): Stats = js.native
  
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, mode: String): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "mkdirSync")
  @js.native
  def mkdirSync(path: String): Unit = js.native
  @JSImport("fs", "mkdirSync")
  @js.native
  def mkdirSync(path: String, mode: String): Unit = js.native
  @JSImport("fs", "mkdirSync")
  @js.native
  def mkdirSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "open")
  @js.native
  def open(path: String, flags: String): Unit = js.native
  @JSImport("fs", "open")
  @js.native
  def open(path: String, flags: String, callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]): Unit = js.native
  @JSImport("fs", "open")
  @js.native
  def open(path: String, flags: String, mode: String): Unit = js.native
  @JSImport("fs", "open")
  @js.native
  def open(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]
  ): Unit = js.native
  @JSImport("fs", "open")
  @js.native
  def open(path: String, flags: String, mode: Double): Unit = js.native
  @JSImport("fs", "open")
  @js.native
  def open(
    path: String,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]
  ): Unit = js.native
  
  @JSImport("fs", "openSync")
  @js.native
  def openSync(path: String, flags: String): Double = js.native
  @JSImport("fs", "openSync")
  @js.native
  def openSync(path: String, flags: String, mode: String): Double = js.native
  @JSImport("fs", "openSync")
  @js.native
  def openSync(path: String, flags: String, mode: Double): Double = js.native
  
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  @JSImport("fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "readFile")
  @js.native
  def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  @JSImport("fs", "readFile")
  @js.native
  def readFile(
    filename: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  @JSImport("fs", "readFile")
  @js.native
  def readFile(
    filename: String,
    options: Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  @JSImport("fs", "readFile")
  @js.native
  def readFile(
    filename: String,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "readFileSync")
  @js.native
  def readFileSync(filename: String): Buffer = js.native
  @JSImport("fs", "readFileSync")
  @js.native
  def readFileSync(filename: String, encoding: String): String = js.native
  @JSImport("fs", "readFileSync")
  @js.native
  def readFileSync(filename: String, options: Flag): String = js.native
  @JSImport("fs", "readFileSync")
  @js.native
  def readFileSync(filename: String, options: `1`): Buffer = js.native
  
  @JSImport("fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  
  @JSImport("fs", "readdir")
  @js.native
  def readdir(path: String): Unit = js.native
  @JSImport("fs", "readdir")
  @js.native
  def readdir(path: String, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
  
  @JSImport("fs", "readdirSync")
  @js.native
  def readdirSync(path: String): js.Array[String] = js.native
  
  @JSImport("fs", "readlink")
  @js.native
  def readlink(path: String): Unit = js.native
  @JSImport("fs", "readlink")
  @js.native
  def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  
  @JSImport("fs", "readlinkSync")
  @js.native
  def readlinkSync(path: String): String = js.native
  
  @JSImport("fs", "realpath")
  @js.native
  def realpath(path: String): Unit = js.native
  @JSImport("fs", "realpath")
  @js.native
  def realpath(
    path: String,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  @JSImport("fs", "realpath")
  @js.native
  def realpath(path: String, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  
  @JSImport("fs", "realpathSync")
  @js.native
  def realpathSync(path: String): String = js.native
  @JSImport("fs", "realpathSync")
  @js.native
  def realpathSync(path: String, cache: StringDictionary[String]): String = js.native
  
  @JSImport("fs", "rename")
  @js.native
  def rename(oldPath: String, newPath: String): Unit = js.native
  @JSImport("fs", "rename")
  @js.native
  def rename(
    oldPath: String,
    newPath: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "renameSync")
  @js.native
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  
  @JSImport("fs", "rmdir")
  @js.native
  def rmdir(path: String): Unit = js.native
  @JSImport("fs", "rmdir")
  @js.native
  def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "rmdirSync")
  @js.native
  def rmdirSync(path: String): Unit = js.native
  
  @JSImport("fs", "stat")
  @js.native
  def stat(path: String): Unit = js.native
  @JSImport("fs", "stat")
  @js.native
  def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
  
  @JSImport("fs", "statSync")
  @js.native
  def statSync(path: String): Stats = js.native
  
  @JSImport("fs", "symlink")
  @js.native
  def symlink(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def symlink(
    srcpath: String,
    dstpath: String,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def symlink(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def symlink(
    srcpath: String,
    dstpath: String,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "symlinkSync")
  @js.native
  def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs", "symlinkSync")
  @js.native
  def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  
  @JSImport("fs", "truncate")
  @js.native
  def truncate(path: String): Unit = js.native
  @JSImport("fs", "truncate")
  @js.native
  def truncate(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  @JSImport("fs", "truncate")
  @js.native
  def truncate(path: String, len: Double): Unit = js.native
  @JSImport("fs", "truncate")
  @js.native
  def truncate(path: String, len: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "truncateSync")
  @js.native
  def truncateSync(path: String): Unit = js.native
  @JSImport("fs", "truncateSync")
  @js.native
  def truncateSync(path: String, len: Double): Unit = js.native
  
  @JSImport("fs", "unlink")
  @js.native
  def unlink(path: String): Unit = js.native
  @JSImport("fs", "unlink")
  @js.native
  def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  
  @JSImport("fs", "unlinkSync")
  @js.native
  def unlinkSync(path: String): Unit = js.native
  
  @JSImport("fs", "unwatchFile")
  @js.native
  def unwatchFile(filename: String): Unit = js.native
  @JSImport("fs", "unwatchFile")
  @js.native
  def unwatchFile(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  
  @JSImport("fs", "utimes")
  @js.native
  def utimes(path: String, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs", "utimes")
  @js.native
  def utimes(
    path: String,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  @JSImport("fs", "utimes")
  @js.native
  def utimes(path: String, atime: Date, mtime: Date): Unit = js.native
  @JSImport("fs", "utimes")
  @js.native
  def utimes(
    path: String,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  
  @JSImport("fs", "utimesSync")
  @js.native
  def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs", "utimesSync")
  @js.native
  def utimesSync(path: String, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("fs", "watch")
  @js.native
  def watch(filename: String): FSWatcher = js.native
  @JSImport("fs", "watch")
  @js.native
  def watch(filename: String, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  @JSImport("fs", "watch")
  @js.native
  def watch(filename: String, options: Persistent): FSWatcher = js.native
  @JSImport("fs", "watch")
  @js.native
  def watch(
    filename: String,
    options: Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
  
  @JSImport("fs", "watchFile")
  @js.native
  def watchFile(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  @JSImport("fs", "watchFile")
  @js.native
  def watchFile(
    filename: String,
    options: Interval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "write")
  @js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  @JSImport("fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(
    filename: String,
    data: js.Any,
    options: EncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, options: Mode): Unit = js.native
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(
    filename: String,
    data: js.Any,
    options: Mode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("fs", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  @JSImport("fs", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any, options: Mode): Unit = js.native
  
  @JSImport("fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  
  @js.native
  trait FSWatcher extends EventEmitter {
    
    def close(): Unit = js.native
  }
  
  @js.native
  trait ReadStream extends Readable {
    
    def close(): Unit = js.native
  }
  
  @js.native
  trait Stats extends StObject {
    
    var atime: Date = js.native
    
    var blksize: Double = js.native
    
    var blocks: Double = js.native
    
    var ctime: Date = js.native
    
    var dev: Double = js.native
    
    var gid: Double = js.native
    
    var ino: Double = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var mode: Double = js.native
    
    var mtime: Date = js.native
    
    var nlink: Double = js.native
    
    var rdev: Double = js.native
    
    var size: Double = js.native
    
    var uid: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(
      atime: Date,
      blksize: Double,
      blocks: Double,
      ctime: Date,
      dev: Double,
      gid: Double,
      ino: Double,
      isBlockDevice: () => Boolean,
      isCharacterDevice: () => Boolean,
      isDirectory: () => Boolean,
      isFIFO: () => Boolean,
      isFile: () => Boolean,
      isSocket: () => Boolean,
      isSymbolicLink: () => Boolean,
      mode: Double,
      mtime: Date,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WriteStream extends Writable {
    
    var bytesWritten: Double = js.native
    
    def close(): Unit = js.native
  }
}
