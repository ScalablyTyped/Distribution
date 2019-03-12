package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorOptions extends js.Object {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var fix: js.UndefOr[
    js.Function1[/* fixer */ RuleFixer, scala.Null | Fix | stdLib.IterableIterator[Fix]]
  ] = js.undefined
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    fix: /* fixer */ RuleFixer => scala.Null | Fix | stdLib.IterableIterator[Fix] = null
  ): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1(fix))
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
}

