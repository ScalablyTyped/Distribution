package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/rules/algorithm-step-labels", JSImport.Namespace)
@js.native
object algorithmStepLabelsMod extends js.Object {
  def default(report: js.Function1[/* e */ LintingError, Unit], node: Element, algorithmSource: String): js.Any = js.native
}

