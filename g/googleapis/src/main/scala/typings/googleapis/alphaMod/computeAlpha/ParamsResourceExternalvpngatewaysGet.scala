package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceExternalvpngatewaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the externalVpnGateway to return.
    */
  var externalVpnGateway: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceExternalvpngatewaysGet {
  
  inline def apply(): ParamsResourceExternalvpngatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceExternalvpngatewaysGet]
  }
  
  extension [Self <: ParamsResourceExternalvpngatewaysGet](x: Self) {
    
    inline def setExternalVpnGateway(value: String): Self = StObject.set(x, "externalVpnGateway", value.asInstanceOf[js.Any])
    
    inline def setExternalVpnGatewayUndefined: Self = StObject.set(x, "externalVpnGateway", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
