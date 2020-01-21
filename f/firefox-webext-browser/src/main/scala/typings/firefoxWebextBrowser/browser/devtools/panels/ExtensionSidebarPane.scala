package typings.firefoxWebextBrowser.browser.devtools.panels

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A sidebar created by the extension. */
@js.native
trait ExtensionSidebarPane extends js.Object {
  /**
    * Fired when the sidebar pane becomes hidden as a result of the user switching away from the panel that hosts
    * the sidebar pane.
    */
  var onHidden: WebExtEvent[js.Function0[Unit]] = js.native
  /**
    * Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it.
    * @param window The JavaScript `window` object of the sidebar page, if one was set with the `setPage()` method.
    */
  var onShown: WebExtEvent[js.Function1[/* window */ js.Object, Unit]] = js.native
  /**
    * Sets the height of the sidebar.
    * @param height A CSS-like size specification, such as `'100px'` or `'12ex'`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.native
  /**
    * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
    * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM
    *     nodes are displayed in an expandable tree similar to the console/watch.
    * @param [rootTitle] An optional title for the root of the expression tree.
    */
  def setExpression(expression: String): js.Promise[Unit] = js.native
  def setExpression(expression: String, rootTitle: String): js.Promise[Unit] = js.native
  /**
    * Sets a JSON-compliant object to be displayed in the sidebar pane.
    * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of
    *     the caller (API client).
    * @param [rootTitle] An optional title for the root of the expression tree.
    */
  def setObject(jsonObject: String): js.Promise[Unit] = js.native
  def setObject(jsonObject: String, rootTitle: String): js.Promise[Unit] = js.native
  /**
    * Sets an HTML page to be displayed in the sidebar pane.
    * @param path Relative path of an extension page to display within the sidebar.
    */
  def setPage(path: ExtensionURL): js.Promise[_] = js.native
}

