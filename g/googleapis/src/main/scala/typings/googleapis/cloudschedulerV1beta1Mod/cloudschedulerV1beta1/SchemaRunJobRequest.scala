package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunJobRequest extends StObject {
  
  /**
    * This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job in the __cron queue with the corresponding name will be forced to run instead.
    */
  var legacyAppEngineCron: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRunJobRequest {
  
  inline def apply(): SchemaRunJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunJobRequest]
  }
  
  extension [Self <: SchemaRunJobRequest](x: Self) {
    
    inline def setLegacyAppEngineCron(value: Boolean): Self = StObject.set(x, "legacyAppEngineCron", value.asInstanceOf[js.Any])
    
    inline def setLegacyAppEngineCronNull: Self = StObject.set(x, "legacyAppEngineCron", null)
    
    inline def setLegacyAppEngineCronUndefined: Self = StObject.set(x, "legacyAppEngineCron", js.undefined)
  }
}
