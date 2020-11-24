package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleChoiceQuestion extends js.Object {
  
  var choices: js.UndefOr[js.Array[String]] = js.native
}
object MultipleChoiceQuestion {
  
  @scala.inline
  def apply(): MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceQuestion]
  }
  
  @scala.inline
  implicit class MultipleChoiceQuestionOps[Self <: MultipleChoiceQuestion] (val x: Self) extends AnyVal {
    
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
    def setChoicesVarargs(value: String*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
  }
}
