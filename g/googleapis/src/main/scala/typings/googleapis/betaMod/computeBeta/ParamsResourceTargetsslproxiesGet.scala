package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetsslproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetSslProxy resource to return.
    */
  var targetSslProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetsslproxiesGet {
  
  inline def apply(): ParamsResourceTargetsslproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetsslproxiesGet]
  }
  
  extension [Self <: ParamsResourceTargetsslproxiesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTargetSslProxy(value: String): Self = StObject.set(x, "targetSslProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetSslProxyUndefined: Self = StObject.set(x, "targetSslProxy", js.undefined)
  }
}
