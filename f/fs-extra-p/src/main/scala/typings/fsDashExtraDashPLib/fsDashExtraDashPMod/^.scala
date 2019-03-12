package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-p", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def access(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def access(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def access(path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def access(path: nodeLib.Buffer, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def appendFile(filename: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def appendFile(filename: java.lang.String, data: js.Any, encoding: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(filename: java.lang.String, data: js.Any, option: OpenOptions): js.Promise[scala.Unit] = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, option: OpenOptions): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def chmod(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def chmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def chmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def chownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double): js.Promise[scala.Unit] = js.native
  def closeSync(fd: scala.Double): scala.Unit = js.native
  def copy(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = js.native
  def copy(src: java.lang.String, dest: java.lang.String, options: CopyOptions): js.Promise[scala.Unit] = js.native
  def copyFile(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = js.native
  def createFile(file: java.lang.String): js.Promise[scala.Unit] = js.native
  def createFileSync(file: java.lang.String): scala.Unit = js.native
  def createReadStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.ReadStream = js.native
  def createReadStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.ReadStream = js.native
  def createReadStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoClose): nodeLib.fsMod.ReadStream = js.native
  def createWriteStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoCloseEncoding): nodeLib.fsMod.WriteStream = js.native
  def deleteFile(path: java.lang.String): js.Promise[_] = js.native
  def deleteFile(path: java.lang.String, ignoreIfNotExists: scala.Boolean): js.Promise[_] = js.native
  def emptyDir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def emptyDirSync(path: java.lang.String): scala.Boolean = js.native
  def ensureDir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def ensureDir(path: java.lang.String, options: CreateDirOptions): js.Promise[scala.Unit] = js.native
  def ensureDirSync(path: java.lang.String): scala.Unit = js.native
  def ensureFile(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def ensureFileSync(path: java.lang.String): scala.Unit = js.native
  def ensureLink(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def ensureLinkSync(path: java.lang.String): scala.Unit = js.native
  def ensureSymlink(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def ensureSymlinkSync(path: java.lang.String): scala.Unit = js.native
  def fchmod(fd: scala.Double, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double): js.Promise[nodeLib.fsMod.Stats] = js.native
  def fstatSync(fd: scala.Double): nodeLib.fsMod.Stats = js.native
  def fsync(fd: scala.Double): js.Promise[scala.Unit] = js.native
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def lchmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def lchmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def lchownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: java.lang.String): js.Promise[scala.Unit] = js.native
  def linkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def lstat(path: java.lang.String): js.Promise[nodeLib.fsMod.Stats] = js.native
  def lstatSync(path: java.lang.String): nodeLib.fsMod.Stats = js.native
  def mkdir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdir(path: java.lang.String, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def mkdirSync(path: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def mkdirp(dir: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirp(dir: java.lang.String, options: CreateDirOptions): js.Promise[scala.Unit] = js.native
  def mkdirpSync(dir: java.lang.String): scala.Unit = js.native
  def mkdirpSync(dir: java.lang.String, options: CreateDirOptions): scala.Unit = js.native
  def mkdirs(dir: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirs(dir: java.lang.String, options: CreateDirOptions): js.Promise[scala.Unit] = js.native
  def mkdirsSync(dir: java.lang.String): scala.Unit = js.native
  def mkdirsSync(dir: java.lang.String, options: CreateDirOptions): scala.Unit = js.native
  def mkdtemp(prefix: java.lang.String): js.Promise[java.lang.String] = js.native
  def move(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = js.native
  def move(src: java.lang.String, dest: java.lang.String, options: MoveOptions): js.Promise[scala.Unit] = js.native
  def moveSync(src: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def moveSync(src: java.lang.String, dest: java.lang.String, options: MoveOptions): scala.Unit = js.native
  def open(path: java.lang.String, flags: java.lang.String): js.Promise[scala.Double] = js.native
  def open(path: java.lang.String, flags: java.lang.String, mode: java.lang.String): js.Promise[scala.Double] = js.native
  def openSync(path: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def openSync(path: java.lang.String, flags: java.lang.String, mode: java.lang.String): scala.Double = js.native
  def outputFile(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def outputFile(file: java.lang.String, data: js.Any, options: OpenOptions): js.Promise[scala.Unit] = js.native
  def outputFileSync(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputJson(file: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def outputJson(file: java.lang.String, data: js.Any, options: JsonOptions): js.Promise[scala.Unit] = js.native
  def outputJsonSync(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def pathExists(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* bytesRead */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): js.Promise[scala.Double] = js.native
  def readFile(filename: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def readFile(filename: java.lang.String, encoding: java.lang.String): js.Promise[java.lang.String] = js.native
  def readFile(filename: java.lang.String, options: OpenOptions): js.Promise[java.lang.String] = js.native
  def readFileSync(filename: java.lang.String): nodeLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def readFileSync(filename: java.lang.String, options: OpenOptions): java.lang.String = js.native
  def readJson(file: java.lang.String): js.Promise[_] = js.native
  def readJson(file: java.lang.String, options: OpenOptions): js.Promise[_] = js.native
  def readJsonSync(file: java.lang.String): js.Any = js.native
  def readJsonSync(file: java.lang.String, options: OpenOptions): js.Any = js.native
  def readSync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readdir(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readlink(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String, cache: java.lang.String): js.Promise[java.lang.String] = js.native
  def realpathSync(path: java.lang.String): java.lang.String = js.native
  def realpathSync(path: java.lang.String, cache: scala.Boolean): java.lang.String = js.native
  def remove(dir: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeSync(dir: java.lang.String): scala.Unit = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmdir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmdirSync(path: java.lang.String): scala.Unit = js.native
  def stat(path: java.lang.String): js.Promise[nodeLib.fsMod.Stats] = js.native
  def statSync(path: java.lang.String): nodeLib.fsMod.Stats = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String): js.Promise[scala.Unit] = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): js.Promise[scala.Unit] = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def truncate(fd: scala.Double, len: scala.Double): js.Promise[scala.Unit] = js.native
  def truncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def unlinkSync(path: java.lang.String): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def utimesSync(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer): js.Promise[scala.Double] = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double): js.Promise[scala.Double] = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Promise[scala.Double] = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* written */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): js.Promise[scala.Double] = js.native
  def writeFile(filename: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def writeFile(filename: java.lang.String, data: js.Any, encoding: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(filename: java.lang.String, data: js.Any, options: OpenOptions): js.Promise[scala.Unit] = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, option: OpenOptions): scala.Unit = js.native
  def writeJson(file: java.lang.String, `object`: js.Any): js.Promise[scala.Unit] = js.native
  def writeJson(file: java.lang.String, `object`: js.Any, options: JsonOptions): js.Promise[scala.Unit] = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
}

