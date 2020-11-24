package typings.dndCore.anon

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOffset extends js.Object {
  
  var clientOffset: XYCoord = js.native
  
  var sourceClientOffset: XYCoord = js.native
}
object ClientOffset {
  
  @scala.inline
  def apply(clientOffset: XYCoord, sourceClientOffset: XYCoord): ClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOffset]
  }
  
  @scala.inline
  implicit class ClientOffsetOps[Self <: ClientOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClientOffset(value: XYCoord): Self = this.set("sourceClientOffset", value.asInstanceOf[js.Any])
  }
}
