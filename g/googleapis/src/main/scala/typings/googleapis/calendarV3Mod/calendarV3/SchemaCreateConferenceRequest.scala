package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateConferenceRequest extends StObject {
  
  /**
    * The conference solution, such as Hangouts or Hangouts Meet.
    */
  var conferenceSolutionKey: js.UndefOr[SchemaConferenceSolutionKey] = js.undefined
  
  /**
    * The client-generated unique ID for this request. Clients should
    * regenerate this ID for every new request. If an ID provided is the same
    * as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the conference create request.
    */
  var status: js.UndefOr[SchemaConferenceRequestStatus] = js.undefined
}
object SchemaCreateConferenceRequest {
  
  @scala.inline
  def apply(): SchemaCreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateConferenceRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateConferenceRequestMutableBuilder[Self <: SchemaCreateConferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceSolutionKey(value: SchemaConferenceSolutionKey): Self = StObject.set(x, "conferenceSolutionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceSolutionKeyUndefined: Self = StObject.set(x, "conferenceSolutionKey", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaConferenceRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
