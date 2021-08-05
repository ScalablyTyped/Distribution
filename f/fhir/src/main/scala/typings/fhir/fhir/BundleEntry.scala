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
  
  inline def apply(): BundleEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntry]
  }
  
  extension [Self <: BundleEntry](x: Self) {
    
    inline def setFullUrl(value: uri): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
    
    inline def setFullUrlUndefined: Self = StObject.set(x, "fullUrl", js.undefined)
    
    inline def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    inline def setRequest(value: BundleEntryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(value: BundleEntryResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSearch(value: BundleEntrySearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def set_fullUrl(value: Element): Self = StObject.set(x, "_fullUrl", value.asInstanceOf[js.Any])
    
    inline def set_fullUrlUndefined: Self = StObject.set(x, "_fullUrl", js.undefined)
  }
}
