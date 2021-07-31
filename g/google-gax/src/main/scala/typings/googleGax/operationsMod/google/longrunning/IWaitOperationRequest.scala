package typings.googleGax.operationsMod.google.longrunning

import typings.googleGax.operationsMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a WaitOperationRequest. */
trait IWaitOperationRequest extends StObject {
  
  /** WaitOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** WaitOperationRequest timeout */
  var timeout: js.UndefOr[IDuration | Null] = js.undefined
}
object IWaitOperationRequest {
  
  @scala.inline
  def apply(): IWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaitOperationRequest]
  }
  
  @scala.inline
  implicit class IWaitOperationRequestMutableBuilder[Self <: IWaitOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTimeout(value: IDuration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
