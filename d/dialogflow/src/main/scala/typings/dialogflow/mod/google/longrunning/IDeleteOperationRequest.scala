package typings.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteOperationRequest. */
@js.native
trait IDeleteOperationRequest extends StObject {
  
  /** DeleteOperationRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IDeleteOperationRequest {
  
  @scala.inline
  def apply(): IDeleteOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteOperationRequest]
  }
  
  @scala.inline
  implicit class IDeleteOperationRequestMutableBuilder[Self <: IDeleteOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
