package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropPayload extends StObject {
  
  var dropResult: Any
}
object DropPayload {
  
  inline def apply(dropResult: Any): DropPayload = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropPayload] (val x: Self) extends AnyVal {
    
    inline def setDropResult(value: Any): Self = StObject.set(x, "dropResult", value.asInstanceOf[js.Any])
  }
}
