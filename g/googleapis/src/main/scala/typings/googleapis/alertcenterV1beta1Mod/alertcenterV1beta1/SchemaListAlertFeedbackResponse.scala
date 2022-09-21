package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAlertFeedbackResponse extends StObject {
  
  /**
    * The list of alert feedback. Feedback entries for each alert are ordered by creation time descending.
    */
  var feedback: js.UndefOr[js.Array[SchemaAlertFeedback]] = js.undefined
}
object SchemaListAlertFeedbackResponse {
  
  inline def apply(): SchemaListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertFeedbackResponse]
  }
  
  extension [Self <: SchemaListAlertFeedbackResponse](x: Self) {
    
    inline def setFeedback(value: js.Array[SchemaAlertFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setFeedbackVarargs(value: SchemaAlertFeedback*): Self = StObject.set(x, "feedback", js.Array(value*))
  }
}
