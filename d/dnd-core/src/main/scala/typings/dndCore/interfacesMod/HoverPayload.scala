package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverPayload extends StObject {
  
  var clientOffset: XYCoord | Null = js.native
  
  var targetIds: js.Array[Identifier] = js.native
}
object HoverPayload {
  
  @scala.inline
  def apply(targetIds: js.Array[Identifier]): HoverPayload = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverPayload]
  }
  
  @scala.inline
  implicit class HoverPayloadMutableBuilder[Self <: HoverPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
    
    @scala.inline
    def setTargetIds(value: js.Array[Identifier]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsVarargs(value: Identifier*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}
