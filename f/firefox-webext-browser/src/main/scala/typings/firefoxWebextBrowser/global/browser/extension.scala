package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.extension.GetViewsFetchProperties
import typings.firefoxWebextBrowser.browser.extension.LastError
import typings.firefoxWebextBrowser.browser.runtime.MessageSender
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  */
object extension {
  
  /**
    * Returns the JavaScript 'window' object for the background page running inside the current extension. Returns null if the extension has no background page.
    */
  @JSGlobal("browser.extension.getBackgroundPage")
  @js.native
  def getBackgroundPage(): Window | Unit = js.native
  
  /* extension functions */
  /**
    * Converts a relative path within an extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  @JSGlobal("browser.extension.getURL")
  @js.native
  def getURL(path: String): String = js.native
  
  /**
    * Returns an array of the JavaScript 'window' objects for each of the pages running inside the current extension.
    * @returns Array of global objects
    */
  @JSGlobal("browser.extension.getViews")
  @js.native
  def getViews(): js.Array[Window] = js.native
  @JSGlobal("browser.extension.getViews")
  @js.native
  def getViews(fetchProperties: GetViewsFetchProperties): js.Array[Window] = js.native
  
  /**
    * True for content scripts running inside incognito tabs, and for extension pages running inside an incognito process. The latter only applies to extensions with 'split' incognito_behavior.
    */
  @JSGlobal("browser.extension.inIncognitoContext")
  @js.native
  val inIncognitoContext: js.UndefOr[Boolean] = js.native
  
  /**
    * Retrieves the state of the extension's access to the 'file://' scheme (as determined by the user-controlled 'Allow access to File URLs' checkbox.
    */
  @JSGlobal("browser.extension.isAllowedFileSchemeAccess")
  @js.native
  def isAllowedFileSchemeAccess(): js.Promise[Boolean] = js.native
  
  /**
    * Retrieves the state of the extension's access to Incognito-mode (as determined by the user-controlled 'Allowed in Incognito' checkbox.
    */
  @JSGlobal("browser.extension.isAllowedIncognitoAccess")
  @js.native
  def isAllowedIncognitoAccess(): js.Promise[Boolean] = js.native
  
  /* extension properties */
  /**
    * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If no error has occured lastError will be `undefined`.
    */
  @JSGlobal("browser.extension.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  /* extension events */
  /**
    * Fired when a request is sent from either an extension process or a content script.
    * @param request The request sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any JSON-ifiable object, or undefined if there is no response. If you have more than one `onRequest` listener in the same document, then only one may send a response.
    * @deprecated Please use `runtime.onMessage`.
    */
  @JSGlobal("browser.extension.onRequest")
  @js.native
  val onRequest: js.UndefOr[
    WebExtEvent[
      js.Function3[
        /* request */ js.Any, 
        /* sender */ MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
    ]
  ] = js.native
  
  /**
    * Fired when a request is sent from another extension.
    * @param request The request sent by the calling script.
    * @param sendResponse Function to call when you have a response. The argument should be any JSON-ifiable object, or undefined if there is no response.
    * @deprecated Please use `runtime.onMessageExternal`.
    */
  @JSGlobal("browser.extension.onRequestExternal")
  @js.native
  val onRequestExternal: js.UndefOr[
    WebExtEvent[
      js.Function3[
        /* request */ js.Any, 
        /* sender */ MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
    ]
  ] = js.native
  
  /**
    * Sets the value of the ap CGI parameter used in the extension's update URL. This value is ignored for extensions that are hosted in the browser vendor's store.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.extension.setUpdateUrlData")
  @js.native
  def setUpdateUrlData(data: String): Unit = js.native
}
