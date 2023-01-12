package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAcceptedEncodingsRequest extends StObject {
  
  /**
    * List of accepted content encodings.
    */
  var encodings: js.Array[ContentEncoding]
}
object SetAcceptedEncodingsRequest {
  
  inline def apply(encodings: js.Array[ContentEncoding]): SetAcceptedEncodingsRequest = {
    val __obj = js.Dynamic.literal(encodings = encodings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAcceptedEncodingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetAcceptedEncodingsRequest] (val x: Self) extends AnyVal {
    
    inline def setEncodings(value: js.Array[ContentEncoding]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
    
    inline def setEncodingsVarargs(value: ContentEncoding*): Self = StObject.set(x, "encodings", js.Array(value*))
  }
}
