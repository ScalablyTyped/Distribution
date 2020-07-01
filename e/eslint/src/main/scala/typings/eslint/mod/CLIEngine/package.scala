package typings.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CLIEngine {
  type DeprecatedRuleUse = typings.eslint.mod.ESLint.DeprecatedRuleUse
  type Formatter = js.Function2[
    /* results */ js.Array[typings.eslint.mod.CLIEngine.LintResult], 
    /* data */ js.UndefOr[typings.eslint.mod.CLIEngine.LintResultData], 
    java.lang.String
  ]
  type LintResult = typings.eslint.mod.ESLint.LintResult
  type LintResultData = typings.eslint.mod.ESLint.LintResultData
}
