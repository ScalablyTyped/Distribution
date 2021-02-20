package typings.fsExtraPromiseEs6

import typings.fsExtraPromiseEs6.anon.AutoClose
import typings.fsExtraPromiseEs6.anon.Curr
import typings.fsExtraPromiseEs6.anon.Encoding
import typings.fsExtraPromiseEs6.anon.Interval
import typings.fsExtraPromiseEs6.anon.Persistent
import typings.node.Buffer
import typings.node.fsMod.symlink.Type
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-extra-promise-es6", "ReadStream")
  @js.native
  class ReadStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-extra-promise-es6", "WriteStream")
  @js.native
  class WriteStream () extends Writable {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, option: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, option: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFile")
  @js.native
  def appendFile(filename: String, data: js.Any, option: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "appendFileAsync")
  @js.native
  def appendFileAsync(filename: String, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "appendFileAsync")
  @js.native
  def appendFileAsync(filename: String, data: js.Any, option: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "appendFileAsync")
  @js.native
  def appendFileAsync(filename: String, data: js.Any, option: OpenOptions): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any, option: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "appendFileSync")
  @js.native
  def appendFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "chmod")
  @js.native
  def chmod(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "chmod")
  @js.native
  def chmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "chmod")
  @js.native
  def chmod(path: String, mode: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "chmod")
  @js.native
  def chmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "chmodAsync")
  @js.native
  def chmodAsync(path: String, mode: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "chmodAsync")
  @js.native
  def chmodAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "chmodSync")
  @js.native
  def chmodSync(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "chmodSync")
  @js.native
  def chmodSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "chown")
  @js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "chown")
  @js.native
  def chown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "chownAsync")
  @js.native
  def chownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "chownSync")
  @js.native
  def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "close")
  @js.native
  def close(fd: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "close")
  @js.native
  def close(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "closeAsync")
  @js.native
  def closeAsync(fd: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "closeSync")
  @js.native
  def closeSync(fd: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "copy")
  @js.native
  def copy(src: String, dest: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "copy")
  @js.native
  def copy(
    src: String,
    dest: String,
    callback: js.Function1[(/* err */ Error) | (/* src */ String), Boolean | Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "copy")
  @js.native
  def copy(
    src: String,
    dest: String,
    filter: js.Function1[/* src */ String, Boolean],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "copyAsync")
  @js.native
  def copyAsync(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "copyAsync")
  @js.native
  def copyAsync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "copySync")
  @js.native
  def copySync(src: String, dest: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "copySync")
  @js.native
  def copySync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "createFile")
  @js.native
  def createFile(file: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "createFile")
  @js.native
  def createFile(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "createFileAsync")
  @js.native
  def createFileAsync(file: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "createFileSync")
  @js.native
  def createFileSync(file: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "createReadStream")
  @js.native
  def createReadStream(path: String): ReadStream = js.native
  @JSImport("fs-extra-promise-es6", "createReadStream")
  @js.native
  def createReadStream(path: String, options: AutoClose): ReadStream = js.native
  @JSImport("fs-extra-promise-es6", "createReadStream")
  @js.native
  def createReadStream(path: Buffer): ReadStream = js.native
  @JSImport("fs-extra-promise-es6", "createReadStream")
  @js.native
  def createReadStream(path: Buffer, options: AutoClose): ReadStream = js.native
  
  @JSImport("fs-extra-promise-es6", "createWriteStream")
  @js.native
  def createWriteStream(path: String): WriteStream = js.native
  @JSImport("fs-extra-promise-es6", "createWriteStream")
  @js.native
  def createWriteStream(path: String, options: Encoding): WriteStream = js.native
  @JSImport("fs-extra-promise-es6", "createWriteStream")
  @js.native
  def createWriteStream(path: Buffer): WriteStream = js.native
  @JSImport("fs-extra-promise-es6", "createWriteStream")
  @js.native
  def createWriteStream(path: Buffer, options: Encoding): WriteStream = js.native
  
  @JSImport("fs-extra-promise-es6", "ensureDir")
  @js.native
  def ensureDir(path: String, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "ensureDirAsync")
  @js.native
  def ensureDirAsync(path: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "ensureDirSync")
  @js.native
  def ensureDirSync(path: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "exists")
  @js.native
  def exists(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "exists")
  @js.native
  def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "existsAsync")
  @js.native
  def existsAsync(path: String): js.Promise[Boolean] = js.native
  
  @JSImport("fs-extra-promise-es6", "existsSync")
  @js.native
  def existsSync(path: String): Boolean = js.native
  
  @JSImport("fs-extra-promise-es6", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fchmodAsync")
  @js.native
  def fchmodAsync(fd: Double, mode: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "fchmodAsync")
  @js.native
  def fchmodAsync(fd: Double, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fchownAsync")
  @js.native
  def fchownAsync(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "fchownSync")
  @js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fstat")
  @js.native
  def fstat(fd: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fstat")
  @js.native
  def fstat(fd: Double, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fstatAsync")
  @js.native
  def fstatAsync(fd: Double): js.Promise[Stats] = js.native
  
  @JSImport("fs-extra-promise-es6", "fstatSync")
  @js.native
  def fstatSync(fd: Double): Stats = js.native
  
  @JSImport("fs-extra-promise-es6", "fsync")
  @js.native
  def fsync(fd: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "fsync")
  @js.native
  def fsync(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "fsyncAsync")
  @js.native
  def fsyncAsync(fd: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "fsyncSync")
  @js.native
  def fsyncSync(fd: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "futimesAsync")
  @js.native
  def futimesAsync(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "isDirectory")
  @js.native
  def isDirectory(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "isDirectory")
  @js.native
  def isDirectory(path: String, callback: js.Function2[/* err */ Error, /* isDirectory */ Boolean, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "isDirectoryAsync")
  @js.native
  def isDirectoryAsync(path: String): js.Promise[Boolean] = js.native
  
  @JSImport("fs-extra-promise-es6", "isDirectorySync")
  @js.native
  def isDirectorySync(path: String): Boolean = js.native
  
  @JSImport("fs-extra-promise-es6", "lchmod")
  @js.native
  def lchmod(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lchmod")
  @js.native
  def lchmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lchmod")
  @js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lchmod")
  @js.native
  def lchmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "lchmodAsync")
  @js.native
  def lchmodAsync(path: String, mode: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "lchmodAsync")
  @js.native
  def lchmodAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "lchmodSync")
  @js.native
  def lchmodSync(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lchmodSync")
  @js.native
  def lchmodSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "lchown")
  @js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lchown")
  @js.native
  def lchown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "lchownAsync")
  @js.native
  def lchownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "lchownSync")
  @js.native
  def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "link")
  @js.native
  def link(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "link")
  @js.native
  def link(srcpath: String, dstpath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "linkAsync")
  @js.native
  def linkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "linkSync")
  @js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "lstat")
  @js.native
  def lstat(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "lstat")
  @js.native
  def lstat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "lstatAsync")
  @js.native
  def lstatAsync(path: String): js.Promise[Stats] = js.native
  
  @JSImport("fs-extra-promise-es6", "lstatSync")
  @js.native
  def lstatSync(path: String): Stats = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String, mode: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdir")
  @js.native
  def mkdir(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirAsync")
  @js.native
  def mkdirAsync(path: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "mkdirAsync")
  @js.native
  def mkdirAsync(path: String, mode: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "mkdirAsync")
  @js.native
  def mkdirAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirSync")
  @js.native
  def mkdirSync(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdirSync")
  @js.native
  def mkdirSync(path: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdirSync")
  @js.native
  def mkdirSync(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirp")
  @js.native
  def mkdirp(dir: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdirp")
  @js.native
  def mkdirp(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirpAsync")
  @js.native
  def mkdirpAsync(dir: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirpSync")
  @js.native
  def mkdirpSync(dir: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirs")
  @js.native
  def mkdirs(dir: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "mkdirs")
  @js.native
  def mkdirs(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirsAsync")
  @js.native
  def mkdirsAsync(dir: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "mkdirsSync")
  @js.native
  def mkdirsSync(dir: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "open")
  @js.native
  def open(path: String, flags: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "open")
  @js.native
  def open(
    path: String,
    flags: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "open")
  @js.native
  def open(path: String, flags: String, mode: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "open")
  @js.native
  def open(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "openAsync")
  @js.native
  def openAsync(path: String, flags: String): js.Promise[Double] = js.native
  @JSImport("fs-extra-promise-es6", "openAsync")
  @js.native
  def openAsync(path: String, flags: String, mode: String): js.Promise[Double] = js.native
  
  @JSImport("fs-extra-promise-es6", "openSync")
  @js.native
  def openSync(path: String, flags: String): Double = js.native
  @JSImport("fs-extra-promise-es6", "openSync")
  @js.native
  def openSync(path: String, flags: String, mode: String): Double = js.native
  
  @JSImport("fs-extra-promise-es6", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "outputFileAsync")
  @js.native
  def outputFileAsync(file: String, data: js.Any): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "outputFileSync")
  @js.native
  def outputFileSync(file: String, data: js.Any): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "outputJSONAsync")
  @js.native
  def outputJSONAsync(file: String, data: js.Any): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "outputJSONSync")
  @js.native
  def outputJSONSync_(file: String, data: js.Any): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "outputJsonSync")
  @js.native
  def outputJsonSync(file: String, data: js.Any): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "read")
  @js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readAsync")
  @js.native
  def readAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = js.native
  
  @JSImport("fs-extra-promise-es6", "readFile")
  @js.native
  def readFile(filename: String, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readFile")
  @js.native
  def readFile(
    filename: String,
    options: String,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readFile")
  @js.native
  def readFile(
    filename: String,
    options: OpenOptions,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readFileAsync")
  @js.native
  def readFileAsync(filename: String): js.Promise[Buffer] = js.native
  @JSImport("fs-extra-promise-es6", "readFileAsync")
  @js.native
  def readFileAsync(filename: String, options: String): js.Promise[String] = js.native
  @JSImport("fs-extra-promise-es6", "readFileAsync")
  @js.native
  def readFileAsync(filename: String, options: OpenOptions): js.Promise[String] = js.native
  
  @JSImport("fs-extra-promise-es6", "readFileSync")
  @js.native
  def readFileSync(filename: String): Buffer = js.native
  @JSImport("fs-extra-promise-es6", "readFileSync")
  @js.native
  def readFileSync(filename: String, options: String): String = js.native
  @JSImport("fs-extra-promise-es6", "readFileSync")
  @js.native
  def readFileSync(filename: String, options: OpenOptions): String = js.native
  
  @JSImport("fs-extra-promise-es6", "readJSONAsync")
  @js.native
  def readJSONAsync(file: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "readJSONAsync")
  @js.native
  def readJSONAsync(file: String, options: OpenOptions): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "readJSONSync")
  @js.native
  def readJSONSync_(file: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJSONSync")
  @js.native
  def readJSONSync_(file: String, options: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readJSON")
  @js.native
  def readJSON_(file: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJSON")
  @js.native
  def readJSON_(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJSON")
  @js.native
  def readJSON_(file: String, options: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJSON")
  @js.native
  def readJSON_(file: String, options: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJSON")
  @js.native
  def readJSON_(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readJson")
  @js.native
  def readJson(file: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJson")
  @js.native
  def readJson(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJson")
  @js.native
  def readJson(file: String, options: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJson")
  @js.native
  def readJson(file: String, options: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJson")
  @js.native
  def readJson(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readJsonSync")
  @js.native
  def readJsonSync(file: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readJsonSync")
  @js.native
  def readJsonSync(file: String, options: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readSync")
  @js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  
  @JSImport("fs-extra-promise-es6", "readdir")
  @js.native
  def readdir(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readdir")
  @js.native
  def readdir(path: String, callback: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readdirAsync")
  @js.native
  def readdirAsync(path: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("fs-extra-promise-es6", "readdirSync")
  @js.native
  def readdirSync(path: String): js.Array[String] = js.native
  
  @JSImport("fs-extra-promise-es6", "readlink")
  @js.native
  def readlink(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "readlink")
  @js.native
  def readlink(path: String, callback: js.Function2[/* err */ Error, /* linkString */ String, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "readlinkAsync")
  @js.native
  def readlinkAsync(path: String): js.Promise[String] = js.native
  
  @JSImport("fs-extra-promise-es6", "realpath")
  @js.native
  def realpath(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "realpath")
  @js.native
  def realpath(
    path: String,
    cache: String,
    callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "realpath")
  @js.native
  def realpath(path: String, callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "realpathAsync")
  @js.native
  def realpathAsync(path: String): js.Promise[String] = js.native
  @JSImport("fs-extra-promise-es6", "realpathAsync")
  @js.native
  def realpathAsync(path: String, cache: String): js.Promise[String] = js.native
  
  @JSImport("fs-extra-promise-es6", "realpathSync")
  @js.native
  def realpathSync(path: String): String = js.native
  @JSImport("fs-extra-promise-es6", "realpathSync")
  @js.native
  def realpathSync(path: String, cache: Boolean): String = js.native
  
  @JSImport("fs-extra-promise-es6", "remove")
  @js.native
  def remove(dir: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "remove")
  @js.native
  def remove(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "removeAsync")
  @js.native
  def removeAsync(dir: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "removeSync")
  @js.native
  def removeSync(dir: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "rename")
  @js.native
  def rename(oldPath: String, newPath: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "rename")
  @js.native
  def rename(oldPath: String, newPath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "renameAsync")
  @js.native
  def renameAsync(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "renameSync")
  @js.native
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "rmdir")
  @js.native
  def rmdir(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "rmdir")
  @js.native
  def rmdir(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "rmdirAsync")
  @js.native
  def rmdirAsync(path: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "rmdirSync")
  @js.native
  def rmdirSync(path: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "stat")
  @js.native
  def stat(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "stat")
  @js.native
  def stat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "statAsync")
  @js.native
  def statAsync(path: String): js.Promise[Stats] = js.native
  
  @JSImport("fs-extra-promise-es6", "statSync")
  @js.native
  def statSync(path: String): Stats = js.native
  
  @JSImport("fs-extra-promise-es6", "symlink")
  @js.native
  def symlink(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "symlink")
  @js.native
  def symlink(
    srcpath: String,
    dstpath: String,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "symlink")
  @js.native
  def symlink(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "symlink")
  @js.native
  def symlink(srcpath: String, dstpath: String, `type`: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "symlinkAsync")
  @js.native
  def symlinkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "symlinkAsync")
  @js.native
  def symlinkAsync(srcpath: String, dstpath: String, `type`: Type): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "symlinkSync")
  @js.native
  def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "symlinkSync")
  @js.native
  def symlinkSync(srcpath: String, dstpath: String, `type`: Type): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "truncate")
  @js.native
  def truncate(fd: Double, len: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "truncate")
  @js.native
  def truncate(fd: Double, len: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "truncateAsync")
  @js.native
  def truncateAsync(fd: Double, len: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "truncateSync")
  @js.native
  def truncateSync(fd: Double, len: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "unlink")
  @js.native
  def unlink(path: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "unlink")
  @js.native
  def unlink(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "unlinkAsync")
  @js.native
  def unlinkAsync(path: String): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "unlinkSync")
  @js.native
  def unlinkSync(path: String): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "unwatchFile")
  @js.native
  def unwatchFile(filename: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "unwatchFile")
  @js.native
  def unwatchFile(filename: String, listener: Stats): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "utimes")
  @js.native
  def utimes(path: String, atime: Double, mtime: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "utimes")
  @js.native
  def utimes(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "utimesAsync")
  @js.native
  def utimesAsync(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "utimesSync")
  @js.native
  def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "watch")
  @js.native
  def watch(filename: String): FSWatcher = js.native
  @JSImport("fs-extra-promise-es6", "watch")
  @js.native
  def watch(
    filename: String,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
  @JSImport("fs-extra-promise-es6", "watch")
  @js.native
  def watch(filename: String, options: Persistent): FSWatcher = js.native
  @JSImport("fs-extra-promise-es6", "watch")
  @js.native
  def watch(
    filename: String,
    options: Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
  
  @JSImport("fs-extra-promise-es6", "watchFile")
  @js.native
  def watchFile(filename: String, listener: Curr): Unit = js.native
  @JSImport("fs-extra-promise-es6", "watchFile")
  @js.native
  def watchFile(filename: String, options: Interval, listener: Curr): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "write")
  @js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  @JSImport("fs-extra-promise-es6", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeAsync")
  @js.native
  def writeAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = js.native
  
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, options: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(filename: String, data: js.Any, options: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFile")
  @js.native
  def writeFile(
    filename: String,
    data: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeFileAsync")
  @js.native
  def writeFileAsync(filename: String, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "writeFileAsync")
  @js.native
  def writeFileAsync(filename: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "writeFileAsync")
  @js.native
  def writeFileAsync(filename: String, data: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any, option: String): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeFileSync")
  @js.native
  def writeFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJSONAsync")
  @js.native
  def writeJSONAsync_(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "writeJSONAsync")
  @js.native
  def writeJSONAsync_(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJSONSync")
  @js.native
  def writeJSONSync_(file: String, `object`: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJSONSync")
  @js.native
  def writeJSONSync_(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJSON")
  @js.native
  def writeJSON_(
    file: String,
    `object`: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJSON")
  @js.native
  def writeJSON_(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJson")
  @js.native
  def writeJson(
    file: String,
    `object`: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJson")
  @js.native
  def writeJson(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJsonAsync")
  @js.native
  def writeJsonAsync(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  @JSImport("fs-extra-promise-es6", "writeJsonAsync")
  @js.native
  def writeJsonAsync(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  
  @JSImport("fs-extra-promise-es6", "writeJsonSync")
  @js.native
  def writeJsonSync(file: String, `object`: js.Any): Unit = js.native
  @JSImport("fs-extra-promise-es6", "writeJsonSync")
  @js.native
  def writeJsonSync(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  
  @JSImport("fs-extra-promise-es6", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  
  @js.native
  trait FSWatcher extends StObject {
    
    def close(): Unit = js.native
  }
  object FSWatcher {
    
    @scala.inline
    def apply(close: () => Unit): FSWatcher = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[FSWatcher]
    }
    
    @scala.inline
    implicit class FSWatcherMutableBuilder[Self <: FSWatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OpenOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var flag: js.UndefOr[String] = js.native
  }
  object OpenOptions {
    
    @scala.inline
    def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    @scala.inline
    implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  type Stats = typings.node.fsMod.Stats
}
