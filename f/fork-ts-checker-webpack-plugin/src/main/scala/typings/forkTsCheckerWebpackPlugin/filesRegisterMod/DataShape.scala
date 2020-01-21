package typings.forkTsCheckerWebpackPlugin.filesRegisterMod

import typings.eslint.mod.CLIEngine.LintReport
import typings.tslint.mod.RuleFailure
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataShape extends js.Object {
  var eslints: js.Array[LintReport]
  var linted: Boolean
  var source: js.UndefOr[SourceFile] = js.undefined
  var tslints: js.Array[RuleFailure]
}

object DataShape {
  @scala.inline
  def apply(
    eslints: js.Array[LintReport],
    linted: Boolean,
    tslints: js.Array[RuleFailure],
    source: SourceFile = null
  ): DataShape = {
    val __obj = js.Dynamic.literal(eslints = eslints.asInstanceOf[js.Any], linted = linted.asInstanceOf[js.Any], tslints = tslints.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataShape]
  }
}

