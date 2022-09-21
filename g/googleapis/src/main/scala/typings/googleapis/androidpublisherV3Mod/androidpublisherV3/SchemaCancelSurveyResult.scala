package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCancelSurveyResult extends StObject {
  
  /**
    * The reason the user selected in the cancel survey.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only set for CANCEL_SURVEY_REASON_OTHERS. This is the user's freeform response to the survey.
    */
  var reasonUserInput: js.UndefOr[String | Null] = js.undefined
}
object SchemaCancelSurveyResult {
  
  inline def apply(): SchemaCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelSurveyResult]
  }
  
  extension [Self <: SchemaCancelSurveyResult](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonUserInput(value: String): Self = StObject.set(x, "reasonUserInput", value.asInstanceOf[js.Any])
    
    inline def setReasonUserInputNull: Self = StObject.set(x, "reasonUserInput", null)
    
    inline def setReasonUserInputUndefined: Self = StObject.set(x, "reasonUserInput", js.undefined)
  }
}
