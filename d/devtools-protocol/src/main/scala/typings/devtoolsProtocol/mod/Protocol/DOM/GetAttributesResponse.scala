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
  
  inline def apply(attributes: js.Array[String]): GetAttributesResponse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesResponse]
  }
  
  extension [Self <: GetAttributesResponse](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}
