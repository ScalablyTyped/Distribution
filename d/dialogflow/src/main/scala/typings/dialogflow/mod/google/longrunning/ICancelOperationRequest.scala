package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CancelOperationRequest. */
trait ICancelOperationRequest extends StObject {
  
  /** CancelOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object ICancelOperationRequest {
  
  @scala.inline
  def apply(): ICancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICancelOperationRequest]
  }
  
  @scala.inline
  implicit class ICancelOperationRequestMutableBuilder[Self <: ICancelOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
