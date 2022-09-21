package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertValidationFailureEvent extends StObject {
  
  /**
    * The reason why certification validation failed.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertValidationFailureEvent {
  
  inline def apply(): SchemaCertValidationFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertValidationFailureEvent]
  }
  
  extension [Self <: SchemaCertValidationFailureEvent](x: Self) {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
