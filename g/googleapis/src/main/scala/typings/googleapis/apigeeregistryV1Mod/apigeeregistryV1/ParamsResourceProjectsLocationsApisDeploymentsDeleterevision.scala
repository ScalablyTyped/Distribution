package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisDeploymentsDeleterevision
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the deployment revision to be deleted, with a revision ID explicitly included. Example: projects/sample/locations/global/apis/petstore/deployments/prod@c7cfa2a8
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisDeploymentsDeleterevision {
  
  inline def apply(): ParamsResourceProjectsLocationsApisDeploymentsDeleterevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisDeploymentsDeleterevision]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisDeploymentsDeleterevision](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
