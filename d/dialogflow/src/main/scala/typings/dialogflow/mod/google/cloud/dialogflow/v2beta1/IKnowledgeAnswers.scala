package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KnowledgeAnswers. */
@js.native
trait IKnowledgeAnswers extends StObject {
  
  /** KnowledgeAnswers answers */
  var answers: js.UndefOr[js.Array[IAnswer] | Null] = js.native
}
object IKnowledgeAnswers {
  
  @scala.inline
  def apply(): IKnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeAnswers]
  }
  
  @scala.inline
  implicit class IKnowledgeAnswersMutableBuilder[Self <: IKnowledgeAnswers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswers(value: js.Array[IAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswersNull: Self = StObject.set(x, "answers", null)
    
    @scala.inline
    def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    @scala.inline
    def setAnswersVarargs(value: IAnswer*): Self = StObject.set(x, "answers", js.Array(value :_*))
  }
}
