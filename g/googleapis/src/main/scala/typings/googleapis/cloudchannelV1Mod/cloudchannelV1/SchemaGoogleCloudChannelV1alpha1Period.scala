package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1Period extends StObject {
  
  /**
    * Total duration of Period Type defined.
    */
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Period Type.
    */
  var periodType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1Period {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1Period = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1Period]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1Period](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setPeriodType(value: String): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    inline def setPeriodTypeNull: Self = StObject.set(x, "periodType", null)
    
    inline def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
  }
}
