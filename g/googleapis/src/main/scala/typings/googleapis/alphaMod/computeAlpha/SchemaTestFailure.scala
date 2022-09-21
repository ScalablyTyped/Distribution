package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestFailure extends StObject {
  
  /**
    * The actual output URL evaluated by a load balancer containing the scheme, host, path and query parameters.
    */
  var actualOutputUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actual HTTP status code for rule with `urlRedirect` calculated by load balancer
    */
  var actualRedirectResponseCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * BackendService or BackendBucket returned by load balancer.
    */
  var actualService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expected output URL evaluated by a load balancer containing the scheme, host, path and query parameters.
    */
  var expectedOutputUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expected HTTP status code for rule with `urlRedirect` calculated by load balancer
    */
  var expectedRedirectResponseCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Expected BackendService or BackendBucket resource the given URL should be mapped to.
    */
  var expectedService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP headers of the request.
    */
  var headers: js.UndefOr[js.Array[SchemaUrlMapTestHeader]] = js.undefined
  
  /**
    * Host portion of the URL.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path portion including query parameters in the URL.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestFailure {
  
  inline def apply(): SchemaTestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestFailure]
  }
  
  extension [Self <: SchemaTestFailure](x: Self) {
    
    inline def setActualOutputUrl(value: String): Self = StObject.set(x, "actualOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setActualOutputUrlNull: Self = StObject.set(x, "actualOutputUrl", null)
    
    inline def setActualOutputUrlUndefined: Self = StObject.set(x, "actualOutputUrl", js.undefined)
    
    inline def setActualRedirectResponseCode(value: Double): Self = StObject.set(x, "actualRedirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setActualRedirectResponseCodeNull: Self = StObject.set(x, "actualRedirectResponseCode", null)
    
    inline def setActualRedirectResponseCodeUndefined: Self = StObject.set(x, "actualRedirectResponseCode", js.undefined)
    
    inline def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    inline def setActualServiceNull: Self = StObject.set(x, "actualService", null)
    
    inline def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    inline def setExpectedOutputUrl(value: String): Self = StObject.set(x, "expectedOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutputUrlNull: Self = StObject.set(x, "expectedOutputUrl", null)
    
    inline def setExpectedOutputUrlUndefined: Self = StObject.set(x, "expectedOutputUrl", js.undefined)
    
    inline def setExpectedRedirectResponseCode(value: Double): Self = StObject.set(x, "expectedRedirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setExpectedRedirectResponseCodeNull: Self = StObject.set(x, "expectedRedirectResponseCode", null)
    
    inline def setExpectedRedirectResponseCodeUndefined: Self = StObject.set(x, "expectedRedirectResponseCode", js.undefined)
    
    inline def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    inline def setExpectedServiceNull: Self = StObject.set(x, "expectedService", null)
    
    inline def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaUrlMapTestHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaUrlMapTestHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
