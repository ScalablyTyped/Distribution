package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentTimeRequest extends StObject {
  
  /**
    * Id of animation.
    */
  var id: String
}
object GetCurrentTimeRequest {
  
  inline def apply(id: String): GetCurrentTimeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentTimeRequest]
  }
  
  extension [Self <: GetCurrentTimeRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
