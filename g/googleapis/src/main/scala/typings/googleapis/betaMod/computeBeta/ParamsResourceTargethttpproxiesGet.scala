package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargethttpproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetHttpProxy resource to return.
    */
  var targetHttpProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargethttpproxiesGet {
  
  inline def apply(): ParamsResourceTargethttpproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargethttpproxiesGet]
  }
  
  extension [Self <: ParamsResourceTargethttpproxiesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTargetHttpProxy(value: String): Self = StObject.set(x, "targetHttpProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpProxyUndefined: Self = StObject.set(x, "targetHttpProxy", js.undefined)
  }
}
