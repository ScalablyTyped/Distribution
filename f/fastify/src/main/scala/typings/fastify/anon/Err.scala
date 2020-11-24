package typings.fastify.anon

import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastifyError.mod.FastifyError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Err[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */] extends js.Object {
  
  var err: js.UndefOr[js.Function1[/* err */ FastifyError, Message]] = js.native
  
  var req: js.UndefOr[js.Function1[/* req */ RawRequest, Dictkey]] = js.native
  
  var res: js.UndefOr[js.Function1[/* res */ RawReply, StatusCode]] = js.native
}
object Err {
  
  @scala.inline
  def apply[RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */](): Err[RawRequest, RawReply, RawServer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Err[RawRequest, RawReply, RawServer]]
  }
  
  @scala.inline
  implicit class ErrOps[Self <: Err[_, _, _], RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RawServer /* <: RawServerBase */] (val x: Self with (Err[RawRequest, RawReply, RawServer])) extends AnyVal {
    
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
    def setErr(value: /* err */ FastifyError => Message): Self = this.set("err", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setReq(value: /* req */ RawRequest => Dictkey): Self = this.set("req", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setRes(value: /* res */ RawReply => StatusCode): Self = this.set("res", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
  }
}
