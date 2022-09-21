package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkerpoolsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. If this is provided, it must match the server's etag on the workerpool for the request to be processed.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the `WorkerPool` to delete. Format: `projects/{project\}/locations/{workerPool\}/workerPools/{workerPool\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkerpoolsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkerpoolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkerpoolsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkerpoolsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
