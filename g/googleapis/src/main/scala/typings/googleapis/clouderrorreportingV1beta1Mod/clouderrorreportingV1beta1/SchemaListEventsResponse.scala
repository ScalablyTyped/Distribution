package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set of requested error events.
  */
trait SchemaListEventsResponse extends StObject {
  
  /**
    * The error events which match the given request.
    */
  var errorEvents: js.UndefOr[js.Array[SchemaErrorEvent]] = js.undefined
  
  /**
    * If non-empty, more results are available. Pass this token, along with the
    * same query parameters as the first request, to view the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp specifies the start time to which the request was
    * restricted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.undefined
}
object SchemaListEventsResponse {
  
  @scala.inline
  def apply(): SchemaListEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEventsResponse]
  }
  
  @scala.inline
  implicit class SchemaListEventsResponseMutableBuilder[Self <: SchemaListEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorEvents(value: js.Array[SchemaErrorEvent]): Self = StObject.set(x, "errorEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorEventsUndefined: Self = StObject.set(x, "errorEvents", js.undefined)
    
    @scala.inline
    def setErrorEventsVarargs(value: SchemaErrorEvent*): Self = StObject.set(x, "errorEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTimeRangeBegin(value: String): Self = StObject.set(x, "timeRangeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeBeginUndefined: Self = StObject.set(x, "timeRangeBegin", js.undefined)
  }
}
