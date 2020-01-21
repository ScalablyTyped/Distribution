package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for multiple-choice questions.
  */
@js.native
trait SchemaMultipleChoiceQuestion extends js.Object {
  /**
    * Possible choices.
    */
  var choices: js.UndefOr[js.Array[String]] = js.native
}

object SchemaMultipleChoiceQuestion {
  @scala.inline
  def apply(choices: js.Array[String] = null): SchemaMultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMultipleChoiceQuestion]
  }
}

