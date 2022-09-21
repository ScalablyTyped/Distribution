package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesYumartifactsImport
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the parent resource where the artifacts will be imported.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaImportYumArtifactsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesYumartifactsImport {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesYumartifactsImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesYumartifactsImport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesYumartifactsImport](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaImportYumArtifactsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
