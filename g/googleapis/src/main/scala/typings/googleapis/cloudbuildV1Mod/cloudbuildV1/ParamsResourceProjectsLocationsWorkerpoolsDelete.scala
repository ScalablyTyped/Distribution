package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkerpoolsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, and the `WorkerPool` is not found, the request will succeed but no action will be taken on the server.
    */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If provided, it must match the server's etag on the workerpool for the request to be processed.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the `WorkerPool` to delete. Format: `projects/{project\}/locations/{location\}/workerPools/{workerPool\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If set, validate the request and preview the response, but do not actually post it.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsWorkerpoolsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkerpoolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkerpoolsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkerpoolsDelete](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
