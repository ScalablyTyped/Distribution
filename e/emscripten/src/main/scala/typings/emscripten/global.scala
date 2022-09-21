package typings.emscripten

import typings.emscripten.Emscripten.CCallOpts
import typings.emscripten.Emscripten.CType
import typings.emscripten.Emscripten.FileSystemType
import typings.emscripten.Emscripten.JSType
import typings.emscripten.FS.FSNode
import typings.emscripten.FS.FSStream
import typings.emscripten.FS.Lookup
import typings.emscripten.anon.Encoding
import typings.emscripten.anon.Flags
import typings.emscripten.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ALLOC_DYNAMIC")
  @js.native
  def ALLOC_DYNAMIC: Double = js.native
  inline def ALLOC_DYNAMIC_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_NONE")
  @js.native
  def ALLOC_NONE: Double = js.native
  inline def ALLOC_NONE_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_NONE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_NORMAL")
  @js.native
  def ALLOC_NORMAL: Double = js.native
  inline def ALLOC_NORMAL_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_NORMAL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_STACK")
  @js.native
  def ALLOC_STACK: Double = js.native
  inline def ALLOC_STACK_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_STACK")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ALLOC_STATIC")
  @js.native
  def ALLOC_STATIC: Double = js.native
  inline def ALLOC_STATIC_=(x: Double): Unit = js.Dynamic.global.updateDynamic("ALLOC_STATIC")(x.asInstanceOf[js.Any])
  
  object FS {
    
    @JSGlobal("FS")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allocate(stream: FSStream, offset: Double, length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(stream.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def chdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def chmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def chmod(path: String, mode: Double, dontFollow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], dontFollow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def chown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def chown(path: String, uid: Double, gid: Double, dontFollow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], dontFollow.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def close(stream: FSStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createDataFile(
      parent: String,
      name: String,
      data: js.typedarray.ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createDataFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[FSNode]
    inline def createDataFile(
      parent: FSNode,
      name: String,
      data: js.typedarray.ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): FSNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createDataFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[FSNode]
    
    inline def createLazyFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createLazyFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any])).asInstanceOf[FSNode]
    inline def createLazyFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createLazyFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any])).asInstanceOf[FSNode]
    
    inline def createPreloadedFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadedFile")(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], canRead.asInstanceOf[js.Any], canWrite.asInstanceOf[js.Any], onload.asInstanceOf[js.Any], onerror.asInstanceOf[js.Any], dontCreateFile.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    //
    // module-level FS code
    //
    inline def cwd(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cwd")().asInstanceOf[String]
    
    inline def fchmod(fd: Double, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fchown(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ftruncate(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("FS.genericErrors")
    @js.native
    def genericErrors: Any = js.native
    inline def genericErrors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("genericErrors")(x.asInstanceOf[js.Any])
    
    inline def getPath(node: FSNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("FS.ignorePermissions")
    @js.native
    def ignorePermissions: Boolean = js.native
    inline def ignorePermissions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignorePermissions")(x.asInstanceOf[js.Any])
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(input: js.Function0[Double | Null]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(input: js.Function0[Double | Null], output: js.Function1[/* c */ Double, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      input: js.Function0[Double | Null],
      output: js.Function1[/* c */ Double, Any],
      error: js.Function1[/* c */ Double, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(input: js.Function0[Double | Null], output: Null, error: js.Function1[/* c */ Double, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(input: Null, output: js.Function1[/* c */ Double, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(input: Null, output: js.Function1[/* c */ Double, Any], error: js.Function1[/* c */ Double, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(input: Null, output: Null, error: js.Function1[/* c */ Double, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ioctl(stream: FSStream, cmd: Any, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ioctl")(stream.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isBlkdev(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlkdev")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isChrdev(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrdev")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDir(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFIFO(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFIFO")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    //
    // nodes
    //
    inline def isFile(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLink(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLink")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSocket(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSocket")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def lchmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lchown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def llseek(stream: FSStream, offset: Double, whence: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("llseek")(stream.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], whence.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    //
    // paths
    //
    inline def lookupPath(path: String, opts: Any): Lookup = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPath")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Lookup]
    
    inline def lstat(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    //
    // devices
    //
    inline def major(dev: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("major")(dev.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def makedev(ma: Double, mi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("makedev")(ma.asInstanceOf[js.Any], mi.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def minor(dev: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minor")(dev.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def mkdev(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdev")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def mkdev(path: String, mode: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdev")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def mkdev(path: String, mode: Double, dev: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdev")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def mkdev(path: String, mode: Unit, dev: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdev")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def mkdir(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def mkdir(path: String, mode: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def mmap(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      prot: Double,
      flags: Double
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mmap")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], prot.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def mount(`type`: FileSystemType, opts: Any, mountpoint: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], mountpoint.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def open(path: String, flags: String): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Double, fd_start: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any], fd_end.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Double, fd_start: Unit, fd_end: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any], fd_end.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Unit, fd_start: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Unit, fd_start: Double, fd_end: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any], fd_end.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    inline def open(path: String, flags: String, mode: Unit, fd_start: Unit, fd_end: Double): FSStream = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], fd_start.asInstanceOf[js.Any], fd_end.asInstanceOf[js.Any])).asInstanceOf[FSStream]
    
    inline def read(stream: FSStream, buffer: js.typedarray.ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def read(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def readFile(path: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def readFile(path: String, opts: Encoding): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def readFile(path: String, opts: Flags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def readFile(path: String, opts: `0`): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def readdir(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def readlink(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def registerDevice(dev: Double, ops: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDevice")(dev.asInstanceOf[js.Any], ops.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rename(old_path: String, new_path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(old_path.asInstanceOf[js.Any], new_path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rmdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def stat(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def stat(path: String, dontFollow: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], dontFollow.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def symlink(oldpath: String, newpath: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(oldpath.asInstanceOf[js.Any], newpath.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def syncfs(callback: js.Function1[/* e */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncfs")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def syncfs(callback: js.Function1[/* e */ Any, Any], populate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncfs")(callback.asInstanceOf[js.Any], populate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    //
    // core
    //
    inline def syncfs(populate: Boolean, callback: js.Function1[/* e */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncfs")(populate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("FS.tracking")
    @js.native
    def tracking: Any = js.native
    
    @JSGlobal("FS.trackingDelegate")
    @js.native
    def trackingDelegate: Any = js.native
    inline def trackingDelegate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackingDelegate")(x.asInstanceOf[js.Any])
    
    inline def tracking_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tracking")(x.asInstanceOf[js.Any])
    
    inline def truncate(path: String, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unlink(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unmount(mountpoint: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(mountpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def utime(path: String, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utime")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def write(stream: FSStream, buffer: js.typedarray.ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      canOwn: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Unit,
      canOwn: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(stream.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], canOwn.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def writeFile(path: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(path: String, data: String, opts: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(path: String, data: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(path: String, data: js.typedarray.ArrayBufferView, opts: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("IDBFS")
  @js.native
  def IDBFS: FileSystemType = js.native
  inline def IDBFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("IDBFS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("MEMFS")
  @js.native
  def MEMFS: FileSystemType = js.native
  inline def MEMFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("MEMFS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("NODEFS")
  @js.native
  def NODEFS: FileSystemType = js.native
  inline def NODEFS_=(x: FileSystemType): Unit = js.Dynamic.global.updateDynamic("NODEFS")(x.asInstanceOf[js.Any])
  
  inline def UTF16ToString(ptr: Double): String = js.Dynamic.global.applyDynamic("UTF16ToString")(ptr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def UTF32ToString(ptr: Double): String = js.Dynamic.global.applyDynamic("UTF32ToString")(ptr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def UTF8ToString(ptr: Double): String = js.Dynamic.global.applyDynamic("UTF8ToString")(ptr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def UTF8ToString(ptr: Double, maxBytesToRead: Double): String = (js.Dynamic.global.applyDynamic("UTF8ToString")(ptr.asInstanceOf[js.Any], maxBytesToRead.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def addFunction(func: js.Function1[/* repeated */ Any, Any]): Double = js.Dynamic.global.applyDynamic("addFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def addFunction(func: js.Function1[/* repeated */ Any, Any], signature: String): Double = (js.Dynamic.global.applyDynamic("addFunction")(func.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def addRunDependency(id: Any): Unit = js.Dynamic.global.applyDynamic("addRunDependency")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.Array[Double], types: js.Array[CType], allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.Array[Double], types: CType, allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.Array[Double], types: CType, allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.typedarray.ArrayBufferView, types: js.Array[CType], allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.typedarray.ArrayBufferView, types: js.Array[CType], allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.typedarray.ArrayBufferView, types: CType, allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: js.typedarray.ArrayBufferView, types: CType, allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: Double, types: js.Array[CType], allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: Double, types: js.Array[CType], allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: Double, types: CType, allocator: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def allocate(slab: Double, types: CType, allocator: Double, ptr: Double): Double = (js.Dynamic.global.applyDynamic("allocate")(slab.asInstanceOf[js.Any], types.asInstanceOf[js.Any], allocator.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def allocateUTF8(str: String): Double = js.Dynamic.global.applyDynamic("allocateUTF8")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def allocateUTF8OnStack(str: String): Double = js.Dynamic.global.applyDynamic("allocateUTF8OnStack")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ccall[I /* <: js.Array[Any | JSType | Null] */, R /* <: JSType | Null */](ident: String, returnType: R, argTypes: I, args: ArgsToType[I]): ReturnToType[R] = (js.Dynamic.global.applyDynamic("ccall")(ident.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ReturnToType[R]]
  inline def ccall[I /* <: js.Array[Any | JSType | Null] */, R /* <: JSType | Null */](ident: String, returnType: R, argTypes: I, args: ArgsToType[I], opts: CCallOpts): ReturnToType[R] = (js.Dynamic.global.applyDynamic("ccall")(ident.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReturnToType[R]]
  
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
  inline def cwrap[I /* <: js.Array[Any | JSType | Null] */, R /* <: JSType | Null */](ident: String, returnType: R, argTypes: I): js.Function1[/* arg */ ArgsToType[I], ReturnToType[R]] = (js.Dynamic.global.applyDynamic("cwrap")(ident.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ ArgsToType[I], ReturnToType[R]]]
  inline def cwrap[I /* <: js.Array[Any | JSType | Null] */, R /* <: JSType | Null */](ident: String, returnType: R, argTypes: I, opts: CCallOpts): js.Function1[/* arg */ ArgsToType[I], ReturnToType[R]] = (js.Dynamic.global.applyDynamic("cwrap")(ident.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ ArgsToType[I], ReturnToType[R]]]
  
  inline def getValue(ptr: Double, `type`: CType): Double = (js.Dynamic.global.applyDynamic("getValue")(ptr.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getValue(ptr: Double, `type`: CType, noSafe: Boolean): Double = (js.Dynamic.global.applyDynamic("getValue")(ptr.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], noSafe.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def intArrayFromString(stringy: String): js.Array[Double] = js.Dynamic.global.applyDynamic("intArrayFromString")(stringy.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = (js.Dynamic.global.applyDynamic("intArrayFromString")(stringy.asInstanceOf[js.Any], dontAddNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = (js.Dynamic.global.applyDynamic("intArrayFromString")(stringy.asInstanceOf[js.Any], dontAddNull.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def intArrayFromString(stringy: String, dontAddNull: Unit, length: Double): js.Array[Double] = (js.Dynamic.global.applyDynamic("intArrayFromString")(stringy.asInstanceOf[js.Any], dontAddNull.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def intArrayToString(array: js.Array[Double]): String = js.Dynamic.global.applyDynamic("intArrayToString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lengthBytesUTF16(str: String): Double = js.Dynamic.global.applyDynamic("lengthBytesUTF16")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lengthBytesUTF32(str: String): Double = js.Dynamic.global.applyDynamic("lengthBytesUTF32")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lengthBytesUTF8(str: String): Double = js.Dynamic.global.applyDynamic("lengthBytesUTF8")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeFunction(funcPtr: Double): Unit = js.Dynamic.global.applyDynamic("removeFunction")(funcPtr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeRunDependency(id: Any): Unit = js.Dynamic.global.applyDynamic("removeRunDependency")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setValue(ptr: Double, value: Any, `type`: CType): Unit = (js.Dynamic.global.applyDynamic("setValue")(ptr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setValue(ptr: Double, value: Any, `type`: CType, noSafe: Boolean): Unit = (js.Dynamic.global.applyDynamic("setValue")(ptr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], noSafe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackAlloc(size: Double): Double = js.Dynamic.global.applyDynamic("stackAlloc")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def stackRestore(ptr: Double): Unit = js.Dynamic.global.applyDynamic("stackRestore")(ptr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stackSave(): Double = js.Dynamic.global.applyDynamic("stackSave")().asInstanceOf[Double]
  
  inline def stringToUTF16(str: String, outPtr: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF16")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stringToUTF16(str: String, outPtr: Double, maxBytesToRead: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF16")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any], maxBytesToRead.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringToUTF32(str: String, outPtr: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF32")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stringToUTF32(str: String, outPtr: Double, maxBytesToRead: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF32")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any], maxBytesToRead.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringToUTF8(str: String, outPtr: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF8")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stringToUTF8(str: String, outPtr: Double, maxBytesToRead: Double): Unit = (js.Dynamic.global.applyDynamic("stringToUTF8")(str.asInstanceOf[js.Any], outPtr.asInstanceOf[js.Any], maxBytesToRead.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = (js.Dynamic.global.applyDynamic("writeArrayToMemory")(array.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = (js.Dynamic.global.applyDynamic("writeAsciiToMemory")(str.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], dontAddNull.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = (js.Dynamic.global.applyDynamic("writeStringToMemory")(str.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], dontAddNull.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
