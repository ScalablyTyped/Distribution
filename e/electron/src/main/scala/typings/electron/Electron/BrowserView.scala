package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserView extends js.Object {
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle = js.native
  
  def setAutoResize(options: AutoResizeOptions): Unit = js.native
  
  def setBackgroundColor(color: String): Unit = js.native
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit = js.native
  
  var webContents: WebContents_ = js.native
}
object BrowserView {
  
  @scala.inline
  def apply(
    getBounds: () => Rectangle,
    setAutoResize: AutoResizeOptions => Unit,
    setBackgroundColor: String => Unit,
    setBounds: Rectangle => Unit,
    webContents: WebContents_
  ): BrowserView = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), setAutoResize = js.Any.fromFunction1(setAutoResize), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setBounds = js.Any.fromFunction1(setBounds), webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserView]
  }
  
  @scala.inline
  implicit class BrowserViewOps[Self <: BrowserView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBounds(value: () => Rectangle): Self = this.set("getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAutoResize(value: AutoResizeOptions => Unit): Self = this.set("setAutoResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundColor(value: String => Unit): Self = this.set("setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBounds(value: Rectangle => Unit): Self = this.set("setBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebContents(value: WebContents_): Self = this.set("webContents", value.asInstanceOf[js.Any])
  }
}
