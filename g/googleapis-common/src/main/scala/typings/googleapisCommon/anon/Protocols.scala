package typings.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocols extends js.Object {
  
  var protocols: Simple = js.native
}
object Protocols {
  
  @scala.inline
  def apply(protocols: Simple): Protocols = {
    val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocols]
  }
  
  @scala.inline
  implicit class ProtocolsOps[Self <: Protocols] (val x: Self) extends AnyVal {
    
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
    def setProtocols(value: Simple): Self = this.set("protocols", value.asInstanceOf[js.Any])
  }
}
