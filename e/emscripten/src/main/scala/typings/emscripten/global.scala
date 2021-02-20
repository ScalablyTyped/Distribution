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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ALLOC_DYNAMIC")
  @js.native
  def ALLOC_DYNAMIC: Double = js.native
  @scala.inline
  def ALLOC_DYNAMIC_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_NONE")
  @js.native
  def ALLOC_NONE: Double = js.native
  @scala.inline
  def ALLOC_NONE_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_NONE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_NORMAL")
  @js.native
  def ALLOC_NORMAL: Double = js.native
  @scala.inline
  def ALLOC_NORMAL_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_NORMAL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_STACK")
  @js.native
  def ALLOC_STACK: Double = js.native
  @scala.inline
  def ALLOC_STACK_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_STACK")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_STATIC")
  @js.native
  def ALLOC_STATIC: Double = js.native
  @scala.inline
  def ALLOC_STATIC_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_STATIC")(x.asInstanceOf[js.Any])
  
  object FS {
    
    @JSGlobal("FS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FS.allocate")
    @js.native
    def allocate(stream: FSStream, offset: Double, length: Double): Unit = js.native
    
    @JSGlobal("FS.chdir")
    @js.native
    def chdir(path: String): Unit = js.native
    
    @JSGlobal("FS.chmod")
    @js.native
    def chmod(path: String, mode: Double): Unit = js.native
    @JSGlobal("FS.chmod")
    @js.native
    def chmod(path: String, mode: Double, dontFollow: Boolean): Unit = js.native
    
    @JSGlobal("FS.chown")
    @js.native
    def chown(path: String, uid: Double, gid: Double): Unit = js.native
    @JSGlobal("FS.chown")
    @js.native
    def chown(path: String, uid: Double, gid: Double, dontFollow: Boolean): Unit = js.native
    
    @JSGlobal("FS.close")
    @js.native
    def close(stream: FSStream): Unit = js.native
    
    @JSGlobal("FS.createDataFile")
    @js.native
    def createDataFile(
      parent: String,
      name: String,
      data: ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = js.native
    @JSGlobal("FS.createDataFile")
    @js.native
    def createDataFile(
      parent: FSNode,
      name: String,
      data: ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = js.native
    
    @JSGlobal("FS.createLazyFile")
    @js.native
    def createLazyFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    @JSGlobal("FS.createLazyFile")
    @js.native
    def createLazyFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.UndefOr[scala.Nothing],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.createPreloadedFile")
    @js.native
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
    @JSGlobal("FS.cwd")
    @js.native
    def cwd(): String = js.native
    
    @JSGlobal("FS.fchmod")
    @js.native
    def fchmod(fd: Double, mode: Double): Unit = js.native
    
    @JSGlobal("FS.fchown")
    @js.native
    def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
    
    @JSGlobal("FS.ftruncate")
    @js.native
    def ftruncate(fd: Double, len: Double): Unit = js.native
    
    @JSGlobal("FS.genericErrors")
    @js.native
    def genericErrors: js.Any = js.native
    @scala.inline
    def genericErrors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("genericErrors")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FS.getPath")
    @js.native
    def getPath(node: FSNode): String = js.native
    
    @JSGlobal("FS.ignorePermissions")
    @js.native
    def ignorePermissions: Boolean = js.native
    @scala.inline
    def ignorePermissions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignorePermissions")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FS.init")
    @js.native
    def init(): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: js.Function0[Double | Null]): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: js.Function0[Double | Null], output: js.Function1[/* c */ Double, _]): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(
      input: js.Function0[Double | Null],
      output: js.Function1[/* c */ Double, _],
      error: js.Function1[/* c */ Double, _]
    ): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: js.Function0[Double | Null], output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: Null, output: js.Function1[/* c */ Double, _]): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: Null, output: js.Function1[/* c */ Double, _], error: js.Function1[/* c */ Double, _]): Unit = js.native
    @JSGlobal("FS.init")
    @js.native
    def init(input: Null, output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
    
    @JSGlobal("FS.ioctl")
    @js.native
    def ioctl(stream: FSStream, cmd: js.Any, arg: js.Any): js.Any = js.native
    
    @JSGlobal("FS.isBlkdev")
    @js.native
    def isBlkdev(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.isChrdev")
    @js.native
    def isChrdev(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.isDir")
    @js.native
    def isDir(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.isFIFO")
    @js.native
    def isFIFO(mode: Double): Boolean = js.native
    
    //
    // nodes
    //
    @JSGlobal("FS.isFile")
    @js.native
    def isFile(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.isLink")
    @js.native
    def isLink(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.isSocket")
    @js.native
    def isSocket(mode: Double): Boolean = js.native
    
    @JSGlobal("FS.lchmod")
    @js.native
    def lchmod(path: String, mode: Double): Unit = js.native
    
    @JSGlobal("FS.lchown")
    @js.native
    def lchown(path: String, uid: Double, gid: Double): Unit = js.native
    
    @JSGlobal("FS.llseek")
    @js.native
    def llseek(stream: FSStream, offset: Double, whence: Double): js.Any = js.native
    
    //
    // paths
    //
    @JSGlobal("FS.lookupPath")
    @js.native
    def lookupPath(path: String, opts: js.Any): Lookup = js.native
    
    @JSGlobal("FS.lstat")
    @js.native
    def lstat(path: String): js.Any = js.native
    
    //
    // devices
    //
    @JSGlobal("FS.major")
    @js.native
    def major(dev: Double): Double = js.native
    
    @JSGlobal("FS.makedev")
    @js.native
    def makedev(ma: Double, mi: Double): Double = js.native
    
    @JSGlobal("FS.minor")
    @js.native
    def minor(dev: Double): Double = js.native
    
    @JSGlobal("FS.mkdev")
    @js.native
    def mkdev(path: String): js.Any = js.native
    @JSGlobal("FS.mkdev")
    @js.native
    def mkdev(path: String, mode: js.UndefOr[scala.Nothing], dev: Double): js.Any = js.native
    @JSGlobal("FS.mkdev")
    @js.native
    def mkdev(path: String, mode: Double): js.Any = js.native
    @JSGlobal("FS.mkdev")
    @js.native
    def mkdev(path: String, mode: Double, dev: Double): js.Any = js.native
    
    @JSGlobal("FS.mkdir")
    @js.native
    def mkdir(path: String): js.Any = js.native
    @JSGlobal("FS.mkdir")
    @js.native
    def mkdir(path: String, mode: Double): js.Any = js.native
    
    @JSGlobal("FS.mmap")
    @js.native
    def mmap(
      stream: FSStream,
      buffer: ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      prot: Double,
      flags: Double
    ): js.Any = js.native
    
    @JSGlobal("FS.mount")
    @js.native
    def mount(`type`: FileSystemType, opts: js.Any, mountpoint: String): js.Any = js.native
    
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(
      path: String,
      flags: String,
      mode: js.UndefOr[scala.Nothing],
      fd_start: js.UndefOr[scala.Nothing],
      fd_end: Double
    ): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: js.UndefOr[scala.Nothing], fd_start: Double): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: js.UndefOr[scala.Nothing], fd_start: Double, fd_end: Double): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: Double): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: Double, fd_start: js.UndefOr[scala.Nothing], fd_end: Double): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double): FSStream = js.native
    @JSGlobal("FS.open")
    @js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = js.native
    
    @JSGlobal("FS.read")
    @js.native
    def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    @JSGlobal("FS.read")
    @js.native
    def read(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    
    @JSGlobal("FS.readFile")
    @js.native
    def readFile(path: String): Uint8Array = js.native
    @JSGlobal("FS.readFile")
    @js.native
    def readFile(path: String, opts: Encoding): Uint8Array = js.native
    @JSGlobal("FS.readFile")
    @js.native
    def readFile(path: String, opts: Flags): String = js.native
    @JSGlobal("FS.readFile")
    @js.native
    def readFile(path: String, opts: `0`): Uint8Array = js.native
    
    @JSGlobal("FS.readdir")
    @js.native
    def readdir(path: String): js.Any = js.native
    
    @JSGlobal("FS.readlink")
    @js.native
    def readlink(path: String): String = js.native
    
    @JSGlobal("FS.registerDevice")
    @js.native
    def registerDevice(dev: Double, ops: js.Any): Unit = js.native
    
    @JSGlobal("FS.rename")
    @js.native
    def rename(old_path: String, new_path: String): Unit = js.native
    
    @JSGlobal("FS.rmdir")
    @js.native
    def rmdir(path: String): Unit = js.native
    
    @JSGlobal("FS.stat")
    @js.native
    def stat(path: String): js.Any = js.native
    @JSGlobal("FS.stat")
    @js.native
    def stat(path: String, dontFollow: Boolean): js.Any = js.native
    
    @JSGlobal("FS.symlink")
    @js.native
    def symlink(oldpath: String, newpath: String): js.Any = js.native
    
    @JSGlobal("FS.syncfs")
    @js.native
    def syncfs(callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
    @JSGlobal("FS.syncfs")
    @js.native
    def syncfs(callback: js.Function1[/* e */ js.Any, _], populate: Boolean): Unit = js.native
    //
    // core
    //
    @JSGlobal("FS.syncfs")
    @js.native
    def syncfs(populate: Boolean, callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
    
    @JSGlobal("FS.tracking")
    @js.native
    def tracking: js.Any = js.native
    
    @JSGlobal("FS.trackingDelegate")
    @js.native
    def trackingDelegate: js.Any = js.native
    @scala.inline
    def trackingDelegate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackingDelegate")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tracking_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tracking")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FS.truncate")
    @js.native
    def truncate(path: String, len: Double): Unit = js.native
    
    @JSGlobal("FS.unlink")
    @js.native
    def unlink(path: String): Unit = js.native
    
    @JSGlobal("FS.unmount")
    @js.native
    def unmount(mountpoint: String): Unit = js.native
    
    @JSGlobal("FS.utime")
    @js.native
    def utime(path: String, atime: Double, mtime: Double): Unit = js.native
    
    @JSGlobal("FS.write")
    @js.native
    def write(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    @JSGlobal("FS.write")
    @js.native
    def write(
      stream: FSStream,
      buffer: ArrayBufferView,
      offset: Double,
      length: Double,
      position: js.UndefOr[scala.Nothing],
      canOwn: Boolean
    ): Double = js.native
    @JSGlobal("FS.write")
    @js.native
    def write(stream: FSStream, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    @JSGlobal("FS.write")
    @js.native
    def write(
      stream: FSStream,
      buffer: ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      canOwn: Boolean
    ): Double = js.native
    
    @JSGlobal("FS.writeFile")
    @js.native
    def writeFile(path: String, data: String): Unit = js.native
    @JSGlobal("FS.writeFile")
    @js.native
    def writeFile(path: String, data: String, opts: `0`): Unit = js.native
    @JSGlobal("FS.writeFile")
    @js.native
    def writeFile(path: String, data: ArrayBufferView): Unit = js.native
    @JSGlobal("FS.writeFile")
    @js.native
    def writeFile(path: String, data: ArrayBufferView, opts: `0`): Unit = js.native
  }
  
  @JSGlobal("IDBFS")
  @js.native
  def IDBFS: FileSystemType = js.native
  @scala.inline
  def IDBFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("IDBFS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MEMFS")
  @js.native
  def MEMFS: FileSystemType = js.native
  @scala.inline
  def MEMFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("MEMFS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("NODEFS")
  @js.native
  def NODEFS: FileSystemType = js.native
  @scala.inline
  def NODEFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("NODEFS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("UTF16ToString")
  @js.native
  def UTF16ToString(ptr: Double): String = js.native
  
  @JSGlobal("UTF32ToString")
  @js.native
  def UTF32ToString(ptr: Double): String = js.native
  
  @JSGlobal("UTF8ToString")
  @js.native
  def UTF8ToString(ptr: Double): String = js.native
  @JSGlobal("UTF8ToString")
  @js.native
  def UTF8ToString(ptr: Double, maxBytesToRead: Double): String = js.native
  
  @JSGlobal("addFunction")
  @js.native
  def addFunction(func: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  @JSGlobal("addFunction")
  @js.native
  def addFunction(func: js.Function1[/* repeated */ js.Any, _], signature: String): Double = js.native
  
  @JSGlobal("addRunDependency")
  @js.native
  def addRunDependency(id: js.Any): Unit = js.native
  
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: js.Array[Double], types: CType, allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: js.Array[Double], types: CType, allocator: Double, ptr: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: Double, types: js.Array[CType], allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: Double, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: Double, types: CType, allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: Double, types: CType, allocator: Double, ptr: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: ArrayBufferView, types: js.Array[CType], allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: ArrayBufferView, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: ArrayBufferView, types: CType, allocator: Double): Double = js.native
  @JSGlobal("allocate")
  @js.native
  def allocate(slab: ArrayBufferView, types: CType, allocator: Double, ptr: Double): Double = js.native
  
  @JSGlobal("allocateUTF8")
  @js.native
  def allocateUTF8(str: String): Double = js.native
  
  @JSGlobal("allocateUTF8OnStack")
  @js.native
  def allocateUTF8OnStack(str: String): Double = js.native
  
  @JSGlobal("ccall")
  @js.native
  def ccall(ident: String, returnType: Null, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  @JSGlobal("ccall")
  @js.native
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
  @JSGlobal("ccall")
  @js.native
  def ccall(ident: String, returnType: JSType, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  @JSGlobal("ccall")
  @js.native
  def ccall(
    ident: String,
    returnType: JSType,
    argTypes: js.Array[JSType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  
  @JSGlobal("cwrap")
  @js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSGlobal("cwrap")
  @js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSGlobal("cwrap")
  @js.native
  def cwrap(ident: String, returnType: JSType, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSGlobal("cwrap")
  @js.native
  def cwrap(ident: String, returnType: JSType, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSGlobal("getValue")
  @js.native
  def getValue(ptr: Double, `type`: CType): Double = js.native
  @JSGlobal("getValue")
  @js.native
  def getValue(ptr: Double, `type`: CType, noSafe: Boolean): Double = js.native
  
  @JSGlobal("intArrayFromString")
  @js.native
  def intArrayFromString(stringy: String): js.Array[Double] = js.native
  @JSGlobal("intArrayFromString")
  @js.native
  def intArrayFromString(stringy: String, dontAddNull: js.UndefOr[scala.Nothing], length: Double): js.Array[Double] = js.native
  @JSGlobal("intArrayFromString")
  @js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
  @JSGlobal("intArrayFromString")
  @js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
  
  @JSGlobal("intArrayToString")
  @js.native
  def intArrayToString(array: js.Array[Double]): String = js.native
  
  @JSGlobal("lengthBytesUTF16")
  @js.native
  def lengthBytesUTF16(str: String): Double = js.native
  
  @JSGlobal("lengthBytesUTF32")
  @js.native
  def lengthBytesUTF32(str: String): Double = js.native
  
  @JSGlobal("lengthBytesUTF8")
  @js.native
  def lengthBytesUTF8(str: String): Double = js.native
  
  @JSGlobal("removeFunction")
  @js.native
  def removeFunction(funcPtr: Double): Unit = js.native
  
  @JSGlobal("removeRunDependency")
  @js.native
  def removeRunDependency(id: js.Any): Unit = js.native
  
  @JSGlobal("setValue")
  @js.native
  def setValue(ptr: Double, value: js.Any, `type`: CType): Unit = js.native
  @JSGlobal("setValue")
  @js.native
  def setValue(ptr: Double, value: js.Any, `type`: CType, noSafe: Boolean): Unit = js.native
  
  @JSGlobal("stackAlloc")
  @js.native
  def stackAlloc(size: Double): Double = js.native
  
  @JSGlobal("stackRestore")
  @js.native
  def stackRestore(ptr: Double): Unit = js.native
  
  @JSGlobal("stackSave")
  @js.native
  def stackSave(): Double = js.native
  
  @JSGlobal("stringToUTF16")
  @js.native
  def stringToUTF16(str: String, outPtr: Double): Unit = js.native
  @JSGlobal("stringToUTF16")
  @js.native
  def stringToUTF16(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  
  @JSGlobal("stringToUTF32")
  @js.native
  def stringToUTF32(str: String, outPtr: Double): Unit = js.native
  @JSGlobal("stringToUTF32")
  @js.native
  def stringToUTF32(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  
  @JSGlobal("stringToUTF8")
  @js.native
  def stringToUTF8(str: String, outPtr: Double): Unit = js.native
  @JSGlobal("stringToUTF8")
  @js.native
  def stringToUTF8(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  
  @JSGlobal("writeArrayToMemory")
  @js.native
  def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
  
  @JSGlobal("writeAsciiToMemory")
  @js.native
  def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  
  @JSGlobal("writeStringToMemory")
  @js.native
  def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
}
