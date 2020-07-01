package typings.eslint.mod.ESLint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "ESLint")
@js.native
object ^ extends js.Object {
  var version: String = js.native
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  def outputFixes(results: js.Array[LintResult]): js.Promise[Unit] = js.native
}

