package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entry in the bundle - will have a resource, or information
  */
@js.native
trait BundleEntry extends BackboneElement {
  
  /**
    * Contains extended information for property 'fullUrl'.
    */
  var _fullUrl: js.UndefOr[Element] = js.native
  
  /**
    * Absolute URL for resource (server address, or UUID/OID)
    */
  var fullUrl: js.UndefOr[uri] = js.native
  
  /**
    * Links related to this entry
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.native
  
  /**
    * Transaction Related Information
    */
  var request: js.UndefOr[BundleEntryRequest] = js.native
  
  /**
    * A resource in the bundle
    */
  var resource: js.UndefOr[Resource] = js.native
  
  /**
    * Transaction Related Information
    */
  var response: js.UndefOr[BundleEntryResponse] = js.native
  
  /**
    * Search related information
    */
  var search: js.UndefOr[BundleEntrySearch] = js.native
}
object BundleEntry {
  
  @scala.inline
  def apply(): BundleEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntry]
  }
  
  @scala.inline
  implicit class BundleEntryOps[Self <: BundleEntry] (val x: Self) extends AnyVal {
    
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
    def set_fullUrl(value: Element): Self = this.set("_fullUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_fullUrl: Self = this.set("_fullUrl", js.undefined)
    
    @scala.inline
    def setFullUrl(value: uri): Self = this.set("fullUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullUrl: Self = this.set("fullUrl", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setRequest(value: BundleEntryRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResponse(value: BundleEntryResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setSearch(value: BundleEntrySearch): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
