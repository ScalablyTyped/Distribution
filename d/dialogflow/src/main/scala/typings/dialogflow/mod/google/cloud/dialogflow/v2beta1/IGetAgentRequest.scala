package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetAgentRequest. */
@js.native
trait IGetAgentRequest extends StObject {
  
  /** GetAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object IGetAgentRequest {
  
  @scala.inline
  def apply(): IGetAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetAgentRequest]
  }
  
  @scala.inline
  implicit class IGetAgentRequestMutableBuilder[Self <: IGetAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
