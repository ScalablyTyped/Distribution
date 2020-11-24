package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student work for a short answer question.
  */
@js.native
trait SchemaShortAnswerSubmission extends js.Object {
  
  /**
    * Student response to a short-answer question.
    */
  var answer: js.UndefOr[String] = js.native
}
object SchemaShortAnswerSubmission {
  
  @scala.inline
  def apply(): SchemaShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortAnswerSubmission]
  }
  
  @scala.inline
  implicit class SchemaShortAnswerSubmissionOps[Self <: SchemaShortAnswerSubmission] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: String): Self = this.set("answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswer: Self = this.set("answer", js.undefined)
  }
}
