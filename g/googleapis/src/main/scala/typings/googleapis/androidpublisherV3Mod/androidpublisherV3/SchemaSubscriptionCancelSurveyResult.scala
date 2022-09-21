package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionCancelSurveyResult extends StObject {
  
  /**
    * The cancellation reason the user chose in the survey. Possible values are: 0. Other 1. I don't use this service enough 2. Technical issues 3. Cost-related reasons 4. I found a better app
    */
  var cancelSurveyReason: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The customized input cancel reason from the user. Only present when cancelReason is 0.
    */
  var userInputCancelReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscriptionCancelSurveyResult {
  
  inline def apply(): SchemaSubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionCancelSurveyResult]
  }
  
  extension [Self <: SchemaSubscriptionCancelSurveyResult](x: Self) {
    
    inline def setCancelSurveyReason(value: Double): Self = StObject.set(x, "cancelSurveyReason", value.asInstanceOf[js.Any])
    
    inline def setCancelSurveyReasonNull: Self = StObject.set(x, "cancelSurveyReason", null)
    
    inline def setCancelSurveyReasonUndefined: Self = StObject.set(x, "cancelSurveyReason", js.undefined)
    
    inline def setUserInputCancelReason(value: String): Self = StObject.set(x, "userInputCancelReason", value.asInstanceOf[js.Any])
    
    inline def setUserInputCancelReasonNull: Self = StObject.set(x, "userInputCancelReason", null)
    
    inline def setUserInputCancelReasonUndefined: Self = StObject.set(x, "userInputCancelReason", js.undefined)
  }
}
