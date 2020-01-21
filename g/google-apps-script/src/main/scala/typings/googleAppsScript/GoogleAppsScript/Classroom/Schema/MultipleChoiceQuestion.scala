package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleChoiceQuestion extends js.Object {
  var choices: js.UndefOr[js.Array[String]] = js.undefined
}

object MultipleChoiceQuestion {
  @scala.inline
  def apply(choices: js.Array[String] = null): MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleChoiceQuestion]
  }
}

