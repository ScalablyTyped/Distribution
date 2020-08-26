package typings.emscripten

import typings.emscripten.Emscripten.CCallOpts
import typings.emscripten.Emscripten.CType
import typings.emscripten.Emscripten.FileSystemType
import typings.emscripten.Emscripten.JSType
import typings.emscripten.Emscripten.TypeCompatibleWithC
import typings.emscripten.FS.FSNode
import typings.emscripten.FS.FSStream
import typings.emscripten.FS.Lookup
import typings.emscripten.anon.Encoding
import typings.emscripten.anon.Flags
import typings.emscripten.anon.`0`
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var ALLOC_DYNAMIC: Double = js.native
  var ALLOC_NONE: Double = js.native
  var ALLOC_NORMAL: Double = js.native
  var ALLOC_STACK: Double = js.native
  var ALLOC_STATIC: Double = js.native
  var IDBFS: FileSystemType = js.native
  var MEMFS: FileSystemType = js.native
  var NODEFS: FileSystemType = js.native
  def UTF16ToString(ptr: Double): String = js.native
  def UTF32ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double, maxBytesToRead: Double): String = js.native
  def addFunction(func: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def addFunction(func: js.Function1[/* repeated */ js.Any, _], signature: String): Double = js.native
  def addRunDependency(id: js.Any): Unit = js.native
  def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double): Double = js.native
  def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: js.Array[Double], types: CType, allocator: Double): Double = js.native
  def allocate(slab: js.Array[Double], types: CType, allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: Double, types: js.Array[CType], allocator: Double): Double = js.native
  def allocate(slab: Double, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: Double, types: CType, allocator: Double): Double = js.native
  def allocate(slab: Double, types: CType, allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: ArrayBufferView, types: js.Array[CType], allocator: Double): Double = js.native
  def allocate(slab: ArrayBufferView, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: ArrayBufferView, types: CType, allocator: Double): Double = js.native
  def allocate(slab: ArrayBufferView, types: CType, allocator: Double, ptr: Double): Double = js.native
  def allocateUTF8(str: String): Double = js.native
  def allocateUTF8OnStack(str: String): Double = js.native
  def ccall(ident: String, returnType: Null, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  def ccall(
    ident: String,
    returnType: Null,
    argTypes: js.Array[JSType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  // Below runtime function/variable declarations are exportable by
  // -s EXTRA_EXPORTED_RUNTIME_METHODS. You can extend or merge
  // EmscriptenModule interface to add runtime functions.
  //
  // For example, by using -s "EXTRA_EXPORTED_RUNTIME_METHODS=['ccall']"
  // You can access ccall() via Module["ccall"]. In this case, you should
  // extend EmscriptenModule to pass the compiler check like the following:
  //
  // interface YourOwnEmscriptenModule extends EmscriptenModule {
  //     ccall: typeof ccall;
  // }
  //
  // See: https://emscripten.org/docs/getting_started/FAQ.html#why-do-i-get-typeerror-module-something-is-not-a-function
  def ccall(ident: String, returnType: JSType, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  def ccall(
    ident: String,
    returnType: JSType,
    argTypes: js.Array[JSType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: JSType, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: JSType, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  def getValue(ptr: Double, `type`: CType): Double = js.native
  def getValue(ptr: Double, `type`: CType, noSafe: Boolean): Double = js.native
  def intArrayFromString(stringy: String): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: js.UndefOr[scala.Nothing], length: Double): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
  def intArrayToString(array: js.Array[Double]): String = js.native
  def lengthBytesUTF16(str: String): Double = js.native
  def lengthBytesUTF32(str: String): Double = js.native
  def lengthBytesUTF8(str: String): Double = js.native
  def removeFunction(funcPtr: Double): Unit = js.native
  def removeRunDependency(id: js.Any): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: CType): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: CType, noSafe: Boolean): Unit = js.native
  def stackAlloc(size: Double): Double = js.native
  def stackRestore(ptr: Double): Unit = js.native
  def stackSave(): Double = js.native
  def stringToUTF16(str: String, outPtr: Double): Unit = js.native
  def stringToUTF16(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  def stringToUTF32(str: String, outPtr: Double): Unit = js.native
  def stringToUTF32(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  def stringToUTF8(str: String, outPtr: Double): Unit = js.native
  def stringToUTF8(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
  def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  @js.native
  object FS extends js.Object {
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
    def createDataFile(
      parent: String,
      name: String,
      data: ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = js.native
    def createDataFile(
      parent: FSNode,
      name: String,
      data: ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = js.native
    def createLazyFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    def createLazyFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    def createPreloadedFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
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
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean,
      canOwn: Boolean
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
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
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
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
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
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontCreateFile: Boolean,
      canOwn: Boolean
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
      dontCreateFile: js.UndefOr[scala.Nothing],
      canOwn: Boolean
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
    def mkdev(path: String, mode: js.UndefOr[scala.Nothing], dev: Double): js.Any = js.native
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
    def open(
      path: String,
      flags: String,
      mode: js.UndefOr[scala.Nothing],
      fd_start: js.UndefOr[scala.Nothing],
      fd_end: Double
    ): FSStream = js.native
    def open(path: String, flags: String, mode: js.UndefOr[scala.Nothing], fd_start: Double): FSStream = js.native
    def open(path: String, flags: String, mode: js.UndefOr[scala.Nothing], fd_start: Double, fd_end: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: js.UndefOr[scala.Nothing], fd_end: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = js.native
    def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    def readFile(path: String): Uint8Array = js.native
    def readFile(path: String, opts: Encoding): Uint8Array = js.native
    def readFile(path: String, opts: Flags): String = js.native
    def readFile(path: String, opts: `0`): Uint8Array = js.native
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
    def write(
      stream: FSStream,
      buffer: ArrayBufferView,
      offset: Double,
      length: Double,
      position: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Double = js.native
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
    def writeFile(path: String, data: String, opts: `0`): Unit = js.native
    def writeFile(path: String, data: ArrayBufferView): Unit = js.native
    def writeFile(path: String, data: ArrayBufferView, opts: `0`): Unit = js.native
  }
  
}

