package typings.eslint.mod.ESLint

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Rule.RuleMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResultData extends js.Object {
  var rulesMeta: StringDictionary[RuleMetaData]
}

object LintResultData {
  @scala.inline
  def apply(rulesMeta: StringDictionary[RuleMetaData]): LintResultData = {
    val __obj = js.Dynamic.literal(rulesMeta = rulesMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResultData]
  }
}

