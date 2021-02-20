package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction Related Information
  */
@js.native
trait BundleEntryRequest extends BackboneElement {
  
  /**
    * Contains extended information for property 'ifMatch'.
    */
  var _ifMatch: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'ifModifiedSince'.
    */
  var _ifModifiedSince: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'ifNoneExist'.
    */
  var _ifNoneExist: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'ifNoneMatch'.
    */
  var _ifNoneMatch: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'method'.
    */
  var _method: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * For managing update contention
    */
  var ifMatch: js.UndefOr[String] = js.native
  
  /**
    * For managing update contention
    */
  var ifModifiedSince: js.UndefOr[instant] = js.native
  
  /**
    * For conditional creates
    */
  var ifNoneExist: js.UndefOr[String] = js.native
  
  /**
    * For managing cache currency
    */
  var ifNoneMatch: js.UndefOr[String] = js.native
  
  /**
    * GET | POST | PUT | DELETE
    */
  var method: code = js.native
  
  /**
    * URL for HTTP equivalent of this entry
    */
  var url: uri = js.native
}
object BundleEntryRequest {
  
  @scala.inline
  def apply(method: code, url: uri): BundleEntryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryRequest]
  }
  
  @scala.inline
  implicit class BundleEntryRequestMutableBuilder[Self <: BundleEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: instant): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneExist(value: String): Self = StObject.set(x, "ifNoneExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNoneExistUndefined: Self = StObject.set(x, "ifNoneExist", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    
    @scala.inline
    def setMethod(value: code): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifMatch(value: Element): Self = StObject.set(x, "_ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifMatchUndefined: Self = StObject.set(x, "_ifMatch", js.undefined)
    
    @scala.inline
    def set_ifModifiedSince(value: Element): Self = StObject.set(x, "_ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifModifiedSinceUndefined: Self = StObject.set(x, "_ifModifiedSince", js.undefined)
    
    @scala.inline
    def set_ifNoneExist(value: Element): Self = StObject.set(x, "_ifNoneExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifNoneExistUndefined: Self = StObject.set(x, "_ifNoneExist", js.undefined)
    
    @scala.inline
    def set_ifNoneMatch(value: Element): Self = StObject.set(x, "_ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifNoneMatchUndefined: Self = StObject.set(x, "_ifNoneMatch", js.undefined)
    
    @scala.inline
    def set_method(value: Element): Self = StObject.set(x, "_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_methodUndefined: Self = StObject.set(x, "_method", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
