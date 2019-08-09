package typings.eslint.eslintMod.LinterNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOverride extends HasRules {
  var excludedFiles: js.UndefOr[js.Array[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
}

object RuleOverride {
  @scala.inline
  def apply(
    excludedFiles: js.Array[String] = null,
    files: js.Array[String] = null,
    rules: StringDictionary[RuleLevel | RuleLevelAndOptions] = null
  ): RuleOverride = {
    val __obj = js.Dynamic.literal()
    if (excludedFiles != null) __obj.updateDynamic("excludedFiles")(excludedFiles)
    if (files != null) __obj.updateDynamic("files")(files)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[RuleOverride]
  }
}

