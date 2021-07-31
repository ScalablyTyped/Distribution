package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceRequestStatus extends StObject {
  
  /**
    * The current status of the conference create request. Read-only. The
    * possible values are:   - &quot;pending&quot;: the conference create
    * request is still being processed. - &quot;success&quot;: the conference
    * create request succeeded, the entry points are populated. -
    * &quot;failure&quot;: the conference create request failed, there are no
    * entry points.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object SchemaConferenceRequestStatus {
  
  @scala.inline
  def apply(): SchemaConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceRequestStatus]
  }
  
  @scala.inline
  implicit class SchemaConferenceRequestStatusMutableBuilder[Self <: SchemaConferenceRequestStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
