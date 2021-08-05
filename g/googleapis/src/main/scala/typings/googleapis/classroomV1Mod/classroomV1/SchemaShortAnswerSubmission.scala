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
  
  inline def apply(): SchemaShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortAnswerSubmission]
  }
  
  extension [Self <: SchemaShortAnswerSubmission](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
