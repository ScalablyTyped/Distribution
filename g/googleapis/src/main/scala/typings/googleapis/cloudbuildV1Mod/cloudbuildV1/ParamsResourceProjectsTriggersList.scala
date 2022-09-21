package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTriggersList
  extends StObject
     with StandardParameters {
  
  /**
    * Number of results to return in the list.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent of the collection of `Triggers`. Format: `projects/{project\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the project for which to list BuildTriggers.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTriggersList {
  
  inline def apply(): ParamsResourceProjectsTriggersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTriggersList]
  }
  
  extension [Self <: ParamsResourceProjectsTriggersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
