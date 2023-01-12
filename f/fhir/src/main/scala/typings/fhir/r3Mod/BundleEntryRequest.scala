package typings.fhir.r3Mod

import typings.fhir.fhirStrings.DELETE
import typings.fhir.fhirStrings.GET
import typings.fhir.fhirStrings.POST
import typings.fhir.fhirStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntryRequest
  extends StObject
     with BackboneElement {
  
  var _ifMatch: js.UndefOr[Element] = js.undefined
  
  var _ifModifiedSince: js.UndefOr[Element] = js.undefined
  
  var _ifNoneExist: js.UndefOr[Element] = js.undefined
  
  var _ifNoneMatch: js.UndefOr[Element] = js.undefined
  
  var _method: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
    */
  var ifMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
    */
  var ifModifiedSince: js.UndefOr[String] = js.undefined
  
  /**
    * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
    */
  var ifNoneExist: js.UndefOr[String] = js.undefined
  
  /**
    * If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
    */
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP verb for this entry in either a change history, or a transaction/ transaction response.
    */
  var method: GET | POST | PUT | DELETE
  
  /**
    * E.g. for a Patient Create, the method would be "POST" and the URL would be "Patient". For a Patient Update, the method would be PUT, and the URL would be "Patient/[id]".
    */
  var url: String
}
object BundleEntryRequest {
  
  inline def apply(method: GET | POST | PUT | DELETE, url: String): BundleEntryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleEntryRequest] (val x: Self) extends AnyVal {
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    
    inline def setIfModifiedSince(value: String): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    inline def setIfNoneExist(value: String): Self = StObject.set(x, "ifNoneExist", value.asInstanceOf[js.Any])
    
    inline def setIfNoneExistUndefined: Self = StObject.set(x, "ifNoneExist", js.undefined)
    
    inline def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_ifMatch(value: Element): Self = StObject.set(x, "_ifMatch", value.asInstanceOf[js.Any])
    
    inline def set_ifMatchUndefined: Self = StObject.set(x, "_ifMatch", js.undefined)
    
    inline def set_ifModifiedSince(value: Element): Self = StObject.set(x, "_ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def set_ifModifiedSinceUndefined: Self = StObject.set(x, "_ifModifiedSince", js.undefined)
    
    inline def set_ifNoneExist(value: Element): Self = StObject.set(x, "_ifNoneExist", value.asInstanceOf[js.Any])
    
    inline def set_ifNoneExistUndefined: Self = StObject.set(x, "_ifNoneExist", js.undefined)
    
    inline def set_ifNoneMatch(value: Element): Self = StObject.set(x, "_ifNoneMatch", value.asInstanceOf[js.Any])
    
    inline def set_ifNoneMatchUndefined: Self = StObject.set(x, "_ifNoneMatch", js.undefined)
    
    inline def set_method(value: Element): Self = StObject.set(x, "_method", value.asInstanceOf[js.Any])
    
    inline def set_methodUndefined: Self = StObject.set(x, "_method", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
