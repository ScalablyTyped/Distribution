package typings.emscripten.FSNs

import typings.emscripten.Anon_Binary
import typings.emscripten.Anon_Flags
import typings.emscripten.EmscriptenNs.FileSystemType
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS")
@js.native
object ^ extends js.Object {
  var genericErrors: js.Any = js.native
  var ignorePermissions: Boolean = js.native
  var tracking: js.Any = js.native
  var trackingDelegate: js.Any = js.native
  def allocate(stream: FSStream, offset: Double, length: Double): Unit = js.native
  def chdir(path: String): Unit = js.native
  def chmod(path: String, mode: Double): Unit = js.native
  def chmod(path: String, mode: Double, dontFollow: Boolean): Unit = js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  def chown(path: String, uid: Double, gid: Double, dontFollow: Boolean): Unit = js.native
  def close(stream: FSStream): Unit = js.native
  def createLazyFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
  def createLazyFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
  def createPreloadedFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
  def createPreloadedFile(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit]
  ): Unit = js.native
  def createPreloadedFile(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit]
  ): Unit = js.native
  def createPreloadedFile(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean
  ): Unit = js.native
  def createPreloadedFile(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean,
    canOwn: Boolean
  ): Unit = js.native
  def createPreloadedFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit]
  ): Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit]
  ): Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean
  ): Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean,
    canOwn: Boolean
  ): Unit = js.native
  //
  // module-level FS code
  //
  def cwd(): String = js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  def ftruncate(fd: Double, len: Double): Unit = js.native
  def getPath(node: FSNode): String = js.native
  def init(): Unit = js.native
  def init(input: js.Function0[Double | Null]): Unit = js.native
  def init(input: js.Function0[Double | Null], output: js.Function1[/* c */ Double, _]): Unit = js.native
  def init(
    input: js.Function0[Double | Null],
    output: js.Function1[/* c */ Double, _],
    error: js.Function1[/* c */ Double, _]
  ): Unit = js.native
  def init(input: js.Function0[Double | Null], output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
  def init(input: Null, output: js.Function1[/* c */ Double, _]): Unit = js.native
  def init(input: Null, output: js.Function1[/* c */ Double, _], error: js.Function1[/* c */ Double, _]): Unit = js.native
  def init(input: Null, output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
  def ioctl(stream: FSStream, cmd: js.Any, arg: js.Any): js.Any = js.native
  def isBlkdev(mode: Double): Boolean = js.native
  def isChrdev(mode: Double): Boolean = js.native
  def isDir(mode: Double): Boolean = js.native
  def isFIFO(mode: Double): Boolean = js.native
  //
  // nodes
  //
  def isFile(mode: Double): Boolean = js.native
  def isLink(mode: Double): Boolean = js.native
  def isSocket(mode: Double): Boolean = js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  def llseek(stream: FSStream, offset: Double, whence: Double): js.Any = js.native
  //
  // paths
  //
  def lookupPath(path: String, opts: js.Any): Lookup = js.native
  def lstat(path: String): js.Any = js.native
  //
  // devices
  //
  def major(dev: Double): Double = js.native
  def makedev(ma: Double, mi: Double): Double = js.native
  def minor(dev: Double): Double = js.native
  def mkdev(path: String): js.Any = js.native
  def mkdev(path: String, mode: Double): js.Any = js.native
  def mkdev(path: String, mode: Double, dev: Double): js.Any = js.native
  def mkdir(path: String): js.Any = js.native
  def mkdir(path: String, mode: Double): js.Any = js.native
  def mmap(
    stream: FSStream,
    buffer: ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double,
    prot: Double,
    flags: Double
  ): js.Any = js.native
  def mount(`type`: FileSystemType, opts: js.Any, mountpoint: String): js.Any = js.native
  def open(path: String, flags: String): FSStream = js.native
  def open(path: String, flags: String, mode: Double): FSStream = js.native
  def open(path: String, flags: String, mode: Double, fd_start: Double): FSStream = js.native
  def open(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = js.native
  def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def readFile(path: String): String | Uint8Array = js.native
  def readFile(path: String, opts: Anon_Binary): String | Uint8Array = js.native
  def readdir(path: String): js.Any = js.native
  def readlink(path: String): String = js.native
  def registerDevice(dev: Double, ops: js.Any): Unit = js.native
  def rename(old_path: String, new_path: String): Unit = js.native
  def rmdir(path: String): Unit = js.native
  def stat(path: String): js.Any = js.native
  def stat(path: String, dontFollow: Boolean): js.Any = js.native
  def symlink(oldpath: String, newpath: String): js.Any = js.native
  def syncfs(callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
  def syncfs(callback: js.Function1[/* e */ js.Any, _], populate: Boolean): Unit = js.native
  //
  // core
  //
  def syncfs(populate: Boolean, callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
  def truncate(path: String, len: Double): Unit = js.native
  def unlink(path: String): Unit = js.native
  def unmount(mountpoint: String): Unit = js.native
  def utime(path: String, atime: Double, mtime: Double): Unit = js.native
  def write(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def write(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def write(
    stream: FSStream,
    buffer: ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double,
    canOwn: Boolean
  ): Double = js.native
  def writeFile(path: String, data: String): Unit = js.native
  def writeFile(path: String, data: String, opts: Anon_Flags): Unit = js.native
  def writeFile(path: String, data: ArrayBufferView): Unit = js.native
  def writeFile(path: String, data: ArrayBufferView, opts: Anon_Flags): Unit = js.native
}

