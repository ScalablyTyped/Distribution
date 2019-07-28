package typings.fsDashExtraDashPromiseDashEs6.fsDashExtraDashPromiseDashEs6Mod

import typings.fsDashExtraDashPromiseDashEs6.Anon_AutoClose
import typings.fsDashExtraDashPromiseDashEs6.Anon_Curr
import typings.fsDashExtraDashPromiseDashEs6.Anon_Encoding
import typings.fsDashExtraDashPromiseDashEs6.Anon_Interval
import typings.fsDashExtraDashPromiseDashEs6.Anon_Persistent
import typings.node.Buffer
import typings.node.fsMod.symlinkNs.Type
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def appendFile(filename: String, data: js.Any): Unit = js.native
  def appendFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def appendFile(filename: String, data: js.Any, option: String): Unit = js.native
  def appendFile(filename: String, data: js.Any, option: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def appendFile(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def appendFile(filename: String, data: js.Any, option: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def appendFileAsync(filename: String, data: js.Any): js.Promise[Unit] = js.native
  def appendFileAsync(filename: String, data: js.Any, option: String): js.Promise[Unit] = js.native
  def appendFileAsync(filename: String, data: js.Any, option: OpenOptions): js.Promise[Unit] = js.native
  def appendFileSync(filename: String, data: js.Any): Unit = js.native
  def appendFileSync(filename: String, data: js.Any, option: String): Unit = js.native
  def appendFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def chmod(path: String, mode: String): Unit = js.native
  def chmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def chmod(path: String, mode: Double): Unit = js.native
  def chmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def chmodAsync(path: String, mode: String): js.Promise[Unit] = js.native
  def chmodAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmodSync(path: String, mode: String): Unit = js.native
  def chmodSync(path: String, mode: Double): Unit = js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  def chown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def chownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
  def close(fd: Double): Unit = js.native
  def close(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def closeAsync(fd: Double): js.Promise[Unit] = js.native
  def closeSync(fd: Double): Unit = js.native
  def copy(src: String, dest: String): Unit = js.native
  def copy(
    src: String,
    dest: String,
    callback: js.Function1[(/* err */ Error) | (/* src */ String), Boolean | Unit]
  ): Unit = js.native
  def copy(
    src: String,
    dest: String,
    filter: js.Function1[/* src */ String, Boolean],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def copyAsync(src: String, dest: String): js.Promise[Unit] = js.native
  def copyAsync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): js.Promise[Unit] = js.native
  def copySync(src: String, dest: String): Unit = js.native
  def copySync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): Unit = js.native
  def createFile(file: String): Unit = js.native
  def createFile(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def createFileAsync(file: String): js.Promise[Unit] = js.native
  def createFileSync(file: String): Unit = js.native
  def createReadStream(path: String): ReadStream = js.native
  def createReadStream(path: String, options: Anon_AutoClose): ReadStream = js.native
  def createReadStream(path: Buffer): ReadStream = js.native
  def createReadStream(path: Buffer, options: Anon_AutoClose): ReadStream = js.native
  def createWriteStream(path: String): WriteStream = js.native
  def createWriteStream(path: String, options: Anon_Encoding): WriteStream = js.native
  def createWriteStream(path: Buffer): WriteStream = js.native
  def createWriteStream(path: Buffer, options: Anon_Encoding): WriteStream = js.native
  def ensureDir(path: String, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ensureDirAsync(path: String): js.Promise[Unit] = js.native
  def ensureDirSync(path: String): Unit = js.native
  def exists(path: String): Unit = js.native
  def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  def existsAsync(path: String): js.Promise[Boolean] = js.native
  def existsSync(path: String): Boolean = js.native
  def fchmod(fd: Double, mode: String): Unit = js.native
  def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def fchmodAsync(fd: Double, mode: String): js.Promise[Unit] = js.native
  def fchmodAsync(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def fchownAsync(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  def fstat(fd: Double): Unit = js.native
  def fstat(fd: Double, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  def fstatAsync(fd: Double): js.Promise[Stats] = js.native
  def fstatSync(fd: Double): Stats = js.native
  def fsync(fd: Double): Unit = js.native
  def fsync(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def fsyncAsync(fd: Double): js.Promise[Unit] = js.native
  def fsyncSync(fd: Double): Unit = js.native
  def futimes(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def futimesAsync(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def isDirectory(path: String): Unit = js.native
  def isDirectory(path: String, callback: js.Function2[/* err */ Error, /* isDirectory */ Boolean, Unit]): Unit = js.native
  def isDirectoryAsync(path: String): js.Promise[Boolean] = js.native
  def isDirectorySync(path: String): Boolean = js.native
  def lchmod(path: String, mode: String): Unit = js.native
  def lchmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  def lchmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def lchmodAsync(path: String, mode: String): js.Promise[Unit] = js.native
  def lchmodAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  def lchmodSync(path: String, mode: String): Unit = js.native
  def lchmodSync(path: String, mode: Double): Unit = js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  def lchown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def lchownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
  def link(srcpath: String, dstpath: String): Unit = js.native
  def link(srcpath: String, dstpath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def linkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  def lstat(path: String): Unit = js.native
  def lstat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  def lstatAsync(path: String): js.Promise[Stats] = js.native
  def lstatSync(path: String): Stats = js.native
  def mkdir(path: String): Unit = js.native
  def mkdir(path: String, mode: String): Unit = js.native
  def mkdir(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  def mkdir(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mkdirAsync(path: String): js.Promise[Unit] = js.native
  def mkdirAsync(path: String, mode: String): js.Promise[Unit] = js.native
  def mkdirAsync(path: String, mode: Double): js.Promise[Unit] = js.native
  def mkdirSync(path: String): Unit = js.native
  def mkdirSync(path: String, mode: String): Unit = js.native
  def mkdirSync(path: String, mode: Double): Unit = js.native
  def mkdirp(dir: String): Unit = js.native
  def mkdirp(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mkdirpAsync(dir: String): js.Promise[Unit] = js.native
  def mkdirpSync(dir: String): Unit = js.native
  def mkdirs(dir: String): Unit = js.native
  def mkdirs(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mkdirsAsync(dir: String): js.Promise[Unit] = js.native
  def mkdirsSync(dir: String): Unit = js.native
  def open(path: String, flags: String): Unit = js.native
  def open(path: String, flags: String, mode: String): Unit = js.native
  def open(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = js.native
  def openAsync(path: String, flags: String): js.Promise[Double] = js.native
  def openAsync(path: String, flags: String, mode: String): js.Promise[Double] = js.native
  def openSync(path: String, flags: String): Double = js.native
  def openSync(path: String, flags: String, mode: String): Double = js.native
  def outputFile(file: String, data: js.Any): Unit = js.native
  def outputFile(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def outputFileAsync(file: String, data: js.Any): js.Promise[Unit] = js.native
  def outputFileSync(file: String, data: js.Any): Unit = js.native
  def outputJSON(file: String, data: js.Any): Unit = js.native
  def outputJSON(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def outputJSONAsync(file: String, data: js.Any): js.Promise[Unit] = js.native
  def outputJSONSync(file: String, data: js.Any): Unit = js.native
  def outputJson(file: String, data: js.Any): Unit = js.native
  def outputJson(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def outputJsonSync(file: String, data: js.Any): Unit = js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def readAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = js.native
  def readFile(filename: String, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    filename: String,
    options: String,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    filename: String,
    options: OpenOptions,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
  def readFileAsync(filename: String): js.Promise[Buffer] = js.native
  def readFileAsync(filename: String, options: String): js.Promise[String] = js.native
  def readFileAsync(filename: String, options: OpenOptions): js.Promise[String] = js.native
  def readFileSync(filename: String): Buffer = js.native
  def readFileSync(filename: String, options: String): String = js.native
  def readFileSync(filename: String, options: OpenOptions): String = js.native
  def readJSON(file: String): Unit = js.native
  def readJSON(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def readJSON(file: String, options: OpenOptions): Unit = js.native
  def readJSON(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def readJSONAsync(file: String): js.Promise[Unit] = js.native
  def readJSONAsync(file: String, options: OpenOptions): js.Promise[Unit] = js.native
  def readJSONSync(file: String): Unit = js.native
  def readJSONSync(file: String, options: OpenOptions): Unit = js.native
  def readJson(file: String): Unit = js.native
  def readJson(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def readJson(file: String, options: OpenOptions): Unit = js.native
  def readJson(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def readJsonSync(file: String): Unit = js.native
  def readJsonSync(file: String, options: OpenOptions): Unit = js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  def readdir(path: String): Unit = js.native
  def readdir(path: String, callback: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = js.native
  def readdirAsync(path: String): js.Promise[js.Array[String]] = js.native
  def readdirSync(path: String): js.Array[String] = js.native
  def readlink(path: String): Unit = js.native
  def readlink(path: String, callback: js.Function2[/* err */ Error, /* linkString */ String, Unit]): Unit = js.native
  def readlinkAsync(path: String): js.Promise[String] = js.native
  def realpath(path: String): Unit = js.native
  def realpath(
    path: String,
    cache: String,
    callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def realpath(path: String, callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]): Unit = js.native
  def realpathAsync(path: String): js.Promise[String] = js.native
  def realpathAsync(path: String, cache: String): js.Promise[String] = js.native
  def realpathSync(path: String): String = js.native
  def realpathSync(path: String, cache: Boolean): String = js.native
  def remove(dir: String): Unit = js.native
  def remove(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def removeAsync(dir: String): js.Promise[Unit] = js.native
  def removeSync(dir: String): Unit = js.native
  def rename(oldPath: String, newPath: String): Unit = js.native
  def rename(oldPath: String, newPath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def renameAsync(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  def rmdir(path: String): Unit = js.native
  def rmdir(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def rmdirAsync(path: String): js.Promise[Unit] = js.native
  def rmdirSync(path: String): Unit = js.native
  def stat(path: String): Unit = js.native
  def stat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = js.native
  def statAsync(path: String): js.Promise[Stats] = js.native
  def statSync(path: String): Stats = js.native
  def symlink(srcpath: String, dstpath: String): Unit = js.native
  def symlink(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  def symlink(srcpath: String, dstpath: String, `type`: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def symlinkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def symlinkAsync(srcpath: String, dstpath: String, `type`: Type): js.Promise[Unit] = js.native
  def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
  def symlinkSync(srcpath: String, dstpath: String, `type`: Type): Unit = js.native
  def truncate(fd: Double, len: Double): Unit = js.native
  def truncate(fd: Double, len: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def truncateAsync(fd: Double, len: Double): js.Promise[Unit] = js.native
  def truncateSync(fd: Double, len: Double): Unit = js.native
  def unlink(path: String): Unit = js.native
  def unlink(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unlinkAsync(path: String): js.Promise[Unit] = js.native
  def unlinkSync(path: String): Unit = js.native
  def unwatchFile(filename: String): Unit = js.native
  def unwatchFile(filename: String, listener: Stats): Unit = js.native
  def utimes(path: String, atime: Double, mtime: Double): Unit = js.native
  def utimes(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def utimesAsync(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
  def watch(filename: String): FSWatcher = js.native
  def watch(filename: String, options: Anon_Persistent): FSWatcher = js.native
  def watch(
    filename: String,
    options: Anon_Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
  def watchFile(filename: String, listener: Anon_Curr): Unit = js.native
  def watchFile(filename: String, options: Anon_Interval, listener: Anon_Curr): Unit = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def writeAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = js.native
  def writeFile(filename: String, data: js.Any): Unit = js.native
  def writeFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def writeFile(filename: String, data: js.Any, options: String): Unit = js.native
  def writeFile(filename: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def writeFile(filename: String, data: js.Any, options: OpenOptions): Unit = js.native
  def writeFile(
    filename: String,
    data: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def writeFileAsync(filename: String, data: js.Any): js.Promise[Unit] = js.native
  def writeFileAsync(filename: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  def writeFileAsync(filename: String, data: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  def writeFileSync(filename: String, data: js.Any): Unit = js.native
  def writeFileSync(filename: String, data: js.Any, option: String): Unit = js.native
  def writeFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def writeJSON(file: String, `object`: js.Any): Unit = js.native
  def writeJSON(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def writeJSON(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  def writeJSON(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def writeJSONAsync(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def writeJSONAsync(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  def writeJSONSync(file: String, `object`: js.Any): Unit = js.native
  def writeJSONSync(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  def writeJson(file: String, `object`: js.Any): Unit = js.native
  def writeJson(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def writeJson(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  def writeJson(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def writeJsonAsync(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def writeJsonAsync(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  def writeJsonSync(file: String, `object`: js.Any): Unit = js.native
  def writeJsonSync(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
}

