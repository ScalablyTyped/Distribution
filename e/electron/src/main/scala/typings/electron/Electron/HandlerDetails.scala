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

trait HandlerDetails extends StObject {
  
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` or `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other
  
  /**
    * Comma separated list of window features provided to `window.open()`.
    */
  var features: String
  
  /**
    * Name of the window provided in `window.open()`
    */
  var frameName: String
  
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
    * The _resolved_ version of the URL passed to `window.open()`. e.g. opening a
    * window with `window.open('foo')` will yield something like
    * `https://the-origin/the/current/path/foo`.
    */
  var url: String
}
object HandlerDetails {
  
  inline def apply(
    disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other,
    features: String,
    frameName: String,
    referrer: Referrer,
    url: String
  ): HandlerDetails = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerDetails] (val x: Self) extends AnyVal {
    
    inline def setDisposition(value: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: String): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    
    inline def setPostBody(value: PostBody): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    inline def setReferrer(value: Referrer): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
