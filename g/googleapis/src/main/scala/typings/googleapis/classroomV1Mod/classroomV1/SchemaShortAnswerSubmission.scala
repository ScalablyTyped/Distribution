package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student work for a short answer question.
  */
trait SchemaShortAnswerSubmission extends StObject {
  
  /**
    * Student response to a short-answer question.
    */
  var answer: js.UndefOr[String] = js.undefined
}
object SchemaShortAnswerSubmission {
  
  @scala.inline
  def apply(): SchemaShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortAnswerSubmission]
  }
  
  @scala.inline
  implicit class SchemaShortAnswerSubmissionMutableBuilder[Self <: SchemaShortAnswerSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
