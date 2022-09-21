package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegioninstantsnapshotsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the InstantSnapshot resource to return.
    */
  var instantSnapshot: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegioninstantsnapshotsGet {
  
  inline def apply(): ParamsResourceRegioninstantsnapshotsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegioninstantsnapshotsGet]
  }
  
  extension [Self <: ParamsResourceRegioninstantsnapshotsGet](x: Self) {
    
    inline def setInstantSnapshot(value: String): Self = StObject.set(x, "instantSnapshot", value.asInstanceOf[js.Any])
    
    inline def setInstantSnapshotUndefined: Self = StObject.set(x, "instantSnapshot", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
