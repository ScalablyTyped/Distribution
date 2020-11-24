package typings.fhir.fhir

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
  implicit class BundleEntryRequestOps[Self <: BundleEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethod(value: code): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifMatch(value: Element): Self = this.set("_ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ifMatch: Self = this.set("_ifMatch", js.undefined)
    
    @scala.inline
    def set_ifModifiedSince(value: Element): Self = this.set("_ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ifModifiedSince: Self = this.set("_ifModifiedSince", js.undefined)
    
    @scala.inline
    def set_ifNoneExist(value: Element): Self = this.set("_ifNoneExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ifNoneExist: Self = this.set("_ifNoneExist", js.undefined)
    
    @scala.inline
    def set_ifNoneMatch(value: Element): Self = this.set("_ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ifNoneMatch: Self = this.set("_ifNoneMatch", js.undefined)
    
    @scala.inline
    def set_method(value: Element): Self = this.set("_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_method: Self = this.set("_method", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def setIfMatch(value: String): Self = this.set("ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("ifMatch", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: instant): Self = this.set("ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("ifModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneExist(value: String): Self = this.set("ifNoneExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNoneExist: Self = this.set("ifNoneExist", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: String): Self = this.set("ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("ifNoneMatch", js.undefined)
  }
}
