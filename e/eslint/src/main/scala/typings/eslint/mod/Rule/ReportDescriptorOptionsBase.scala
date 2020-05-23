package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorOptionsBase extends js.Object {
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  var fix: js.UndefOr[
    Null | (js.Function1[/* fixer */ RuleFixer, Null | Fix | IterableIterator[Fix] | js.Array[Fix]])
  ] = js.undefined
}

object ReportDescriptorOptionsBase {
  @scala.inline
  def apply(
    data: StringDictionary[String] = null,
    fix: js.UndefOr[
      Null | (/* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix])
    ] = js.undefined
  ): ReportDescriptorOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(if (fix != null) js.Any.fromFunction1(fix.asInstanceOf[/* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix]]) else null)
    __obj.asInstanceOf[ReportDescriptorOptionsBase]
  }
}

