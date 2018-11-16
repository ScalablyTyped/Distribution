package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LintMessage extends js.Object {
  var column: scala.Double
  var endColumn: js.UndefOr[scala.Double] = js.undefined
  var endLine: js.UndefOr[scala.Double] = js.undefined
  var fatal: js.UndefOr[eslintLib.eslintLibNumbers.`true`] = js.undefined
  var fix: js.UndefOr[eslintLib.eslintMod.RuleNs.Fix] = js.undefined
  var line: scala.Double
  var message: java.lang.String
  var nodeType: java.lang.String
  var ruleId: java.lang.String | scala.Null
  var severity: Severity
  var source: java.lang.String | scala.Null
}

