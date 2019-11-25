package typings.eslint.eslintMod.Linter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasRules extends js.Object {
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.undefined
}

object HasRules {
  @scala.inline
  def apply(rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null): HasRules = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRules]
  }
}

