package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student work for a multiple-choice question.
  */
trait SchemaMultipleChoiceSubmission extends StObject {
  
  /**
    * Student&#39;s select choice.
    */
  var answer: js.UndefOr[String] = js.undefined
}
object SchemaMultipleChoiceSubmission {
  
  inline def apply(): SchemaMultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultipleChoiceSubmission]
  }
  
  extension [Self <: SchemaMultipleChoiceSubmission](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
