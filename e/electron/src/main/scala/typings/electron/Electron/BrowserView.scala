package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserView extends StObject {
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle
  
  def setAutoResize(options: AutoResizeOptions): Unit
  
  def setBackgroundColor(color: String): Unit
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit
  
  var webContents: WebContents_
}
object BrowserView {
  
  inline def apply(
    getBounds: () => Rectangle,
    setAutoResize: AutoResizeOptions => Unit,
    setBackgroundColor: String => Unit,
    setBounds: Rectangle => Unit,
    webContents: WebContents_
  ): BrowserView = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), setAutoResize = js.Any.fromFunction1(setAutoResize), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setBounds = js.Any.fromFunction1(setBounds), webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserView]
  }
  
  extension [Self <: BrowserView](x: Self) {
    
    inline def setGetBounds(value: () => Rectangle): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setSetAutoResize(value: AutoResizeOptions => Unit): Self = StObject.set(x, "setAutoResize", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundColor(value: String => Unit): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetBounds(value: Rectangle => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction1(value))
    
    inline def setWebContents(value: WebContents_): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
  }
}
