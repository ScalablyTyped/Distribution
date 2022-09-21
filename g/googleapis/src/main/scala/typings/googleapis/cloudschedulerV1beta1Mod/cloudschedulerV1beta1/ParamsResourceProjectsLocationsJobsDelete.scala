package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job in the __cron queue with the corresponding name will be deleted instead.
    */
  var legacyAppEngineCron: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsDelete](x: Self) {
    
    inline def setLegacyAppEngineCron(value: Boolean): Self = StObject.set(x, "legacyAppEngineCron", value.asInstanceOf[js.Any])
    
    inline def setLegacyAppEngineCronUndefined: Self = StObject.set(x, "legacyAppEngineCron", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
