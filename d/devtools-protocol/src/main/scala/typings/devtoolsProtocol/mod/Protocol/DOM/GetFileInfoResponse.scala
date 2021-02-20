package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoResponse extends StObject {
  
  var path: String = js.native
}
object GetFileInfoResponse {
  
  @scala.inline
  def apply(path: String): GetFileInfoResponse = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoResponse]
  }
  
  @scala.inline
  implicit class GetFileInfoResponseMutableBuilder[Self <: GetFileInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
