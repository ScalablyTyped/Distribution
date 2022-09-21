package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceHttpshealthchecksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HttpsHealthCheck resource to return.
    */
  var httpsHealthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceHttpshealthchecksGet {
  
  inline def apply(): ParamsResourceHttpshealthchecksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceHttpshealthchecksGet]
  }
  
  extension [Self <: ParamsResourceHttpshealthchecksGet](x: Self) {
    
    inline def setHttpsHealthCheck(value: String): Self = StObject.set(x, "httpsHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHttpsHealthCheckUndefined: Self = StObject.set(x, "httpsHealthCheck", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
