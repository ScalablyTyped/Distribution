package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisDeploymentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the deployment to retrieve. Format: projects/x/locations/x/apis/x/deployments/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisDeploymentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsApisDeploymentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisDeploymentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisDeploymentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
