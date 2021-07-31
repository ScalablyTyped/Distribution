package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributesResponse extends StObject {
  
  /**
    * An interleaved array of node attribute names and values.
    */
  var attributes: js.Array[String]
}
object GetAttributesResponse {
  
  @scala.inline
  def apply(attributes: js.Array[String]): GetAttributesResponse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesResponse]
  }
  
  @scala.inline
  implicit class GetAttributesResponseMutableBuilder[Self <: GetAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}
