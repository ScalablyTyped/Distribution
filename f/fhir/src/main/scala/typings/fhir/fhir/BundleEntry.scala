package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entry in the bundle - will have a resource, or information
  */
trait BundleEntry
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'fullUrl'.
    */
  var _fullUrl: js.UndefOr[Element] = js.undefined
  
  /**
    * Absolute URL for resource (server address, or UUID/OID)
    */
  var fullUrl: js.UndefOr[uri] = js.undefined
  
  /**
    * Links related to this entry
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /**
    * Transaction Related Information
    */
  var request: js.UndefOr[BundleEntryRequest] = js.undefined
  
  /**
    * A resource in the bundle
    */
  var resource: js.UndefOr[Resource] = js.undefined
  
  /**
    * Transaction Related Information
    */
  var response: js.UndefOr[BundleEntryResponse] = js.undefined
  
  /**
    * Search related information
    */
  var search: js.UndefOr[BundleEntrySearch] = js.undefined
}
object BundleEntry {
  
  @scala.inline
  def apply(): BundleEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntry]
  }
  
  @scala.inline
  implicit class BundleEntryMutableBuilder[Self <: BundleEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullUrl(value: uri): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUrlUndefined: Self = StObject.set(x, "fullUrl", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: BundleEntryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResponse(value: BundleEntryResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSearch(value: BundleEntrySearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def set_fullUrl(value: Element): Self = StObject.set(x, "_fullUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fullUrlUndefined: Self = StObject.set(x, "_fullUrl", js.undefined)
  }
}
