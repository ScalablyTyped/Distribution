package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebFrame extends EventEmitter {
  /**
       * A WebFrame representing the first child frame of webFrame, the property would be
       * null if webFrame has no children or if first child is not in the current
       * renderer process.
       */
  var firstChild: js.UndefOr[WebFrame] = js.native
  /**
       * A WebFrame representing next sibling frame, the property would be null if
       * webFrame is the last frame in its parent or if the next sibling is not in the
       * current renderer process.
       */
  var nextSibling: js.UndefOr[WebFrame] = js.native
  /**
       * A WebFrame representing the frame which opened webFrame, the property would be
       * null if there's no opener or opener is not in the current renderer process.
       */
  var opener: js.UndefOr[WebFrame] = js.native
  /**
       * A WebFrame representing parent frame of webFrame, the property would be null if
       * webFrame is top or parent is not in the current renderer process.
       */
  var parent: js.UndefOr[WebFrame] = js.native
  /**
       * An Integer representing the unique frame id in the current renderer process.
       * Distinct WebFrame instances that refer to the same underlying frame will have
       * the same routingId.
       */
  var routingId: js.UndefOr[scala.Double] = js.native
  /**
       * A WebFrame representing top frame in frame hierarchy to which webFrame belongs,
       * the property would be null if top frame is not in the current renderer process.
       */
  var top: js.UndefOr[WebFrame] = js.native
  // Docs: http://electron.atom.io/docs/api/web-frame
  /**
       * Attempts to free memory that is no longer being used (like images from a
       * previous navigation). Note that blindly calling this method probably makes
       * Electron slower since it will have to refill these emptied caches, you should
       * only call it if an event in your app has occurred that makes you think your page
       * is actually using less memory (i.e. you have navigated from a super heavy page
       * to a mostly empty one, and intend to stay there).
       */
  def clearCache(): scala.Unit = js.native
  /**
       * Evaluates code in page. In the browser window some HTML APIs like
       * requestFullScreen can only be invoked by a gesture from the user. Setting
       * userGesture to true will remove this limitation.
       */
  def executeJavaScript(code: java.lang.String): stdLib.Promise[_] = js.native
  /**
       * Evaluates code in page. In the browser window some HTML APIs like
       * requestFullScreen can only be invoked by a gesture from the user. Setting
       * userGesture to true will remove this limitation.
       */
  def executeJavaScript(code: java.lang.String, userGesture: scala.Boolean): stdLib.Promise[_] = js.native
  /**
       * Evaluates code in page. In the browser window some HTML APIs like
       * requestFullScreen can only be invoked by a gesture from the user. Setting
       * userGesture to true will remove this limitation.
       */
  def executeJavaScript(
    code: java.lang.String,
    userGesture: scala.Boolean,
    callback: js.Function1[/* result */ js.Any, scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
       * Work like executeJavaScript but evaluates scripts in isolated context.
       */
  def executeJavaScriptInIsolatedWorld(worldId: scala.Double, scripts: js.Array[WebSource]): scala.Unit = js.native
  /**
       * Work like executeJavaScript but evaluates scripts in isolated context.
       */
  def executeJavaScriptInIsolatedWorld(worldId: scala.Double, scripts: js.Array[WebSource], userGesture: scala.Boolean): scala.Unit = js.native
  /**
       * Work like executeJavaScript but evaluates scripts in isolated context.
       */
  def executeJavaScriptInIsolatedWorld(
    worldId: scala.Double,
    scripts: js.Array[WebSource],
    userGesture: scala.Boolean,
    callback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def findFrameByName(name: java.lang.String): WebFrame = js.native
  def findFrameByRoutingId(routingId: scala.Double): WebFrame = js.native
  def getFrameForSelector(selector: java.lang.String): WebFrame = js.native
  /**
       * Returns an object describing usage information of Blink's internal memory
       * caches. This will generate:
       */
  def getResourceUsage(): ResourceUsage = js.native
  def getZoomFactor(): scala.Double = js.native
  def getZoomLevel(): scala.Double = js.native
  /**
       * Inserts text to the focused element.
       */
  def insertText(text: java.lang.String): scala.Unit = js.native
  /**
       * Resources will be loaded from this scheme regardless of the current page's
       * Content Security Policy.
       */
  def registerURLSchemeAsBypassingCSP(scheme: java.lang.String): scala.Unit = js.native
  /**
       * Registers the scheme as secure, bypasses content security policy for resources,
       * allows registering ServiceWorker and supports fetch API. Specify an option with
       * the value of false to omit it from the registration. An example of registering a
       * privileged scheme, without bypassing Content Security Policy:
       */
  def registerURLSchemeAsPrivileged(scheme: java.lang.String): scala.Unit = js.native
  /**
       * Registers the scheme as secure, bypasses content security policy for resources,
       * allows registering ServiceWorker and supports fetch API. Specify an option with
       * the value of false to omit it from the registration. An example of registering a
       * privileged scheme, without bypassing Content Security Policy:
       */
  def registerURLSchemeAsPrivileged(scheme: java.lang.String, options: RegisterURLSchemeAsPrivilegedOptions): scala.Unit = js.native
  /**
       * Set the content security policy of the isolated world.
       */
  def setIsolatedWorldContentSecurityPolicy(worldId: scala.Double, csp: java.lang.String): scala.Unit = js.native
  /**
       * Set the name of the isolated world. Useful in devtools.
       */
  def setIsolatedWorldHumanReadableName(worldId: scala.Double, name: java.lang.String): scala.Unit = js.native
  /**
       * Set the security origin of the isolated world.
       */
  def setIsolatedWorldSecurityOrigin(worldId: scala.Double, securityOrigin: java.lang.String): scala.Unit = js.native
  /**
       * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
       */
  def setLayoutZoomLevelLimits(minimumLevel: scala.Double, maximumLevel: scala.Double): scala.Unit = js.native
  /**
       * Sets a provider for spell checking in input fields and text areas. The provider
       * must be an object that has a spellCheck method that returns whether the word
       * passed is correctly spelled. An example of using node-spellchecker as provider:
       */
  def setSpellCheckProvider(language: java.lang.String, autoCorrectWord: scala.Boolean, provider: Provider): scala.Unit = js.native
  /**
       * Sets the maximum and minimum pinch-to-zoom level.
       */
  def setVisualZoomLevelLimits(minimumLevel: scala.Double, maximumLevel: scala.Double): scala.Unit = js.native
  /**
       * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
       * divided by 100, so 300% = 3.0.
       */
  def setZoomFactor(factor: scala.Double): scala.Unit = js.native
  /**
       * Changes the zoom level to the specified level. The original size is 0 and each
       * increment above or below represents zooming 20% larger or smaller to default
       * limits of 300% and 50% of original size, respectively.
       */
  def setZoomLevel(level: scala.Double): scala.Unit = js.native
}

