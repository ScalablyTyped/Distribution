package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleChoiceQuestion extends js.Object {
  var choices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MultipleChoiceQuestion {
  @scala.inline
  def apply(choices: js.Array[java.lang.String] = null): MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices)
    __obj.asInstanceOf[MultipleChoiceQuestion]
  }
}

