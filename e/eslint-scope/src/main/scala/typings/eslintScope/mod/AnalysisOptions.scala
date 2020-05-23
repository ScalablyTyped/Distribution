package typings.eslintScope.mod

import typings.eslintScope.eslintScopeStrings.module
import typings.eslintScope.eslintScopeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisOptions extends js.Object {
  var directive: js.UndefOr[Boolean] = js.undefined
  var ecmaVersion: js.UndefOr[Double] = js.undefined
  var fallback: js.UndefOr[String | (js.Function1[/* node */ js.Object, js.Array[String]])] = js.undefined
  var ignoreEval: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var nodejsScope: js.UndefOr[Boolean] = js.undefined
  var optimistic: js.UndefOr[Boolean] = js.undefined
  var sourceType: js.UndefOr[script | module] = js.undefined
}

object AnalysisOptions {
  @scala.inline
  def apply(
    directive: js.UndefOr[Boolean] = js.undefined,
    ecmaVersion: js.UndefOr[Double] = js.undefined,
    fallback: String | (js.Function1[/* node */ js.Object, js.Array[String]]) = null,
    ignoreEval: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    nodejsScope: js.UndefOr[Boolean] = js.undefined,
    optimistic: js.UndefOr[Boolean] = js.undefined,
    sourceType: script | module = null
  ): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ecmaVersion)) __obj.updateDynamic("ecmaVersion")(ecmaVersion.get.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEval)) __obj.updateDynamic("ignoreEval")(ignoreEval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodejsScope)) __obj.updateDynamic("nodejsScope")(nodejsScope.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimistic)) __obj.updateDynamic("optimistic")(optimistic.get.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisOptions]
  }
}

