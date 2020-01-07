package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for multiple-choice questions.
  */
@js.native
trait Schema$MultipleChoiceQuestion extends js.Object {
  /**
    * Possible choices.
    */
  var choices: js.UndefOr[js.Array[String]] = js.native
}

object Schema$MultipleChoiceQuestion {
  @scala.inline
  def apply(choices: js.Array[String] = null): Schema$MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MultipleChoiceQuestion]
  }
}

