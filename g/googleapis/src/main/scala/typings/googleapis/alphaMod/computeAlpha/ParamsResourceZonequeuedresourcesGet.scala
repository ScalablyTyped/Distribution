package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceZonequeuedresourcesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the QueuedResource resource to return.
    */
  var queuedResource: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceZonequeuedresourcesGet {
  
  inline def apply(): ParamsResourceZonequeuedresourcesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceZonequeuedresourcesGet]
  }
  
  extension [Self <: ParamsResourceZonequeuedresourcesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setQueuedResource(value: String): Self = StObject.set(x, "queuedResource", value.asInstanceOf[js.Any])
    
    inline def setQueuedResourceUndefined: Self = StObject.set(x, "queuedResource", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
