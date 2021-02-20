package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStyleTextsRequest extends StObject {
  
  var edits: js.Array[StyleDeclarationEdit] = js.native
}
object SetStyleTextsRequest {
  
  @scala.inline
  def apply(edits: js.Array[StyleDeclarationEdit]): SetStyleTextsRequest = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsRequest]
  }
  
  @scala.inline
  implicit class SetStyleTextsRequestMutableBuilder[Self <: SetStyleTextsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[StyleDeclarationEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: StyleDeclarationEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
  }
}
