package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInterconnectremotelocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the interconnect remote location to return.
    */
  var interconnectRemoteLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceInterconnectremotelocationsGet {
  
  inline def apply(): ParamsResourceInterconnectremotelocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectremotelocationsGet]
  }
  
  extension [Self <: ParamsResourceInterconnectremotelocationsGet](x: Self) {
    
    inline def setInterconnectRemoteLocation(value: String): Self = StObject.set(x, "interconnectRemoteLocation", value.asInstanceOf[js.Any])
    
    inline def setInterconnectRemoteLocationUndefined: Self = StObject.set(x, "interconnectRemoteLocation", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
