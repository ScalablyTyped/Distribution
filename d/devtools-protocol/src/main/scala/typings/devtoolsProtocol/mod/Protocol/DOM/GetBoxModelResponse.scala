package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBoxModelResponse extends StObject {
  
  /**
    * Box model for the node.
    */
  var model: BoxModel
}
object GetBoxModelResponse {
  
  inline def apply(model: BoxModel): GetBoxModelResponse = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBoxModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBoxModelResponse] (val x: Self) extends AnyVal {
    
    inline def setModel(value: BoxModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
