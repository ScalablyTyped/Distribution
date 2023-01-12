package typings.fsMock

import org.scalablytyped.runtime.StringDictionary
import typings.fsMock.anon.BufferSize
import typings.fsMock.anon.Encoding
import typings.fsMock.anon.EncodingFlag
import typings.fsMock.anon.Fd
import typings.fsMock.anon.Flag
import typings.fsMock.anon.Flags
import typings.fsMock.anon.Interval
import typings.fsMock.anon.Mode
import typings.fsMock.anon.Persistent
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.ReadStream
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-mock", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FS {
    def this(content: Any) = this()
    def this(content: Any, opts: Opts) = this()
  }
  
  @js.native
  trait FS extends StObject {
    
    def appendFile(filename: String, data: Any): Unit = js.native
    def appendFile(filename: String, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
    def appendFile(filename: String, data: Any, options: EncodingFlag): Unit = js.native
    def appendFile(
      filename: String,
      data: Any,
      options: EncodingFlag,
      callback: js.Function1[/* err */ ErrnoException, Unit]
    ): Unit = js.native
    def appendFile(filename: String, data: Any, options: Mode): Unit = js.native
    def appendFile(filename: String, data: Any, options: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
    
    def appendFileSync(filename: String, data: Any): Unit = js.native
    def appendFileSync(filename: String, data: Any, options: EncodingFlag): Unit = js.native
    def appendFileSync(filename: String, data: Any, options: Mode): Unit = js.native
    
    def chmod(path: String, mode: String): Unit = js.native
    def chmod(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def chmod(path: String, mode: Double): Unit = js.native
    def chmod(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def chmodSync(path: String, mode: String): Unit = js.native
    def chmodSync(path: String, mode: Double): Unit = js.native
    
    def chown(path: String, uid: Double, gid: Double): Unit = js.native
    def chown(
      path: String,
      uid: Double,
      gid: Double,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
    
    def close(fd: Double): Unit = js.native
    def close(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def closeSync(fd: Double): Unit = js.native
    
    def createReadStream(path: String): ReadStream = js.native
    def createReadStream(path: String, options: BufferSize): ReadStream = js.native
    def createReadStream(path: String, options: Fd): ReadStream = js.native
    
    def createWriteStream(path: String): WriteStream = js.native
    def createWriteStream(path: String, options: Flags): WriteStream = js.native
    
    def exists(path: String): Unit = js.native
    def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    def existsSync(path: String): Boolean = js.native
    
    def fchmod(fd: Double, mode: String): Unit = js.native
    def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def fchmod(fd: Double, mode: Double): Unit = js.native
    def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def fchmodSync(fd: Double, mode: String): Unit = js.native
    def fchmodSync(fd: Double, mode: Double): Unit = js.native
    
    def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
    def fchown(
      fd: Double,
      uid: Double,
      gid: Double,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
    
    def fstat(fd: Double): Unit = js.native
    def fstat(fd: Double, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, Any]): Unit = js.native
    
    def fstatSync(fd: Double): Stats = js.native
    
    def fsync(fd: Double): Unit = js.native
    def fsync(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def fsyncSync(fd: Double): Unit = js.native
    
    def ftruncate(fd: Double): Unit = js.native
    def ftruncate(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def ftruncate(fd: Double, len: Double): Unit = js.native
    def ftruncate(fd: Double, len: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def ftruncateSync(fd: Double): Unit = js.native
    def ftruncateSync(fd: Double, len: Double): Unit = js.native
    
    def futimes(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
    def futimes(
      fd: Double,
      atime: js.Date,
      mtime: js.Date,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    def futimes(fd: Double, atime: Double, mtime: Double): Unit = js.native
    def futimes(
      fd: Double,
      atime: Double,
      mtime: Double,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def futimesSync(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
    def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
    
    def lchmod(path: String, mode: String): Unit = js.native
    def lchmod(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def lchmod(path: String, mode: Double): Unit = js.native
    def lchmod(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def lchmodSync(path: String, mode: String): Unit = js.native
    def lchmodSync(path: String, mode: Double): Unit = js.native
    
    def lchown(path: String, uid: Double, gid: Double): Unit = js.native
    def lchown(
      path: String,
      uid: Double,
      gid: Double,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
    
    def link(srcpath: String, dstpath: String): Unit = js.native
    def link(
      srcpath: String,
      dstpath: String,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    def lstat(path: String): Unit = js.native
    def lstat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, Any]): Unit = js.native
    
    def lstatSync(path: String): Stats = js.native
    
    def mkdir(path: String): Unit = js.native
    def mkdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def mkdir(path: String, mode: String): Unit = js.native
    def mkdir(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def mkdir(path: String, mode: Double): Unit = js.native
    def mkdir(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def mkdirSync(path: String): Unit = js.native
    def mkdirSync(path: String, mode: String): Unit = js.native
    def mkdirSync(path: String, mode: Double): Unit = js.native
    
    def open(path: String, flags: String): Unit = js.native
    def open(
      path: String,
      flags: String,
      callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Any]
    ): Unit = js.native
    def open(path: String, flags: String, mode: String): Unit = js.native
    def open(
      path: String,
      flags: String,
      mode: String,
      callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Any]
    ): Unit = js.native
    def open(path: String, flags: String, mode: Double): Unit = js.native
    def open(
      path: String,
      flags: String,
      mode: Double,
      callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Any]
    ): Unit = js.native
    
    def openSync(path: String, flags: String): Double = js.native
    def openSync(path: String, flags: String, mode: String): Double = js.native
    def openSync(path: String, flags: String, mode: Double): Double = js.native
    
    def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
    def read(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
    ): Unit = js.native
    
    def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
    def readFile(
      filename: String,
      encoding: String,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Flag,
      callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
    ): Unit = js.native
    
    def readFileSync(filename: String): Buffer = js.native
    def readFileSync(filename: String, encoding: String): String = js.native
    def readFileSync(filename: String, options: Encoding): String = js.native
    def readFileSync(filename: String, options: Flag): Buffer = js.native
    
    def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    
    def readdir(path: String): Unit = js.native
    def readdir(path: String, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
    
    def readdirSync(path: String): js.Array[String] = js.native
    
    def readlink(path: String): Unit = js.native
    def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, Any]): Unit = js.native
    
    def readlinkSync(path: String): String = js.native
    
    def realpath(path: String): Unit = js.native
    def realpath(
      path: String,
      cache: StringDictionary[String],
      callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, Any]
    ): Unit = js.native
    def realpath(path: String, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, Any]): Unit = js.native
    
    def realpathSync(path: String): String = js.native
    def realpathSync(path: String, cache: StringDictionary[String]): String = js.native
    
    def rename(oldPath: String, newPath: String): Unit = js.native
    def rename(
      oldPath: String,
      newPath: String,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    def rmdir(path: String): Unit = js.native
    def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def rmdirSync(path: String): Unit = js.native
    
    def stat(path: String): Unit = js.native
    def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, Any]): Unit = js.native
    
    def statSync(path: String): Stats = js.native
    
    def symlink(srcpath: String, dstpath: String): Unit = js.native
    def symlink(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    def symlink(
      srcpath: String,
      dstpath: String,
      `type`: String,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    def symlink(
      srcpath: String,
      dstpath: String,
      `type`: Unit,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
    def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    def truncate(path: String): Unit = js.native
    def truncate(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    def truncate(path: String, len: Double): Unit = js.native
    def truncate(path: String, len: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def truncateSync(path: String): Unit = js.native
    def truncateSync(path: String, len: Double): Unit = js.native
    
    def unlink(path: String): Unit = js.native
    def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    def unlinkSync(path: String): Unit = js.native
    
    def unwatchFile(filename: String): Unit = js.native
    def unwatchFile(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
    
    def utimes(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
    def utimes(
      path: String,
      atime: js.Date,
      mtime: js.Date,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    def utimes(path: String, atime: Double, mtime: Double): Unit = js.native
    def utimes(
      path: String,
      atime: Double,
      mtime: Double,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def utimesSync(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
    def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
    
    def watch(filename: String): FSWatcher = js.native
    def watch(filename: String, listener: js.Function2[/* event */ String, /* filename */ String, Any]): FSWatcher = js.native
    def watch(filename: String, options: Persistent): FSWatcher = js.native
    def watch(
      filename: String,
      options: Persistent,
      listener: js.Function2[/* event */ String, /* filename */ String, Any]
    ): FSWatcher = js.native
    
    def watchFile(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
    def watchFile(
      filename: String,
      options: Interval,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = js.native
    
    def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
    def write(
      fd: Double,
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
    ): Unit = js.native
    
    def writeFile(filename: String, data: Any): Unit = js.native
    def writeFile(filename: String, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
    def writeFile(filename: String, data: Any, options: EncodingFlag): Unit = js.native
    def writeFile(
      filename: String,
      data: Any,
      options: EncodingFlag,
      callback: js.Function1[/* err */ ErrnoException, Unit]
    ): Unit = js.native
    def writeFile(filename: String, data: Any, options: Mode): Unit = js.native
    def writeFile(filename: String, data: Any, options: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
    
    def writeFileSync(filename: String, data: Any): Unit = js.native
    def writeFileSync(filename: String, data: Any, options: EncodingFlag): Unit = js.native
    def writeFileSync(filename: String, data: Any, options: Mode): Unit = js.native
    
    def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
  
  trait Opts extends StObject {
    
    var drives: js.UndefOr[js.Array[String]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var windows: js.UndefOr[Boolean] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setDrives(value: js.Array[String]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
      
      inline def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
      
      inline def setDrivesVarargs(value: String*): Self = StObject.set(x, "drives", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
