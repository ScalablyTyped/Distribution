package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGetTrialStatusResponse extends StObject {
  
  var eligible_to_start_trial: Boolean
}
object LicenseGetTrialStatusResponse {
  
  inline def apply(eligible_to_start_trial: Boolean): LicenseGetTrialStatusResponse = {
    val __obj = js.Dynamic.literal(eligible_to_start_trial = eligible_to_start_trial.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseGetTrialStatusResponse]
  }
  
  extension [Self <: LicenseGetTrialStatusResponse](x: Self) {
    
    inline def setEligible_to_start_trial(value: Boolean): Self = StObject.set(x, "eligible_to_start_trial", value.asInstanceOf[js.Any])
  }
}
