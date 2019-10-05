package typings.firefoxDashWebextDashBrowser.browser.devtools.inspectedWindow

import typings.firefoxDashWebextDashBrowser.Anon_ContextSecurityOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.inspectedWindow.eval")
@js.native
object eval extends js.Object {
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
  def apply(expression: String): js.Promise[js.UndefOr[js.Object]] = js.native
  def apply(expression: String, options: Anon_ContextSecurityOrigin): js.Promise[js.UndefOr[js.Object]] = js.native
}

