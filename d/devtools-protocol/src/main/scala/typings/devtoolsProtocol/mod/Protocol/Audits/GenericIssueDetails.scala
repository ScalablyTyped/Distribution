package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericIssueDetails extends StObject {
  
  /**
    * Issues with the same errorType are aggregated in the frontend.
    */
  var errorType: GenericIssueErrorType
  
  var frameId: js.UndefOr[FrameId] = js.undefined
}
object GenericIssueDetails {
  
  inline def apply(errorType: GenericIssueErrorType): GenericIssueDetails = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: GenericIssueErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
