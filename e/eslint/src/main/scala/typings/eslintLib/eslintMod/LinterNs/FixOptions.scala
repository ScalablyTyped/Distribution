package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixOptions extends LintOptions {
  var fix: js.UndefOr[scala.Boolean] = js.undefined
}

object FixOptions {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    fix: js.UndefOr[scala.Boolean] = js.undefined,
    postprocess: js.Function1[/* problemLists */ js.Array[js.Array[LintMessage]], js.Array[LintMessage]] = null,
    preprocess: js.Function1[/* code */ java.lang.String, js.Array[java.lang.String]] = null,
    reportUnusedDisableDirectives: js.UndefOr[scala.Boolean] = js.undefined
  ): FixOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (postprocess != null) __obj.updateDynamic("postprocess")(postprocess)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives)
    __obj.asInstanceOf[FixOptions]
  }
}

