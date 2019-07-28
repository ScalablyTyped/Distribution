package typings.fsDashExtraDashP.fsDashExtraDashPMod

import typings.node.Anon_AutoClose
import typings.node.Anon_AutoCloseEncoding
import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-p", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def access(path: String): js.Promise[Unit] = js.native
  def access(path: String, mode: Double): js.Promise[Unit] = js.native
  def access(path: Buffer): js.Promise[Unit] = js.native
  def access(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  def appendFile(filename: String, data: js.Any): js.Promise[Unit] = js.native
  def appendFile(filename: String, data: js.Any, encoding: String): js.Promise[Unit] = js.native
  def appendFile(filename: String, data: js.Any, option: OpenOptions): js.Promise[Unit] = js.native
  def appendFileSync(filename: String, data: js.Any): Unit = js.native
  def appendFileSync(filename: String, data: js.Any, encoding: String): Unit = js.native
  def appendFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def chmod(path: String, mode: String): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmodSync(path: String, mode: String): Unit = js.native
  def chmodSync(path: String, mode: Double): Unit = js.native
  def chown(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chownSync(path: String, uid: Double, gid: Double): Unit = js.native
  def close(fd: Double): js.Promise[Unit] = js.native
  def closeSync(fd: Double): Unit = js.native
  def copy(src: String, dest: String): js.Promise[Unit] = js.native
  def copy(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = js.native
  def copyFile(src: String, dest: String): js.Promise[Unit] = js.native
  def createFile(file: String): js.Promise[Unit] = js.native
  def createFileSync(file: String): Unit = js.native
  def createReadStream(path: PathLike): ReadStream = js.native
  def createReadStream(path: PathLike, options: String): ReadStream = js.native
  def createReadStream(path: PathLike, options: Anon_AutoClose): ReadStream = js.native
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: Anon_AutoCloseEncoding): typings.node.fsMod.WriteStream = js.native
  def deleteFile(path: String): js.Promise[_] = js.native
  def deleteFile(path: String, ignoreIfNotExists: Boolean): js.Promise[_] = js.native
  def emptyDir(path: String): js.Promise[Unit] = js.native
  def emptyDirSync(path: String): Boolean = js.native
  def ensureDir(path: String): js.Promise[Unit] = js.native
  def ensureDir(path: String, options: CreateDirOptions): js.Promise[Unit] = js.native
  def ensureDirSync(path: String): Unit = js.native
  def ensureFile(path: String): js.Promise[Unit] = js.native
  def ensureFileSync(path: String): Unit = js.native
  def ensureLink(path: String): js.Promise[Unit] = js.native
  def ensureLinkSync(path: String): Unit = js.native
  def ensureSymlink(path: String): js.Promise[Unit] = js.native
  def ensureSymlinkSync(path: String): Unit = js.native
  def fchmod(fd: Double, mode: String): js.Promise[Unit] = js.native
  def fchmod(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  def fstat(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  def fstatSync(fd: Double): typings.node.fsMod.Stats = js.native
  def fsync(fd: Double): js.Promise[Unit] = js.native
  def fsyncSync(fd: Double): Unit = js.native
  def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def lchmod(path: String, mode: String): js.Promise[Unit] = js.native
  def lchmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def lchmodSync(path: String, mode: String): Unit = js.native
  def lchmodSync(path: String, mode: Double): Unit = js.native
  def lchown(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def lchownSync(path: String, uid: Double, gid: Double): Unit = js.native
  def link(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  def lstat(path: String): js.Promise[typings.node.fsMod.Stats] = js.native
  def lstatSync(path: String): typings.node.fsMod.Stats = js.native
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(path: String, mode: String): js.Promise[Unit] = js.native
  def mkdir(path: String, mode: Double): js.Promise[Unit] = js.native
  def mkdirSync(path: String): Unit = js.native
  def mkdirSync(path: String, mode: String): Unit = js.native
  def mkdirSync(path: String, mode: Double): Unit = js.native
  def mkdirp(dir: String): js.Promise[Unit] = js.native
  def mkdirp(dir: String, options: CreateDirOptions): js.Promise[Unit] = js.native
  def mkdirpSync(dir: String): Unit = js.native
  def mkdirpSync(dir: String, options: CreateDirOptions): Unit = js.native
  def mkdirs(dir: String): js.Promise[Unit] = js.native
  def mkdirs(dir: String, options: CreateDirOptions): js.Promise[Unit] = js.native
  def mkdirsSync(dir: String): Unit = js.native
  def mkdirsSync(dir: String, options: CreateDirOptions): Unit = js.native
  def mkdtemp(prefix: String): js.Promise[String] = js.native
  def move(src: String, dest: String): js.Promise[Unit] = js.native
  def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = js.native
  def moveSync(src: String, dest: String): Unit = js.native
  def moveSync(src: String, dest: String, options: MoveOptions): Unit = js.native
  def open(path: String, flags: String): js.Promise[Double] = js.native
  def open(path: String, flags: String, mode: String): js.Promise[Double] = js.native
  def openSync(path: String, flags: String): Double = js.native
  def openSync(path: String, flags: String, mode: String): Double = js.native
  def outputFile(file: String, data: js.Any): js.Promise[Unit] = js.native
  def outputFile(file: String, data: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  def outputFileSync(file: String, data: js.Any): Unit = js.native
  def outputJson(file: String, data: js.Any): js.Promise[Unit] = js.native
  def outputJson(file: String, data: js.Any, options: JsonOptions): js.Promise[Unit] = js.native
  def outputJsonSync(file: String, data: js.Any): Unit = js.native
  def pathExists(path: String): js.Promise[Boolean] = js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[Double] = js.native
  def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): js.Promise[Double] = js.native
  def readFile(filename: String): js.Promise[Buffer] = js.native
  def readFile(filename: String, encoding: String): js.Promise[String] = js.native
  def readFile(filename: String, options: OpenOptions): js.Promise[String] = js.native
  def readFileSync(filename: String): Buffer = js.native
  def readFileSync(filename: String, encoding: String): String = js.native
  def readFileSync(filename: String, options: OpenOptions): String = js.native
  def readJson(file: String): js.Promise[_] = js.native
  def readJson(file: String, options: OpenOptions): js.Promise[_] = js.native
  def readJsonSync(file: String): js.Any = js.native
  def readJsonSync(file: String, options: OpenOptions): js.Any = js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  def readdir(path: String): js.Promise[js.Array[String]] = js.native
  def readlink(path: String): js.Promise[String] = js.native
  def realpath(path: String): js.Promise[String] = js.native
  def realpath(path: String, cache: String): js.Promise[String] = js.native
  def realpathSync(path: String): String = js.native
  def realpathSync(path: String, cache: Boolean): String = js.native
  def remove(dir: String): js.Promise[Unit] = js.native
  def removeSync(dir: String): Unit = js.native
  def rename(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  def rmdir(path: String): js.Promise[Unit] = js.native
  def rmdirSync(path: String): Unit = js.native
  def stat(path: String): js.Promise[typings.node.fsMod.Stats] = js.native
  def statSync(path: String): typings.node.fsMod.Stats = js.native
  def symlink(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def symlink(srcpath: String, dstpath: String, `type`: String): js.Promise[Unit] = js.native
  def symlinkSync(srcpath: String, dstpath: String): Unit = js.native
  def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  def truncate(fd: Double, len: Double): js.Promise[Unit] = js.native
  def truncateSync(fd: Double, len: Double): Unit = js.native
  def unlink(path: String): js.Promise[String] = js.native
  def unlinkSync(path: String): Unit = js.native
  def utimes(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimesSync(path: String, atime: Double, mtime: Double): Unit = js.native
  def write(fd: Double, buffer: Buffer): js.Promise[Double] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double): js.Promise[Double] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[Double] = js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* written */ Double, /* buffer */ Buffer, Unit]
  ): js.Promise[Double] = js.native
  def writeFile(filename: String, data: js.Any): js.Promise[Unit] = js.native
  def writeFile(filename: String, data: js.Any, encoding: String): js.Promise[Unit] = js.native
  def writeFile(filename: String, data: js.Any, options: OpenOptions): js.Promise[Unit] = js.native
  def writeFileSync(filename: String, data: js.Any): Unit = js.native
  def writeFileSync(filename: String, data: js.Any, encoding: String): Unit = js.native
  def writeFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def writeJson(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def writeJson(file: String, `object`: js.Any, options: JsonOptions): js.Promise[Unit] = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
}

