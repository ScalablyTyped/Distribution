package typings
package eslintDashScopeLib.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisOptions extends js.Object {
  var directive: js.UndefOr[scala.Boolean] = js.undefined
  var ecmaVersion: js.UndefOr[scala.Double] = js.undefined
  var fallback: js.UndefOr[
    java.lang.String | (js.Function1[/* node */ js.Object, js.Array[java.lang.String]])
  ] = js.undefined
  var ignoreEval: js.UndefOr[scala.Boolean] = js.undefined
  var impliedStrict: js.UndefOr[scala.Boolean] = js.undefined
  var nodejsScope: js.UndefOr[scala.Boolean] = js.undefined
  var optimistic: js.UndefOr[scala.Boolean] = js.undefined
  var sourceType: js.UndefOr[
    eslintDashScopeLib.eslintDashScopeLibStrings.script | eslintDashScopeLib.eslintDashScopeLibStrings.module
  ] = js.undefined
}

object AnalysisOptions {
  @scala.inline
  def apply(
    directive: js.UndefOr[scala.Boolean] = js.undefined,
    ecmaVersion: scala.Int | scala.Double = null,
    fallback: java.lang.String | (js.Function1[/* node */ js.Object, js.Array[java.lang.String]]) = null,
    ignoreEval: js.UndefOr[scala.Boolean] = js.undefined,
    impliedStrict: js.UndefOr[scala.Boolean] = js.undefined,
    nodejsScope: js.UndefOr[scala.Boolean] = js.undefined,
    optimistic: js.UndefOr[scala.Boolean] = js.undefined,
    sourceType: eslintDashScopeLib.eslintDashScopeLibStrings.script | eslintDashScopeLib.eslintDashScopeLibStrings.module = null
  ): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEval)) __obj.updateDynamic("ignoreEval")(ignoreEval)
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict)
    if (!js.isUndefined(nodejsScope)) __obj.updateDynamic("nodejsScope")(nodejsScope)
    if (!js.isUndefined(optimistic)) __obj.updateDynamic("optimistic")(optimistic)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisOptions]
  }
}

