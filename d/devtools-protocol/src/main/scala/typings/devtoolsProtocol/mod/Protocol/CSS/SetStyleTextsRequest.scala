package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStyleTextsRequest extends StObject {
  
  var edits: js.Array[StyleDeclarationEdit]
}
object SetStyleTextsRequest {
  
  inline def apply(edits: js.Array[StyleDeclarationEdit]): SetStyleTextsRequest = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleTextsRequest]
  }
  
  extension [Self <: SetStyleTextsRequest](x: Self) {
    
    inline def setEdits(value: js.Array[StyleDeclarationEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: StyleDeclarationEdit*): Self = StObject.set(x, "edits", js.Array(value*))
  }
}
