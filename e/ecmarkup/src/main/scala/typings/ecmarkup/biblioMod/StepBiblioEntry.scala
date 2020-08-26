package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("id")
  var id_StepBiblioEntry: String = js.native
  var stepNumbers: js.Array[Double] = js.native
  @JSName("type")
  var type_StepBiblioEntry: step = js.native
}

object StepBiblioEntry {
  @scala.inline
  def apply(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double], `type`: step): StepBiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepBiblioEntry]
  }
  @scala.inline
  implicit class StepBiblioEntryOps[Self <: StepBiblioEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepNumbersVarargs(value: Double*): Self = this.set("stepNumbers", js.Array(value :_*))
    @scala.inline
    def setStepNumbers(value: js.Array[Double]): Self = this.set("stepNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: step): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

