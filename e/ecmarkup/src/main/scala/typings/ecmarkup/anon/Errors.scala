package typings.ecmarkup.anon

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.ecmarkup.collectNodesMod.CollectNodesReturnType
import typings.ecmarkup.ecmarkupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends CollectNodesReturnType {
  var errors: js.Array[LintingError]
  var success: `false`
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[LintingError], success: `false`): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

