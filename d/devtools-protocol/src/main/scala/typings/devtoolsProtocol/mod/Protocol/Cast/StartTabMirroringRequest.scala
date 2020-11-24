package typings.devtoolsProtocol.mod.Protocol.Cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTabMirroringRequest extends js.Object {
  
  var sinkName: String = js.native
}
object StartTabMirroringRequest {
  
  @scala.inline
  def apply(sinkName: String): StartTabMirroringRequest = {
    val __obj = js.Dynamic.literal(sinkName = sinkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTabMirroringRequest]
  }
  
  @scala.inline
  implicit class StartTabMirroringRequestOps[Self <: StartTabMirroringRequest] (val x: Self) extends AnyVal {
    
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
    def setSinkName(value: String): Self = this.set("sinkName", value.asInstanceOf[js.Any])
  }
}
