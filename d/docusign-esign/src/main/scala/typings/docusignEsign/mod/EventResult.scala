package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventResult extends StObject {
  
  /**
    * Date/time of the event.
    */
  var eventTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Reason for failure, if the event failed.
    */
  var failureDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Event status.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Failure status code, if the event failed.
    */
  var vendorFailureStatusCode: js.UndefOr[String] = js.undefined
}
object EventResult {
  
  @scala.inline
  def apply(): EventResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventResult]
  }
  
  @scala.inline
  implicit class EventResultMutableBuilder[Self <: EventResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTimestamp(value: String): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: String): Self = StObject.set(x, "failureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDescriptionUndefined: Self = StObject.set(x, "failureDescription", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVendorFailureStatusCode(value: String): Self = StObject.set(x, "vendorFailureStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorFailureStatusCodeUndefined: Self = StObject.set(x, "vendorFailureStatusCode", js.undefined)
  }
}
