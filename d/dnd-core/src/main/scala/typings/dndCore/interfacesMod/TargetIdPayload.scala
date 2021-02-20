package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetIdPayload extends StObject {
  
  var targetId: Identifier = js.native
}
object TargetIdPayload {
  
  @scala.inline
  def apply(targetId: Identifier): TargetIdPayload = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetIdPayload]
  }
  
  @scala.inline
  implicit class TargetIdPayloadMutableBuilder[Self <: TargetIdPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: Identifier): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
