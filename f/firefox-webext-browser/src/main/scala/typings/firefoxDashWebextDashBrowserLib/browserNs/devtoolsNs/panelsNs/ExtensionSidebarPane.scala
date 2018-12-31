package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.panelsNs

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
  var onHidden: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]] = js.native
  /**
    * Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it.
    * @param window The JavaScript `window` object of the sidebar page, if one was set with the `setPage()` method.
    */
  var onShown: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* window */ js.Object, scala.Unit]] = js.native
  /**
    * Sets the height of the sidebar.
    * @param height A CSS-like size specification, such as `'100px'` or `'12ex'`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ java.lang.String, scala.Unit]] = js.native
  /**
    * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
    * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM
    *     nodes are displayed in an expandable tree similar to the console/watch.
    * @param [rootTitle] An optional title for the root of the expression tree.
    */
  def setExpression(expression: java.lang.String): js.Promise[scala.Unit] = js.native
  def setExpression(expression: java.lang.String, rootTitle: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Sets a JSON-compliant object to be displayed in the sidebar pane.
    * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of
    *     the caller (API client).
    * @param [rootTitle] An optional title for the root of the expression tree.
    */
  def setObject(jsonObject: java.lang.String): js.Promise[scala.Unit] = js.native
  def setObject(jsonObject: java.lang.String, rootTitle: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Sets an HTML page to be displayed in the sidebar pane.
    * @param path Relative path of an extension page to display within the sidebar.
    */
  def setPage(path: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL): js.Promise[_] = js.native
}

