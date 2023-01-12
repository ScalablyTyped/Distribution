package typings.electron.Electron

import typings.electron.electronStrings.`background-tab`
import typings.electron.electronStrings.`foreground-tab`
import typings.electron.electronStrings.`new-window`
import typings.electron.electronStrings.`save-to-disk`
import typings.electron.electronStrings.default
import typings.electron.electronStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidCreateWindowDetails extends StObject {
  
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other
  
  /**
    * Name given to the created window in the `window.open()` call.
    */
  var frameName: String
  
  /**
    * The options used to create the BrowserWindow. They are merged in increasing
    * precedence: parsed options from the `features` string from `window.open()`,
    * security-related webPreferences inherited from the parent, and options given by
    * `webContents.setWindowOpenHandler`. Unrecognized options are not filtered out.
    */
  var options: BrowserWindowConstructorOptions
  
  /**
    * The post data that will be sent to the new window, along with the appropriate
    * headers that will be set. If no post data is to be sent, the value will be
    * `null`. Only defined when the window is being created by a form that set
    * `target=_blank`.
    */
  var postBody: js.UndefOr[PostBody] = js.undefined
  
  /**
    * The referrer that will be passed to the new window. May or may not result in the
    * `Referer` header being sent, depending on the referrer policy.
    */
  var referrer: Referrer
  
  /**
    * URL for the created window.
    */
  var url: String
}
object DidCreateWindowDetails {
  
  inline def apply(
    disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other,
    frameName: String,
    options: BrowserWindowConstructorOptions,
    referrer: Referrer,
    url: String
  ): DidCreateWindowDetails = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidCreateWindowDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidCreateWindowDetails] (val x: Self) extends AnyVal {
    
    inline def setDisposition(value: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPostBody(value: PostBody): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    inline def setReferrer(value: Referrer): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
