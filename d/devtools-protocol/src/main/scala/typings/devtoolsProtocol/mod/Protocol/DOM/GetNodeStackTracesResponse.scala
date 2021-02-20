package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodeStackTracesResponse extends StObject {
  
  /**
    * Creation stack trace, if available.
    */
  var creation: js.UndefOr[StackTrace] = js.native
}
object GetNodeStackTracesResponse {
  
  @scala.inline
  def apply(): GetNodeStackTracesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeStackTracesResponse]
  }
  
  @scala.inline
  implicit class GetNodeStackTracesResponseMutableBuilder[Self <: GetNodeStackTracesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreation(value: StackTrace): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
  }
}
