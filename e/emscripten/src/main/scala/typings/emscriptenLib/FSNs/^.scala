package typings
package emscriptenLib.FSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS")
@js.native
object ^ extends js.Object {
  var genericErrors: js.Any = js.native
  var ignorePermissions: scala.Boolean = js.native
  var tracking: js.Any = js.native
  var trackingDelegate: js.Any = js.native
  def allocate(stream: FSStream, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  def chdir(path: java.lang.String): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double, dontFollow: scala.Boolean): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double, dontFollow: scala.Boolean): scala.Unit = js.native
  def close(stream: FSStream): scala.Unit = js.native
  def createLazyFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean
  ): FSNode = js.native
  def createLazyFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean
  ): FSNode = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit],
    dontCreateFile: scala.Boolean
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: FSNode,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit],
    dontCreateFile: scala.Boolean,
    canOwn: scala.Boolean
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit],
    dontCreateFile: scala.Boolean
  ): scala.Unit = js.native
  def createPreloadedFile(
    parent: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    onload: js.Function0[scala.Unit],
    onerror: js.Function0[scala.Unit],
    dontCreateFile: scala.Boolean,
    canOwn: scala.Boolean
  ): scala.Unit = js.native
  //
  // module-level FS code
  //
  def cwd(): java.lang.String = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def ftruncate(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def getPath(node: FSNode): java.lang.String = js.native
  def init(
    input: js.Function0[scala.Double],
    output: js.Function1[/* c */ scala.Double, _],
    error: js.Function1[/* c */ scala.Double, _]
  ): scala.Unit = js.native
  def ioctl(stream: FSStream, cmd: js.Any, arg: js.Any): js.Any = js.native
  def isBlkdev(mode: scala.Double): scala.Boolean = js.native
  def isChrdev(mode: scala.Double): scala.Boolean = js.native
  def isDir(mode: scala.Double): scala.Boolean = js.native
  def isFIFO(mode: scala.Double): scala.Boolean = js.native
  //
  // nodes
  //
  def isFile(mode: scala.Double): scala.Boolean = js.native
  def isLink(mode: scala.Double): scala.Boolean = js.native
  def isSocket(mode: scala.Double): scala.Boolean = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def llseek(stream: FSStream, offset: scala.Double, whence: scala.Double): js.Any = js.native
  //
  // paths
  //
  def lookupPath(path: java.lang.String, opts: js.Any): Lookup = js.native
  def lstat(path: java.lang.String): js.Any = js.native
  //
  // devices
  //
  def major(dev: scala.Double): scala.Double = js.native
  def makedev(ma: scala.Double, mi: scala.Double): scala.Double = js.native
  def minor(dev: scala.Double): scala.Double = js.native
  def mkdev(path: java.lang.String): js.Any = js.native
  def mkdev(path: java.lang.String, mode: scala.Double): js.Any = js.native
  def mkdev(path: java.lang.String, mode: scala.Double, dev: scala.Double): js.Any = js.native
  def mkdir(path: java.lang.String): js.Any = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): js.Any = js.native
  def mmap(
    stream: FSStream,
    buffer: stdLib.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    prot: scala.Double,
    flags: scala.Double
  ): js.Any = js.native
  def mount(`type`: emscriptenLib.EmscriptenNs.FileSystemType, opts: js.Any, mountpoint: java.lang.String): js.Any = js.native
  def open(path: java.lang.String, flags: java.lang.String): FSStream = js.native
  def open(path: java.lang.String, flags: java.lang.String, mode: scala.Double): FSStream = js.native
  def open(path: java.lang.String, flags: java.lang.String, mode: scala.Double, fd_start: scala.Double): FSStream = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    mode: scala.Double,
    fd_start: scala.Double,
    fd_end: scala.Double
  ): FSStream = js.native
  def read(stream: FSStream, buffer: stdLib.ArrayBufferView, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def read(
    stream: FSStream,
    buffer: stdLib.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readFile(path: java.lang.String): js.Any = js.native
  def readFile(path: java.lang.String, opts: emscriptenLib.Anon_Encoding): js.Any = js.native
  def readdir(path: java.lang.String): js.Any = js.native
  def readlink(path: java.lang.String): java.lang.String = js.native
  def registerDevice(dev: scala.Double, ops: js.Any): scala.Unit = js.native
  def rename(old_path: java.lang.String, new_path: java.lang.String): scala.Unit = js.native
  def rmdir(path: java.lang.String): scala.Unit = js.native
  def stat(path: java.lang.String): js.Any = js.native
  def stat(path: java.lang.String, dontFollow: scala.Boolean): js.Any = js.native
  def symlink(oldpath: java.lang.String, newpath: java.lang.String): js.Any = js.native
  def syncfs(callback: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  def syncfs(callback: js.Function1[/* e */ js.Any, _], populate: scala.Boolean): scala.Unit = js.native
  //
  // core
  //
  def syncfs(populate: scala.Boolean, callback: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  def truncate(path: java.lang.String, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): scala.Unit = js.native
  def unmount(mountpoint: java.lang.String): scala.Unit = js.native
  def utime(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def write(stream: FSStream, buffer: stdLib.ArrayBufferView, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(
    stream: FSStream,
    buffer: stdLib.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def write(
    stream: FSStream,
    buffer: stdLib.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    canOwn: scala.Boolean
  ): scala.Double = js.native
  def writeFile(path: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: java.lang.String, opts: emscriptenLib.Anon_Encoding): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: stdLib.ArrayBufferView): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: stdLib.ArrayBufferView, opts: emscriptenLib.Anon_Encoding): scala.Unit = js.native
}

