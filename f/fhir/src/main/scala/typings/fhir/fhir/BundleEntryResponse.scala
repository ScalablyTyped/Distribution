package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction Related Information
  */
trait BundleEntryResponse
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'etag'.
    */
  var _etag: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lastModified'.
    */
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'location'.
    */
  var _location: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The etag for the resource (if relevant)
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Server's date time modified
    */
  var lastModified: js.UndefOr[instant] = js.undefined
  
  /**
    * The location, if the operation returns a location
    */
  var location: js.UndefOr[uri] = js.undefined
  
  /**
    * OperationOutcome with hints and warnings (for batch/transaction)
    */
  var outcome: js.UndefOr[Resource] = js.undefined
  
  /**
    * Status response code (text optional)
    */
  var status: String
}
object BundleEntryResponse {
  
  @scala.inline
  def apply(status: String): BundleEntryResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryResponse]
  }
  
  @scala.inline
  implicit class BundleEntryResponseMutableBuilder[Self <: BundleEntryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setLastModified(value: instant): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setLocation(value: uri): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOutcome(value: Resource): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_etag(value: Element): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    @scala.inline
    def set_lastModified(value: Element): Self = StObject.set(x, "_lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastModifiedUndefined: Self = StObject.set(x, "_lastModified", js.undefined)
    
    @scala.inline
    def set_location(value: Element): Self = StObject.set(x, "_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_locationUndefined: Self = StObject.set(x, "_location", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
