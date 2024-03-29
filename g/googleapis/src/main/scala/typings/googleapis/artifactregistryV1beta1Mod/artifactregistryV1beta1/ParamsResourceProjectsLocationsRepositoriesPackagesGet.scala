package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesPackagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the package to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesPackagesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesPackagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesPackagesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesPackagesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
