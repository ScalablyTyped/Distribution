package typings.eslintScope.mod

import typings.eslintScope.eslintScopeStrings.module
import typings.eslintScope.eslintScopeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisOptions extends js.Object {
  var directive: js.UndefOr[Boolean] = js.native
  var ecmaVersion: js.UndefOr[Double] = js.native
  var fallback: js.UndefOr[String | (js.Function1[/* node */ js.Object, js.Array[String]])] = js.native
  var ignoreEval: js.UndefOr[Boolean] = js.native
  var impliedStrict: js.UndefOr[Boolean] = js.native
  var nodejsScope: js.UndefOr[Boolean] = js.native
  var optimistic: js.UndefOr[Boolean] = js.native
  var sourceType: js.UndefOr[script | module] = js.native
}

object AnalysisOptions {
  @scala.inline
  def apply(): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisOptions]
  }
  @scala.inline
  implicit class AnalysisOptionsOps[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirective(value: Boolean): Self = this.set("directive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirective: Self = this.set("directive", js.undefined)
    @scala.inline
    def setEcmaVersion(value: Double): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    @scala.inline
    def setFallbackFunction1(value: /* node */ js.Object => js.Array[String]): Self = this.set("fallback", js.Any.fromFunction1(value))
    @scala.inline
    def setFallback(value: String | (js.Function1[/* node */ js.Object, js.Array[String]])): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setIgnoreEval(value: Boolean): Self = this.set("ignoreEval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEval: Self = this.set("ignoreEval", js.undefined)
    @scala.inline
    def setImpliedStrict(value: Boolean): Self = this.set("impliedStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpliedStrict: Self = this.set("impliedStrict", js.undefined)
    @scala.inline
    def setNodejsScope(value: Boolean): Self = this.set("nodejsScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodejsScope: Self = this.set("nodejsScope", js.undefined)
    @scala.inline
    def setOptimistic(value: Boolean): Self = this.set("optimistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimistic: Self = this.set("optimistic", js.undefined)
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
  
}

