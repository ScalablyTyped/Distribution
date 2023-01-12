package typings.electronSettings

import typings.electronSettings.mod.KeyPath
import typings.electronSettings.mod.SettingsObject
import typings.electronSettings.mod.SettingsValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(): js.Promise[Unit] = js.native
    def apply(keyPath: KeyPath): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply(): Unit = js.native
    def apply(keyPath: KeyPath): Unit = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[SettingsObject] = js.native
    def apply(keyPath: KeyPath): js.Promise[SettingsValue] = js.native
  }
  
  @js.native
  trait FnCallKeyPath extends StObject {
    
    def apply(): SettingsObject = js.native
    def apply(keyPath: KeyPath): SettingsValue = js.native
  }
  
  @js.native
  trait FnCallKeyPathObj extends StObject {
    
    def apply(keyPath: KeyPath, obj: SettingsValue): js.Promise[Unit] = js.native
    def apply(obj: SettingsObject): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait FnCallKeyPathValue extends StObject {
    
    def apply(keyPath: KeyPath, value: SettingsValue): Unit = js.native
    def apply(obj: SettingsObject): Unit = js.native
  }
  
  /* Inlined std.Partial<electron-settings.electron-settings.Config> */
  trait PartialConfig extends StObject {
    
    var atomicSave: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var electron: js.UndefOr[TypeofElectron] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var numSpaces: js.UndefOr[Double] = js.undefined
    
    var prettify: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      inline def setAtomicSave(value: Boolean): Self = StObject.set(x, "atomicSave", value.asInstanceOf[js.Any])
      
      inline def setAtomicSaveUndefined: Self = StObject.set(x, "atomicSave", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setElectron(value: TypeofElectron): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setNumSpaces(value: Double): Self = StObject.set(x, "numSpaces", value.asInstanceOf[js.Any])
      
      inline def setNumSpacesUndefined: Self = StObject.set(x, "numSpaces", js.undefined)
      
      inline def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
    }
  }
  
  trait TypeofCommon extends StObject {
    
    /* was `typeof NativeImage` */
    val nativeImage: Any
  }
  object TypeofCommon {
    
    inline def apply(nativeImage: Any): TypeofCommon = {
      val __obj = js.Dynamic.literal(nativeImage = nativeImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCommon] (val x: Self) extends AnyVal {
      
      inline def setNativeImage(value: Any): Self = StObject.set(x, "nativeImage", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofCrossProcessExports extends StObject {
    
    /* was `typeof NativeImage` */
    val nativeImage: Any
    
    /* was `typeof Session` */
    val session: Any
    
    /* was `typeof WebContents` */
    val webContents: Any
    
    /* was `typeof WebFrameMain` */
    val webFrameMain: Any
  }
  object TypeofCrossProcessExports {
    
    inline def apply(nativeImage: Any, session: Any, webContents: Any, webFrameMain: Any): TypeofCrossProcessExports = {
      val __obj = js.Dynamic.literal(nativeImage = nativeImage.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrameMain = webFrameMain.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCrossProcessExports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCrossProcessExports] (val x: Self) extends AnyVal {
      
      inline def setNativeImage(value: Any): Self = StObject.set(x, "nativeImage", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setWebContents(value: Any): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
      
      inline def setWebFrameMain(value: Any): Self = StObject.set(x, "webFrameMain", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofElectron extends StObject {
    
    val BrowserWindow: Any
    
    val Common: TypeofCommon
    
    val CrossProcessExports: TypeofCrossProcessExports
    
    val Main: TypeofMain
    
    val Menu: Any
    
    val NativeImage: Any
    
    /* was `typeof imported_events.EventEmitter` */
    val NodeEventEmitter: Any
    
    val Notification: Any
    
    val Renderer: Any
    
    val Session: Any
    
    val TouchBar: Any
    
    val WebContents: Any
    
    val WebFrameMain: Any
    
    /* was `typeof NativeImage` */
    val nativeImage: Any
    
    /* was `typeof Session` */
    val session: Any
    
    /* was `typeof WebContents` */
    val webContents: Any
    
    /* was `typeof WebFrameMain` */
    val webFrameMain: Any
  }
  object TypeofElectron {
    
    inline def apply(
      BrowserWindow: Any,
      Common: TypeofCommon,
      CrossProcessExports: TypeofCrossProcessExports,
      Main: TypeofMain,
      Menu: Any,
      NativeImage: Any,
      NodeEventEmitter: Any,
      Notification: Any,
      Renderer: Any,
      Session: Any,
      TouchBar: Any,
      WebContents: Any,
      WebFrameMain: Any,
      nativeImage: Any,
      session: Any,
      webContents: Any,
      webFrameMain: Any
    ): TypeofElectron = {
      val __obj = js.Dynamic.literal(BrowserWindow = BrowserWindow.asInstanceOf[js.Any], Common = Common.asInstanceOf[js.Any], CrossProcessExports = CrossProcessExports.asInstanceOf[js.Any], Main = Main.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], NativeImage = NativeImage.asInstanceOf[js.Any], NodeEventEmitter = NodeEventEmitter.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Renderer = Renderer.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebFrameMain = WebFrameMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrameMain = webFrameMain.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofElectron]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofElectron] (val x: Self) extends AnyVal {
      
      inline def setBrowserWindow(value: Any): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      inline def setCommon(value: TypeofCommon): Self = StObject.set(x, "Common", value.asInstanceOf[js.Any])
      
      inline def setCrossProcessExports(value: TypeofCrossProcessExports): Self = StObject.set(x, "CrossProcessExports", value.asInstanceOf[js.Any])
      
      inline def setMain(value: TypeofMain): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Any): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setNativeImage(value: Any): Self = StObject.set(x, "NativeImage", value.asInstanceOf[js.Any])
      
      inline def setNodeEventEmitter(value: Any): Self = StObject.set(x, "NodeEventEmitter", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: Any): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Any): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Any): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
      
      inline def setTouchBar(value: Any): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      inline def setWebContents(value: Any): Self = StObject.set(x, "WebContents", value.asInstanceOf[js.Any])
      
      inline def setWebFrameMain(value: Any): Self = StObject.set(x, "WebFrameMain", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofMain extends StObject {
    
    /* was `typeof Session` */
    val session: Any
    
    /* was `typeof WebContents` */
    val webContents: Any
    
    /* was `typeof WebFrameMain` */
    val webFrameMain: Any
  }
  object TypeofMain {
    
    inline def apply(session: Any, webContents: Any, webFrameMain: Any): TypeofMain = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrameMain = webFrameMain.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofMain] (val x: Self) extends AnyVal {
      
      inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setWebContents(value: Any): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
      
      inline def setWebFrameMain(value: Any): Self = StObject.set(x, "webFrameMain", value.asInstanceOf[js.Any])
    }
  }
}
