package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropPayload extends StObject {
  
  var dropResult: js.Any
}
object DropPayload {
  
  inline def apply(dropResult: js.Any): DropPayload = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPayload]
  }
  
  extension [Self <: DropPayload](x: Self) {
    
    inline def setDropResult(value: js.Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
  }
}
