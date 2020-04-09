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
    fix: /* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix] = null,
    suggest: js.Array[SuggestionReportDescriptor] = null
  ): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1(fix))
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
}

