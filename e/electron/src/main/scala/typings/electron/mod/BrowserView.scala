package typings.electron.mod

import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "BrowserView")
@js.native
// Docs: https://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView ()
  extends StObject
     with typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  /* CompleteClass */
  override def getBounds(): Rectangle = js.native
  
  /* CompleteClass */
  override def setAutoResize(options: AutoResizeOptions): Unit = js.native
  
  /* CompleteClass */
  override def setBackgroundColor(color: String): Unit = js.native
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  /* CompleteClass */
  override def setBounds(bounds: Rectangle): Unit = js.native
  
  /* CompleteClass */
  var webContents: typings.electron.Electron.WebContents_ = js.native
}
