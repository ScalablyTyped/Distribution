package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
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
  var routingId: js.UndefOr[Double] = js.native
  /**
    * A WebFrame representing top frame in frame hierarchy to which webFrame belongs,
    * the property would be null if top frame is not in the current renderer process.
    */
  var top: js.UndefOr[WebFrame] = js.native
  // Docs: http://electronjs.org/docs/api/web-frame
  /**
    * Attempts to free memory that is no longer being used (like images from a
    * previous navigation). Note that blindly calling this method probably makes
    * Electron slower since it will have to refill these emptied caches, you should
    * only call it if an event in your app has occurred that makes you think your page
    * is actually using less memory (i.e. you have navigated from a super heavy page
    * to a mostly empty one, and intend to stay there).
    */
  def clearCache(): Unit = js.native
  /**
    * Evaluates code in page. In the browser window some HTML APIs like
    * requestFullScreen can only be invoked by a gesture from the user. Setting
    * userGesture to true will remove this limitation.
    */
  def executeJavaScript(code: String): js.Promise[_] = js.native
  def executeJavaScript(code: String, userGesture: Boolean): js.Promise[_] = js.native
  def executeJavaScript(code: String, userGesture: Boolean, callback: js.Function1[/* result */ js.Any, Unit]): js.Promise[_] = js.native
  /**
    * Works like executeJavaScript but evaluates scripts in an isolated context.
    * Deprecated Soon
    */
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource]): js.Promise[_] = js.native
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource], userGesture: Boolean): js.Promise[_] = js.native
  def executeJavaScriptInIsolatedWorld(
    worldId: Double,
    scripts: js.Array[WebSource],
    userGesture: Boolean,
    callback: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def findFrameByName(name: String): WebFrame = js.native
  def findFrameByRoutingId(routingId: Double): WebFrame = js.native
  def getFrameForSelector(selector: String): WebFrame = js.native
  /**
    * Returns an object describing usage information of Blink's internal memory
    * caches. This will generate:
    */
  def getResourceUsage(): ResourceUsage = js.native
  def getZoomFactor(): Double = js.native
  def getZoomLevel(): Double = js.native
  /**
    * Inserts css as a style sheet in the document.
    */
  def insertCSS(css: String): Unit = js.native
  /**
    * Inserts text to the focused element.
    */
  def insertText(text: String): Unit = js.native
  /**
    * Set the content security policy of the isolated world.
    */
  def setIsolatedWorldContentSecurityPolicy(worldId: Double, csp: String): Unit = js.native
  /**
    * Set the name of the isolated world. Useful in devtools.
    */
  def setIsolatedWorldHumanReadableName(worldId: Double, name: String): Unit = js.native
  /**
    * Set the security origin, content security policy and name of the isolated world.
    * Note: If the csp is specified, then the securityOrigin also has to be specified.
    */
  def setIsolatedWorldInfo(worldId: Double, info: Info): Unit = js.native
  /**
    * Set the security origin of the isolated world.
    */
  def setIsolatedWorldSecurityOrigin(worldId: Double, securityOrigin: String): Unit = js.native
  /**
    * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
    */
  def setLayoutZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): Unit = js.native
  /**
    * Sets a provider for spell checking in input fields and text areas. The provider
    * must be an object that has a spellCheck method that accepts an array of
    * individual words for spellchecking. The spellCheck function runs asynchronously
    * and calls the callback function with an array of misspelt words when complete.
    * An example of using node-spellchecker as provider:
    */
  def setSpellCheckProvider(language: String, provider: Provider): Unit = js.native
  /**
    * Sets the maximum and minimum pinch-to-zoom level.
    */
  def setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): Unit = js.native
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
    */
  def setZoomFactor(factor: Double): Unit = js.native
  /**
    * Changes the zoom level to the specified level. The original size is 0 and each
    * increment above or below represents zooming 20% larger or smaller to default
    * limits of 300% and 50% of original size, respectively.
    */
  def setZoomLevel(level: Double): Unit = js.native
}

@JSGlobal("Electron.webFrame")
@js.native
object webFrame extends TopLevel[WebFrame]

