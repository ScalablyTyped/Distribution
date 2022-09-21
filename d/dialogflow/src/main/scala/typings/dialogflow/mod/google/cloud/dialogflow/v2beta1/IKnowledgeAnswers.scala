package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KnowledgeAnswers. */
trait IKnowledgeAnswers extends StObject {
  
  /** KnowledgeAnswers answers */
  var answers: js.UndefOr[js.Array[IAnswer] | Null] = js.undefined
}
object IKnowledgeAnswers {
  
  inline def apply(): IKnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeAnswers]
  }
  
  extension [Self <: IKnowledgeAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[IAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersNull: Self = StObject.set(x, "answers", null)
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: IAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
  }
}
