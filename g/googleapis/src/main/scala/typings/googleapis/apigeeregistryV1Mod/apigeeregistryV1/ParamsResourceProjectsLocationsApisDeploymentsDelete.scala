package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisDeploymentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the deployment to delete. Format: projects/x/locations/x/apis/x/deployments/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisDeploymentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsApisDeploymentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisDeploymentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisDeploymentsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
