package typings.fastify.replyMod

import typings.fastify.utilsMod.ReplyDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyGenericInterface extends js.Object {
  
  var Reply: js.UndefOr[ReplyDefault] = js.native
}
object ReplyGenericInterface {
  
  @scala.inline
  def apply(): ReplyGenericInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyGenericInterface]
  }
  
  @scala.inline
  implicit class ReplyGenericInterfaceOps[Self <: ReplyGenericInterface] (val x: Self) extends AnyVal {
    
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
    def setReply(value: ReplyDefault): Self = this.set("Reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply: Self = this.set("Reply", js.undefined)
  }
}
