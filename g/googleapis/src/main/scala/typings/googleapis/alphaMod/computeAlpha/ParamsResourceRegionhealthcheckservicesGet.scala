package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionhealthcheckservicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HealthCheckService to update. The name must be 1-63 characters long, and comply with RFC1035.
    */
  var healthCheckService: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionhealthcheckservicesGet {
  
  inline def apply(): ParamsResourceRegionhealthcheckservicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionhealthcheckservicesGet]
  }
  
  extension [Self <: ParamsResourceRegionhealthcheckservicesGet](x: Self) {
    
    inline def setHealthCheckService(value: String): Self = StObject.set(x, "healthCheckService", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckServiceUndefined: Self = StObject.set(x, "healthCheckService", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
