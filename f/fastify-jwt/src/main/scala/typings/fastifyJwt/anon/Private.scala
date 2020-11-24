package typings.fastifyJwt.anon

import typings.fastifyJwt.mod.Secret
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Private extends js.Object {
  
  var `private`: Secret = js.native
  
  var public: Secret = js.native
}
object Private {
  
  @scala.inline
  def apply(`private`: Secret, public: Secret): Private = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
  
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    
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
    def setPrivateFunction3(
      value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("private", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrivate(value: Secret): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicFunction3(
      value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("public", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPublic(value: Secret): Self = this.set("public", value.asInstanceOf[js.Any])
  }
}
