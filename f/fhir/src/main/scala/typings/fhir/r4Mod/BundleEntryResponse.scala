package typings.fhir.r4Mod

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
    * Etags match the Resource.meta.versionId. The ETag has to match the version id in the header if a resource is included.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * This has to match the same time in the meta header (meta.lastUpdated) if a resource is included.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * The location header created by processing this operation, populated if the operation returns a location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * For a POST/PUT operation, this is the equivalent outcome that would be returned for prefer = operationoutcome - except that the resource is always returned whether or not the outcome is returned.
    * This outcome is not used for error responses in batch/transaction, only for hints and warnings. In a batch operation, the error will be in Bundle.entry.response, and for transaction, there will be a single OperationOutcome instead of a bundle in the case of an error.
    */
  var outcome: js.UndefOr[FhirResource] = js.undefined
  
  /**
    * The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
    */
  var status: String
}
object BundleEntryResponse {
  
  inline def apply(status: String): BundleEntryResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleEntryResponse] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOutcome(value: FhirResource): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
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
