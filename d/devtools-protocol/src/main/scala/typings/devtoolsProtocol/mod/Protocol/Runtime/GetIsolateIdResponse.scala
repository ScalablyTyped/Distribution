package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsolateIdResponse extends StObject {
  
  /**
    * The isolate id.
    */
  var id: String
}
object GetIsolateIdResponse {
  
  inline def apply(id: String): GetIsolateIdResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIsolateIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIsolateIdResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
