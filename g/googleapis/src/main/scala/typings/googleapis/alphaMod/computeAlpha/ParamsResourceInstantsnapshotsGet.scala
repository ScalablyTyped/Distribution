package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstantsnapshotsGet
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
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstantsnapshotsGet {
  
  inline def apply(): ParamsResourceInstantsnapshotsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstantsnapshotsGet]
  }
  
  extension [Self <: ParamsResourceInstantsnapshotsGet](x: Self) {
    
    inline def setInstantSnapshot(value: String): Self = StObject.set(x, "instantSnapshot", value.asInstanceOf[js.Any])
    
    inline def setInstantSnapshotUndefined: Self = StObject.set(x, "instantSnapshot", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
