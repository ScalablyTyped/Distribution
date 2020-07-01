package typings.eslint.mod.ESLint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  def format(results: js.Array[LintResult]): String = js.native
  def format(results: js.Array[LintResult], data: LintResultData): String = js.native
}

