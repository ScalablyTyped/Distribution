package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetOperationRequest. */
@js.native
trait IGetOperationRequest extends StObject {
  
  /** GetOperationRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IGetOperationRequest {
  
  @scala.inline
  def apply(): IGetOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetOperationRequest]
  }
  
  @scala.inline
  implicit class IGetOperationRequestMutableBuilder[Self <: IGetOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
