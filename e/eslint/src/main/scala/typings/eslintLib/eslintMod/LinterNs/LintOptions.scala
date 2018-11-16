package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LintOptions extends js.Object {
  var allowInlineConfig: js.UndefOr[scala.Boolean] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var postprocess: js.UndefOr[
    js.Function1[/* problemLists */ js.Array[js.Array[LintMessage]], js.Array[LintMessage]]
  ] = js.undefined
  var preprocess: js.UndefOr[js.Function1[/* code */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  var reportUnusedDisableDirectives: js.UndefOr[scala.Boolean] = js.undefined
}

