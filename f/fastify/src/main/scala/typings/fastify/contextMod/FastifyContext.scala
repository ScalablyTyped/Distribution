package typings.fastify.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyContext[ContextConfig] extends js.Object {
  
  var config: ContextConfig = js.native
}
object FastifyContext {
  
  @scala.inline
  def apply[ContextConfig](config: ContextConfig): FastifyContext[ContextConfig] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyContext[ContextConfig]]
  }
  
  @scala.inline
  implicit class FastifyContextOps[Self <: FastifyContext[_], ContextConfig] (val x: Self with FastifyContext[ContextConfig]) extends AnyVal {
    
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
    def setConfig(value: ContextConfig): Self = this.set("config", value.asInstanceOf[js.Any])
  }
}
