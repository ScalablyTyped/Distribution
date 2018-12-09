package typings
package firefoxDashWebextDashBrowserLib.browserNs.extensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension")
@js.native
object extensionNsMembers extends js.Object {
  /**
       * True for content scripts running inside incognito tabs, and for extension pages running inside an incognito
       * process. The latter only applies to extensions with 'split' incognito_behavior.
       */
  val inIncognitoContext: js.UndefOr[scala.Boolean] = js.native
  /* extension properties */
  /**
       * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If no error has
       * occured lastError will be `undefined`.
       */
  val lastError: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_MessageString] = js.native
  /* extension events */
  /**
       * Fired when a request is sent from either an extension process or a content script.
       * @param request The request sent by the calling script.
       * @param sendResponse Function to call (at most once) when you have a response. The argument should be any
       *     JSON-ifiable object, or undefined if there is no response. If you have more than one `onRequest` listener in
       *     the same document, then only one may send a response.
       * @deprecated Please use `runtime.onMessage`.
       */
  val onRequest: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function3[
        /* request */ js.Any, 
        /* sender */ firefoxDashWebextDashBrowserLib.browserNs.runtimeNs.MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ]
    ]
  ] = js.native
  /**
       * Fired when a request is sent from another extension.
       * @param request The request sent by the calling script.
       * @param sendResponse Function to call when you have a response. The argument should be any JSON-ifiable object,
       *     or undefined if there is no response.
       * @deprecated Please use `runtime.onMessageExternal`.
       */
  val onRequestExternal: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function3[
        /* request */ js.Any, 
        /* sender */ firefoxDashWebextDashBrowserLib.browserNs.runtimeNs.MessageSender, 
        /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ]
    ]
  ] = js.native
  /**
       * Returns the JavaScript 'window' object for the background page running inside the current extension. Returns
       * null if the extension has no background page.
       */
  def getBackgroundPage(): firefoxDashWebextDashBrowserLib.Window | scala.Unit = js.native
  /* extension functions */
  /**
       * Converts a relative path within an extension install directory to a fully-qualified URL.
       * @param path A path to a resource within an extension expressed relative to its install directory.
       * @returns The fully-qualified URL to the resource.
       */
  def getURL(path: java.lang.String): java.lang.String = js.native
  /**
       * Returns an array of the JavaScript 'window' objects for each of the pages running inside the current extension.
       * @returns Array of global objects
       */
  def getViews(): js.Array[firefoxDashWebextDashBrowserLib.Window] = js.native
  /**
       * Returns an array of the JavaScript 'window' objects for each of the pages running inside the current extension.
       * @returns Array of global objects
       */
  def getViews(fetchProperties: firefoxDashWebextDashBrowserLib.Anon_WindowIdType): js.Array[firefoxDashWebextDashBrowserLib.Window] = js.native
  /**
       * Retrieves the state of the extension's access to the 'file://' scheme (as determined by the user-controlled
       * 'Allow access to File URLs' checkbox.
       */
  def isAllowedFileSchemeAccess(): js.Promise[scala.Boolean] = js.native
  /**
       * Retrieves the state of the extension's access to Incognito-mode (as determined by the user-controlled 'Allowed
       * in Incognito' checkbox.
       */
  def isAllowedIncognitoAccess(): js.Promise[scala.Boolean] = js.native
  /**
       * Sets the value of the ap CGI parameter used in the extension's update URL. This value is ignored for extensions
       * that are hosted in the browser vendor's store.
       * @deprecated Unsupported on Firefox at this time.
       */
  def setUpdateUrlData(data: java.lang.String): scala.Unit = js.native
}

