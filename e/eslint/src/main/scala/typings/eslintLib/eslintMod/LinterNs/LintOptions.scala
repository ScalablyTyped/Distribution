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

object LintOptions {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    postprocess: /* problemLists */ js.Array[js.Array[LintMessage]] => js.Array[LintMessage] = null,
    preprocess: /* code */ java.lang.String => js.Array[java.lang.String] = null,
    reportUnusedDisableDirectives: js.UndefOr[scala.Boolean] = js.undefined
  ): LintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (postprocess != null) __obj.updateDynamic("postprocess")(js.Any.fromFunction1(postprocess))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1(preprocess))
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives)
    __obj.asInstanceOf[LintOptions]
  }
}

