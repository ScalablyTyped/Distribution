package typings.fastifyPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fastify extends js.Object {
  
  var fastify: js.UndefOr[js.Array[String]] = js.native
  
  var reply: js.UndefOr[js.Array[String]] = js.native
  
  var request: js.UndefOr[js.Array[String]] = js.native
}
object Fastify {
  
  @scala.inline
  def apply(): Fastify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fastify]
  }
  
  @scala.inline
  implicit class FastifyOps[Self <: Fastify] (val x: Self) extends AnyVal {
    
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
    def setFastifyVarargs(value: String*): Self = this.set("fastify", js.Array(value :_*))
    
    @scala.inline
    def setFastify(value: js.Array[String]): Self = this.set("fastify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastify: Self = this.set("fastify", js.undefined)
    
    @scala.inline
    def setReplyVarargs(value: String*): Self = this.set("reply", js.Array(value :_*))
    
    @scala.inline
    def setReply(value: js.Array[String]): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
    
    @scala.inline
    def setRequestVarargs(value: String*): Self = this.set("request", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: js.Array[String]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
