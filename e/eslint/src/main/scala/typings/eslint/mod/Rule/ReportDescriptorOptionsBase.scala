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
    fix: /* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix] = null
  ): ReportDescriptorOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1(fix))
    __obj.asInstanceOf[ReportDescriptorOptionsBase]
  }
}

