package typings
package fsDashExtraDashPromiseDashEs6Lib.fsDashExtraDashPromiseDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", JSImport.Namespace)
@js.native
object fsDashExtraDashPromiseDashEs6ModMembers extends js.Object {
  def appendFile(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(filename: java.lang.String, data: js.Any, option: OpenOptions): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    option: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(filename: java.lang.String, data: js.Any, option: java.lang.String): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    option: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def appendFileAsync(filename: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def appendFileAsync(filename: java.lang.String, data: js.Any, option: OpenOptions): stdLib.Promise[scala.Unit] = js.native
  def appendFileAsync(filename: java.lang.String, data: js.Any, option: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, option: OpenOptions): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, option: java.lang.String): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def chmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def chmodAsync(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def chmodAsync(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def chmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def chown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def chownAsync(path: java.lang.String, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def closeAsync(fd: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def closeSync(fd: scala.Double): scala.Unit = js.native
  def copy(src: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def copy(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[
      (/* src */ java.lang.String) | (/* err */ nodeLib.Error), 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def copy(
    src: java.lang.String,
    dest: java.lang.String,
    filter: js.Function1[/* src */ java.lang.String, scala.Boolean],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def copyAsync(src: java.lang.String, dest: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def copyAsync(
    src: java.lang.String,
    dest: java.lang.String,
    filter: js.Function1[/* src */ java.lang.String, scala.Boolean]
  ): stdLib.Promise[scala.Unit] = js.native
  def copySync(src: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def copySync(
    src: java.lang.String,
    dest: java.lang.String,
    filter: js.Function1[/* src */ java.lang.String, scala.Boolean]
  ): scala.Unit = js.native
  def createFile(file: java.lang.String): scala.Unit = js.native
  def createFile(file: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def createFileAsync(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def createFileSync(file: java.lang.String): scala.Unit = js.native
  def createReadStream(path: java.lang.String): ReadStream = js.native
  def createReadStream(path: java.lang.String, options: fsDashExtraDashPromiseDashEs6Lib.Anon_AutoClose): ReadStream = js.native
  def createReadStream(path: nodeLib.Buffer): ReadStream = js.native
  def createReadStream(path: nodeLib.Buffer, options: fsDashExtraDashPromiseDashEs6Lib.Anon_AutoClose): ReadStream = js.native
  def createWriteStream(path: java.lang.String): WriteStream = js.native
  def createWriteStream(path: java.lang.String, options: fsDashExtraDashPromiseDashEs6Lib.Anon_Fd): WriteStream = js.native
  def createWriteStream(path: nodeLib.Buffer): WriteStream = js.native
  def createWriteStream(path: nodeLib.Buffer, options: fsDashExtraDashPromiseDashEs6Lib.Anon_Fd): WriteStream = js.native
  def ensureDir(path: java.lang.String, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def ensureDirAsync(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def ensureDirSync(path: java.lang.String): scala.Unit = js.native
  def exists(path: java.lang.String): scala.Unit = js.native
  def exists(path: java.lang.String, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def existsAsync(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def existsSync(path: java.lang.String): scala.Boolean = js.native
  def fchmod(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmod(
    fd: scala.Double,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchmod(fd: scala.Double, mode: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def fchmodAsync(fd: scala.Double, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def fchmodAsync(fd: scala.Double, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def fchownAsync(fd: scala.Double, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double, callback: js.Function2[/* err */ nodeLib.Error, /* stats */ Stats, scala.Unit]): scala.Unit = js.native
  def fstatAsync(fd: scala.Double): stdLib.Promise[Stats] = js.native
  def fstatSync(fd: scala.Double): Stats = js.native
  def fsync(fd: scala.Double): scala.Unit = js.native
  def fsync(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def fsyncAsync(fd: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def futimesAsync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def isDirectory(path: java.lang.String): scala.Unit = js.native
  def isDirectory(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* isDirectory */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isDirectoryAsync(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def isDirectorySync(path: java.lang.String): scala.Boolean = js.native
  def lchmod(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def lchmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def lchmodAsync(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def lchmodAsync(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def lchmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def lchown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def lchownAsync(path: java.lang.String, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def link(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def linkAsync(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def linkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def lstat(path: java.lang.String): scala.Unit = js.native
  def lstat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* stats */ Stats, scala.Unit]
  ): scala.Unit = js.native
  def lstatAsync(path: java.lang.String): stdLib.Promise[Stats] = js.native
  def lstatSync(path: java.lang.String): Stats = js.native
  def mkdir(path: java.lang.String): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def mkdirAsync(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirAsync(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirAsync(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def mkdirSync(path: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def mkdirp(dir: java.lang.String): scala.Unit = js.native
  def mkdirp(dir: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def mkdirpAsync(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirpSync(dir: java.lang.String): scala.Unit = js.native
  def mkdirs(dir: java.lang.String): scala.Unit = js.native
  def mkdirs(dir: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def mkdirsAsync(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirsSync(dir: java.lang.String): scala.Unit = js.native
  def open(path: java.lang.String, flags: java.lang.String): scala.Unit = js.native
  def open(path: java.lang.String, flags: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    mode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* fs */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def openAsync(path: java.lang.String, flags: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def openAsync(path: java.lang.String, flags: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def openSync(path: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def openSync(path: java.lang.String, flags: java.lang.String, mode: java.lang.String): scala.Double = js.native
  def outputFile(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputFile(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def outputFileAsync(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def outputFileSync(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputJSON(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputJSON(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def outputJSONAsync(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def outputJSONSync(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputJson(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def outputJson(file: java.lang.String, data: js.Any, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def outputJsonSync(file: java.lang.String, data: js.Any): scala.Unit = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* bytesRead */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readAsync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[js.Tuple2[scala.Double, nodeLib.Buffer]] = js.native
  def readFile(
    filename: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: OpenOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFileAsync(filename: java.lang.String): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFileAsync(filename: java.lang.String, options: OpenOptions): stdLib.Promise[java.lang.String] = js.native
  def readFileAsync(filename: java.lang.String, options: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readFileSync(filename: java.lang.String): nodeLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, options: OpenOptions): java.lang.String = js.native
  def readFileSync(filename: java.lang.String, options: java.lang.String): java.lang.String = js.native
  def readJSON(file: java.lang.String): scala.Unit = js.native
  def readJSON(file: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def readJSON(file: java.lang.String, options: OpenOptions): scala.Unit = js.native
  def readJSON(
    file: java.lang.String,
    options: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def readJSONAsync(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def readJSONAsync(file: java.lang.String, options: OpenOptions): stdLib.Promise[scala.Unit] = js.native
  def readJSONSync(file: java.lang.String): scala.Unit = js.native
  def readJSONSync(file: java.lang.String, options: OpenOptions): scala.Unit = js.native
  def readJson(file: java.lang.String): scala.Unit = js.native
  def readJson(file: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def readJson(file: java.lang.String, options: OpenOptions): scala.Unit = js.native
  def readJson(
    file: java.lang.String,
    options: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def readJsonSync(file: java.lang.String): scala.Unit = js.native
  def readJsonSync(file: java.lang.String, options: OpenOptions): scala.Unit = js.native
  def readSync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readdir(path: java.lang.String): scala.Unit = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def readdirAsync(path: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readdirSync(path: java.lang.String): js.Array[java.lang.String] = js.native
  def readlink(path: java.lang.String): scala.Unit = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* linkString */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readlinkAsync(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String): scala.Unit = js.native
  def realpath(
    path: java.lang.String,
    cache: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* resolvedPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def realpath(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* resolvedPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def realpathAsync(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def realpathAsync(path: java.lang.String, cache: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def realpathSync(path: java.lang.String): java.lang.String = js.native
  def realpathSync(path: java.lang.String, cache: scala.Boolean): java.lang.String = js.native
  def remove(dir: java.lang.String): scala.Unit = js.native
  def remove(dir: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def removeAsync(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def removeSync(dir: java.lang.String): scala.Unit = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rename(
    oldPath: java.lang.String,
    newPath: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def renameAsync(oldPath: java.lang.String, newPath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def renameSync(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rmdir(path: java.lang.String): scala.Unit = js.native
  def rmdir(path: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def rmdirAsync(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rmdirSync(path: java.lang.String): scala.Unit = js.native
  def stat(path: java.lang.String): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* stats */ Stats, scala.Unit]
  ): scala.Unit = js.native
  def statAsync(path: java.lang.String): stdLib.Promise[Stats] = js.native
  def statSync(path: java.lang.String): Stats = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def symlinkAsync(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlinkAsync(srcpath: java.lang.String, dstpath: java.lang.String, `type`: nodeLib.fsMod.symlinkNs.Type): stdLib.Promise[scala.Unit] = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String, `type`: nodeLib.fsMod.symlinkNs.Type): scala.Unit = js.native
  def truncate(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def truncate(fd: scala.Double, len: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def truncateAsync(fd: scala.Double, len: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def truncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): scala.Unit = js.native
  def unlink(path: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def unlinkAsync(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def unlinkSync(path: java.lang.String): scala.Unit = js.native
  def unwatchFile(filename: java.lang.String): scala.Unit = js.native
  def unwatchFile(filename: java.lang.String, listener: Stats): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def utimesAsync(path: java.lang.String, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def utimesSync(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def watch(filename: java.lang.String): FSWatcher = js.native
  def watch(filename: java.lang.String, options: fsDashExtraDashPromiseDashEs6Lib.Anon_Persistent): FSWatcher = js.native
  def watch(
    filename: java.lang.String,
    options: fsDashExtraDashPromiseDashEs6Lib.Anon_Persistent,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): FSWatcher = js.native
  def watchFile(filename: java.lang.String, listener: fsDashExtraDashPromiseDashEs6Lib.Anon_Prev): scala.Unit = js.native
  def watchFile(
    filename: java.lang.String,
    options: fsDashExtraDashPromiseDashEs6Lib.Anon_PersistentInterval,
    listener: fsDashExtraDashPromiseDashEs6Lib.Anon_Prev
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* written */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def writeAsync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[js.Tuple2[scala.Double, nodeLib.Buffer]] = js.native
  def writeFile(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(filename: java.lang.String, data: js.Any, options: OpenOptions): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(filename: java.lang.String, data: js.Any, options: java.lang.String): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeFileAsync(filename: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def writeFileAsync(filename: java.lang.String, data: js.Any, options: OpenOptions): stdLib.Promise[scala.Unit] = js.native
  def writeFileAsync(filename: java.lang.String, data: js.Any, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, option: OpenOptions): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, option: java.lang.String): scala.Unit = js.native
  def writeJSON(file: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def writeJSON(
    file: java.lang.String,
    `object`: js.Any,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeJSON(file: java.lang.String, `object`: js.Any, options: OpenOptions): scala.Unit = js.native
  def writeJSON(
    file: java.lang.String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeJSONAsync(file: java.lang.String, `object`: js.Any): stdLib.Promise[scala.Unit] = js.native
  def writeJSONAsync(file: java.lang.String, `object`: js.Any, options: OpenOptions): stdLib.Promise[scala.Unit] = js.native
  def writeJSONSync(file: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def writeJSONSync(file: java.lang.String, `object`: js.Any, options: OpenOptions): scala.Unit = js.native
  def writeJson(file: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def writeJson(
    file: java.lang.String,
    `object`: js.Any,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeJson(file: java.lang.String, `object`: js.Any, options: OpenOptions): scala.Unit = js.native
  def writeJson(
    file: java.lang.String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def writeJsonAsync(file: java.lang.String, `object`: js.Any): stdLib.Promise[scala.Unit] = js.native
  def writeJsonAsync(file: java.lang.String, `object`: js.Any, options: OpenOptions): stdLib.Promise[scala.Unit] = js.native
  def writeJsonSync(file: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def writeJsonSync(file: java.lang.String, `object`: js.Any, options: OpenOptions): scala.Unit = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
}

