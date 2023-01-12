package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntry[BundleContentType]
  extends StObject
     with BackboneElement {
  
  var _fullUrl: js.UndefOr[Element] = js.undefined
  
  /**
    * fullUrl might not be [unique in the context of a resource](bundle.html#bundle-unique). Note that since [FHIR resources do not need to be served through the FHIR API](references.html), the fullURL might be a URN or an absolute URL that does not end with the logical id of the resource (Resource.id). However, but if the fullUrl does look like a RESTful server URL (e.g. meets the [regex](references.html#regex), then the 'id' portion of the fullUrl SHALL end with the Resource.id.
    * Note that the fullUrl is not the same as the canonical URL - it's an absolute url for an endpoint serving the resource (these will happen to have the same value on the canonical server for the resource with the canonical URL).
    */
  var fullUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A series of links that provide context to this entry.
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /**
    * Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.
    */
  var request: js.UndefOr[BundleEntryRequest] = js.undefined
  
  /**
    * The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.
    */
  var resource: js.UndefOr[BundleContentType] = js.undefined
  
  /**
    * Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.
    */
  var response: js.UndefOr[BundleEntryResponse] = js.undefined
  
  /**
    * Information about the search process that lead to the creation of this entry.
    */
  var search: js.UndefOr[BundleEntrySearch] = js.undefined
}
object BundleEntry {
  
  inline def apply[BundleContentType](): BundleEntry[BundleContentType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntry[BundleContentType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleEntry[?], BundleContentType] (val x: Self & BundleEntry[BundleContentType]) extends AnyVal {
    
    inline def setFullUrl(value: String): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
    
    inline def setFullUrlUndefined: Self = StObject.set(x, "fullUrl", js.undefined)
    
    inline def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setRequest(value: BundleEntryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResource(value: BundleContentType): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(value: BundleEntryResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSearch(value: BundleEntrySearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def set_fullUrl(value: Element): Self = StObject.set(x, "_fullUrl", value.asInstanceOf[js.Any])
    
    inline def set_fullUrlUndefined: Self = StObject.set(x, "_fullUrl", js.undefined)
  }
}
