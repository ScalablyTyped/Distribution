package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceHttphealthchecksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HttpHealthCheck resource to return.
    */
  var httpHealthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceHttphealthchecksGet {
  
  inline def apply(): ParamsResourceHttphealthchecksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceHttphealthchecksGet]
  }
  
  extension [Self <: ParamsResourceHttphealthchecksGet](x: Self) {
    
    inline def setHttpHealthCheck(value: String): Self = StObject.set(x, "httpHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHttpHealthCheckUndefined: Self = StObject.set(x, "httpHealthCheck", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
