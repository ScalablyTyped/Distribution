package typings.eslint.eslintMod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorOptions extends js.Object {
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  var fix: js.UndefOr[js.Function1[/* fixer */ RuleFixer, Null | Fix | IterableIterator[Fix]]] = js.undefined
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(
    data: StringDictionary[String] = null,
    fix: /* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] = null
  ): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1(fix))
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
}

