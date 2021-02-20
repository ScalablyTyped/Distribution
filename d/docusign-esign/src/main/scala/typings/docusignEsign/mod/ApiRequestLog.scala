package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiRequestLog extends StObject {
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.native
  
  var requestLogId: js.UndefOr[String] = js.native
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.native
}
object ApiRequestLog {
  
  @scala.inline
  def apply(): ApiRequestLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiRequestLog]
  }
  
  @scala.inline
  implicit class ApiRequestLogMutableBuilder[Self <: ApiRequestLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRequestLogId(value: String): Self = StObject.set(x, "requestLogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestLogIdUndefined: Self = StObject.set(x, "requestLogId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
