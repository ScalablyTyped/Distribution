package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntryResponse
  extends StObject
     with BackboneElement {
  
  var _etag: js.UndefOr[Element] = js.undefined
  
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  var _location: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The etag for the resource, it the operation for the entry produced a versioned resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The date/time that the resource was modified on the server.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * The location header created by processing this operation.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The status code returned by processing this entry.
    */
  var status: String
}
object BundleEntryResponse {
  
  inline def apply(status: String): BundleEntryResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryResponse]
  }
  
  extension [Self <: BundleEntryResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_etag(value: Element): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    inline def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    inline def set_lastModified(value: Element): Self = StObject.set(x, "_lastModified", value.asInstanceOf[js.Any])
    
    inline def set_lastModifiedUndefined: Self = StObject.set(x, "_lastModified", js.undefined)
    
    inline def set_location(value: Element): Self = StObject.set(x, "_location", value.asInstanceOf[js.Any])
    
    inline def set_locationUndefined: Self = StObject.set(x, "_location", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
