package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleChoiceSubmission extends js.Object {
  var answer: js.UndefOr[java.lang.String] = js.undefined
}

object MultipleChoiceSubmission {
  @scala.inline
  def apply(answer: java.lang.String = null): MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer)
    __obj.asInstanceOf[MultipleChoiceSubmission]
  }
}

