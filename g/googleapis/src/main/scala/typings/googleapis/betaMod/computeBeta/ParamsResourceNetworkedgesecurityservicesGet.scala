package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworkedgesecurityservicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the network edge security service to get.
    */
  var networkEdgeSecurityService: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworkedgesecurityservicesGet {
  
  inline def apply(): ParamsResourceNetworkedgesecurityservicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkedgesecurityservicesGet]
  }
  
  extension [Self <: ParamsResourceNetworkedgesecurityservicesGet](x: Self) {
    
    inline def setNetworkEdgeSecurityService(value: String): Self = StObject.set(x, "networkEdgeSecurityService", value.asInstanceOf[js.Any])
    
    inline def setNetworkEdgeSecurityServiceUndefined: Self = StObject.set(x, "networkEdgeSecurityService", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
