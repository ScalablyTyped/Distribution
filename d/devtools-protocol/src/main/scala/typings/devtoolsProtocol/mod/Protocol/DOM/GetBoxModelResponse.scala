package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBoxModelResponse extends StObject {
  
  /**
    * Box model for the node.
    */
  var model: BoxModel = js.native
}
object GetBoxModelResponse {
  
  @scala.inline
  def apply(model: BoxModel): GetBoxModelResponse = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBoxModelResponse]
  }
  
  @scala.inline
  implicit class GetBoxModelResponseMutableBuilder[Self <: GetBoxModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: BoxModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
