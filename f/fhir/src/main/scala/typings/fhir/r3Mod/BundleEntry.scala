package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntry[BundleContentType]
  extends StObject
     with BackboneElement {
  
  var _fullUrl: js.UndefOr[Element] = js.undefined
  
  /**
    * fullUrl may not be [unique in the context of a resource](bundle.html#bundle-unique). Note that since [FHIR resources do not need to be served through the FHIR API](references.html), the absolute URL may not end with the logical id of the resource (Resource.id), but if the fullUrl does look like a RESTful server URL (e.g. meets the [regex](references.html#regex), then it SHALL end with the Resource.id.
    */
  var fullUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A series of links that provide context to this entry.
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /**
    * Additional information about how this entry should be processed as part of a transaction.
    */
  var request: js.UndefOr[BundleEntryRequest] = js.undefined
  
  /**
    * The Resources for the entry.
    */
  var resource: js.UndefOr[BundleContentType] = js.undefined
  
  /**
    * Additional information about how this entry should be processed as part of a transaction.
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
