package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetgrpcproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetGrpcProxy resource to return.
    */
  var targetGrpcProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetgrpcproxiesGet {
  
  inline def apply(): ParamsResourceTargetgrpcproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetgrpcproxiesGet]
  }
  
  extension [Self <: ParamsResourceTargetgrpcproxiesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTargetGrpcProxy(value: String): Self = StObject.set(x, "targetGrpcProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetGrpcProxyUndefined: Self = StObject.set(x, "targetGrpcProxy", js.undefined)
  }
}
