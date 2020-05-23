package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.devtools.inspectedWindow.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofinspectedWindow extends js.Object {
  /* devtools.inspectedWindow events */
  /**
    * Fired when a new resource is added to the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onResourceAdded: js.UndefOr[WebExtEvent[js.Function1[/* resource */ Resource, Unit]]] = js.native
  /**
    * Fired when a new revision of the resource is committed (e.g. user saves an edited version of the resource in the
    * Developer Tools).
    * @param content New content of the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onResourceContentCommitted: js.UndefOr[WebExtEvent[js.Function2[/* resource */ Resource, /* content */ String, Unit]]] = js.native
  /* devtools.inspectedWindow properties */
  /** The ID of the tab being inspected. This ID may be used with browser.tabs.* API. */
  val tabId: Double = js.native
  /* devtools.inspectedWindow functions */
  /**
    * Evaluates a JavaScript expression in the context of the main frame of the inspected page. The expression must
    * evaluate to a JSON-compliant object, otherwise an exception is thrown. The eval function can report either a
    * DevTools-side error or a JavaScript exception that occurs during evaluation. In either case, the `result`
    * parameter of the callback is `undefined`. In the case of a DevTools-side error, the `isException` parameter is
    * non-null and has `isError` set to true and `code` set to an error code. In the case of a JavaScript error,
    * `isException` is set to true and `value` is set to the string value of thrown object.
    * @param expression An expression to evaluate.
    * @param [options] The options parameter can contain one or more options.
    */
  def eval(expression: String): js.Promise[js.Object] = js.native
  def eval(expression: String, options: ContextSecurityOrigin): js.Promise[js.Object] = js.native
  /**
    * Retrieves the list of resources from the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getResources(): js.Promise[js.Array[Resource]] = js.native
  /** Reloads the inspected page. */
  def reload(): Unit = js.native
  def reload(reloadOptions: IgnoreCache): Unit = js.native
}

