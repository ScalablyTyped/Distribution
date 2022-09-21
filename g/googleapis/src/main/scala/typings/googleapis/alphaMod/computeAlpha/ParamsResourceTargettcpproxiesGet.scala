package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargettcpproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetTcpProxy resource to return.
    */
  var targetTcpProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargettcpproxiesGet {
  
  inline def apply(): ParamsResourceTargettcpproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargettcpproxiesGet]
  }
  
  extension [Self <: ParamsResourceTargettcpproxiesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTargetTcpProxy(value: String): Self = StObject.set(x, "targetTcpProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetTcpProxyUndefined: Self = StObject.set(x, "targetTcpProxy", js.undefined)
  }
}
