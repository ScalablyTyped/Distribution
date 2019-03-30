package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortAnswerSubmission extends js.Object {
  var answer: js.UndefOr[java.lang.String] = js.undefined
}

object ShortAnswerSubmission {
  @scala.inline
  def apply(answer: java.lang.String = null): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer)
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
}

