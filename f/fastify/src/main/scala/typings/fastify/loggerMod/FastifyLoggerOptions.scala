package typings.fastify.loggerMod

import typings.fastify.anon.Err
import typings.fastify.requestMod.FastifyRequest
import typings.fastify.requestMod.RequestGenericInterface
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyLoggerOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends js.Object {
  
  var genReqId: js.UndefOr[
    js.Function1[/* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest], String]
  ] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
  
  var serializers: js.UndefOr[Err[RawRequest, RawReply, RawServer]] = js.native
}
object FastifyLoggerOptions {
  
  @scala.inline
  def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */](): FastifyLoggerOptions[RawServer, RawRequest, RawReply] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyLoggerOptions[RawServer, RawRequest, RawReply]]
  }
  
  @scala.inline
  implicit class FastifyLoggerOptionsOps[Self <: FastifyLoggerOptions[_, _, _], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] (val x: Self with (FastifyLoggerOptions[RawServer, RawRequest, RawReply])) extends AnyVal {
    
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
    def setGenReqId(value: /* req */ FastifyRequest[RequestGenericInterface, RawServer, RawRequest] => String): Self = this.set("genReqId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenReqId: Self = this.set("genReqId", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean | PrettyOptions): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setSerializers(value: Err[RawRequest, RawReply, RawServer]): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
  }
}
