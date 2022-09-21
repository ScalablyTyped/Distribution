package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the parent resource where the repository will be created.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The repository id to use for this repository.
    */
  var repositoryId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRepository] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    inline def setRequestBody(value: SchemaRepository): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
