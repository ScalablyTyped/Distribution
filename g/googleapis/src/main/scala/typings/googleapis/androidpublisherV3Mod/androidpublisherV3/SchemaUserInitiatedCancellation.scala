package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserInitiatedCancellation extends StObject {
  
  /**
    * Information provided by the user when they complete the subscription cancellation flow (cancellation reason survey).
    */
  var cancelSurveyResult: js.UndefOr[SchemaCancelSurveyResult] = js.undefined
  
  /**
    * The time at which the subscription was canceled by the user. The user might still have access to the subscription after this time. Use line_items.expiry_time to determine if a user still has access.
    */
  var cancelTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserInitiatedCancellation {
  
  inline def apply(): SchemaUserInitiatedCancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInitiatedCancellation]
  }
  
  extension [Self <: SchemaUserInitiatedCancellation](x: Self) {
    
    inline def setCancelSurveyResult(value: SchemaCancelSurveyResult): Self = StObject.set(x, "cancelSurveyResult", value.asInstanceOf[js.Any])
    
    inline def setCancelSurveyResultUndefined: Self = StObject.set(x, "cancelSurveyResult", js.undefined)
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
  }
}
