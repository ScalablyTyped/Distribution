package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoResponse extends StObject {
  
  var path: String
}
object GetFileInfoResponse {
  
  inline def apply(path: String): GetFileInfoResponse = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFileInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
