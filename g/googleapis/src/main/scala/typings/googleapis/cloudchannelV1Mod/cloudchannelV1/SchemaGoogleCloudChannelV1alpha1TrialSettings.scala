package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1TrialSettings extends StObject {
  
  /**
    * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example [Epoch converter](https://www.epochconverter.com).
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines if the entitlement is in a trial or not: * `true` - The entitlement is in trial. * `false` - The entitlement is not in trial.
    */
  var trial: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1TrialSettings {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1TrialSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1TrialSettings]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1TrialSettings](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setTrial(value: Boolean): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialNull: Self = StObject.set(x, "trial", null)
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
