package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleChoiceSubmission extends js.Object {
  /** Student's select choice. */
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

