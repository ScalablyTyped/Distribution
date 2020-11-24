package typings.fastify.routeMod

import typings.fastify.replyMod.ReplyGenericInterface
import typings.fastify.requestMod.RequestGenericInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteGenericInterface
  extends RequestGenericInterface
     with ReplyGenericInterface
object RouteGenericInterface {
  
  @scala.inline
  def apply(): RouteGenericInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteGenericInterface]
  }
}
