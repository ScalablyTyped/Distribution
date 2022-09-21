package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesPackagesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the package to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesPackagesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesPackagesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesPackagesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesPackagesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
