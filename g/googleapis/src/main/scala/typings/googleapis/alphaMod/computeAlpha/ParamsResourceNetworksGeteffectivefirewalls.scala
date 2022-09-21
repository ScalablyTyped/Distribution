package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworksGeteffectivefirewalls
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the network for this request.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworksGeteffectivefirewalls {
  
  inline def apply(): ParamsResourceNetworksGeteffectivefirewalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworksGeteffectivefirewalls]
  }
  
  extension [Self <: ParamsResourceNetworksGeteffectivefirewalls](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
