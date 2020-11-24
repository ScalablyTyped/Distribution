package typings.fastifyAccepts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyAcceptsOptions extends js.Object {
  
  var decorateReplyToo: js.UndefOr[Boolean] = js.native
}
object FastifyAcceptsOptions {
  
  @scala.inline
  def apply(): FastifyAcceptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyAcceptsOptions]
  }
  
  @scala.inline
  implicit class FastifyAcceptsOptionsOps[Self <: FastifyAcceptsOptions] (val x: Self) extends AnyVal {
    
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
    def setDecorateReplyToo(value: Boolean): Self = this.set("decorateReplyToo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorateReplyToo: Self = this.set("decorateReplyToo", js.undefined)
  }
}
