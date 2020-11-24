package typings.dwt.dynamsoftMod

import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamsoftLib extends js.Object {
  
  /**
    * A built-in method to set up a listener for the specified event type on the target element.
    * @param target Specify the HTML element.
    * @param type Specify the event
    * @param listener Specify the callback
    */
  def addEventListener(target: HTMLElement, `type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  
  /**
    * Whether to enable debugging. Once enabled, debugging inforamtion is printed out in the browser console.
    */
  var debug: Boolean = js.native
  
  var detect: DSLibDetect = js.native
  
  var dlgLoadingShowStatus: Boolean = js.native
  
  var env: DSLibEnv = js.native
  
  /**
    * Load the specified script.
    * @param url Specify the URL of the script.
    * @param bAsync Whether to load the script asynchronously.
    * @param callback Callback function triggered when the script is loaded.
    */
  def getScript(url: String, bAsync: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Load the specified scripts.
    * @param urls Specify the URLs of the scripts.
    * @param bAsync Whether to load the script asynchronously.
    * @param callback Callback function triggered when the scripts are all loaded.
    */
  def getScripts(urls: js.Array[String], bAsync: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Hide the built-in page mask
    */
  def hideMask(): Unit = js.native
  
  var product: Product = js.native
  
  /**
    * Show the built-in page mask
    */
  def showMask(): Unit = js.native
}
object DynamsoftLib {
  
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, EventListenerOrEventListenerObject) => Unit,
    debug: Boolean,
    detect: DSLibDetect,
    dlgLoadingShowStatus: Boolean,
    env: DSLibEnv,
    getScript: (String, Boolean, js.Function0[Unit]) => Unit,
    getScripts: (js.Array[String], Boolean, js.Function0[Unit]) => Unit,
    hideMask: () => Unit,
    product: Product,
    showMask: () => Unit
  ): DynamsoftLib = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), debug = debug.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], dlgLoadingShowStatus = dlgLoadingShowStatus.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getScript = js.Any.fromFunction3(getScript), getScripts = js.Any.fromFunction3(getScripts), hideMask = js.Any.fromFunction0(hideMask), product = product.asInstanceOf[js.Any], showMask = js.Any.fromFunction0(showMask))
    __obj.asInstanceOf[DynamsoftLib]
  }
  
  @scala.inline
  implicit class DynamsoftLibOps[Self <: DynamsoftLib] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (HTMLElement, String, EventListenerOrEventListenerObject) => Unit): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: DSLibDetect): Self = this.set("detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlgLoadingShowStatus(value: Boolean): Self = this.set("dlgLoadingShowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: DSLibEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScript(value: (String, Boolean, js.Function0[Unit]) => Unit): Self = this.set("getScript", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetScripts(value: (js.Array[String], Boolean, js.Function0[Unit]) => Unit): Self = this.set("getScripts", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHideMask(value: () => Unit): Self = this.set("hideMask", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProduct(value: Product): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMask(value: () => Unit): Self = this.set("showMask", js.Any.fromFunction0(value))
  }
}
