package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapTest extends StObject {
  
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
    */
  var expectedOutputUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
    */
  var expectedRedirectResponseCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
    */
  var headers: js.UndefOr[js.Array[SchemaUrlMapTestHeader]] = js.undefined
  
  /**
    * Host portion of the URL. If headers contains a host header, then host must also match the header value.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path portion of the URL.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlMapTest {
  
  inline def apply(): SchemaUrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapTest]
  }
  
  extension [Self <: SchemaUrlMapTest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpectedOutputUrl(value: String): Self = StObject.set(x, "expectedOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutputUrlNull: Self = StObject.set(x, "expectedOutputUrl", null)
    
    inline def setExpectedOutputUrlUndefined: Self = StObject.set(x, "expectedOutputUrl", js.undefined)
    
    inline def setExpectedRedirectResponseCode(value: Double): Self = StObject.set(x, "expectedRedirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setExpectedRedirectResponseCodeNull: Self = StObject.set(x, "expectedRedirectResponseCode", null)
    
    inline def setExpectedRedirectResponseCodeUndefined: Self = StObject.set(x, "expectedRedirectResponseCode", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaUrlMapTestHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaUrlMapTestHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
