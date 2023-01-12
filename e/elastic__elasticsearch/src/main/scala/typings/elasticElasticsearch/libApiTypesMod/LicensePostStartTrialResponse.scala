package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartTrialResponse extends StObject {
  
  var acknowledged: Boolean
  
  var error_message: js.UndefOr[String] = js.undefined
  
  var trial_was_started: Boolean
  
  var `type`: js.UndefOr[LicenseLicenseType] = js.undefined
}
object LicensePostStartTrialResponse {
  
  inline def apply(acknowledged: Boolean, trial_was_started: Boolean): LicensePostStartTrialResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], trial_was_started = trial_was_started.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensePostStartTrialResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicensePostStartTrialResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
    
    inline def setTrial_was_started(value: Boolean): Self = StObject.set(x, "trial_was_started", value.asInstanceOf[js.Any])
    
    inline def setType(value: LicenseLicenseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
