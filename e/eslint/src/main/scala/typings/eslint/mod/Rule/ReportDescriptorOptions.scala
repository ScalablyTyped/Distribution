package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorOptions extends ReportDescriptorOptionsBase {
  var suggest: js.UndefOr[js.Array[SuggestionReportDescriptor] | Null] = js.undefined
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(
    data: StringDictionary[String] = null,
    fix: js.UndefOr[
      Null | (/* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix])
    ] = js.undefined,
    suggest: js.UndefOr[Null | js.Array[SuggestionReportDescriptor]] = js.undefined
  ): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(if (fix != null) js.Any.fromFunction1(fix.asInstanceOf[/* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix]]) else null)
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
}

