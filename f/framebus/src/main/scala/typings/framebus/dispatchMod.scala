package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/dispatch", JSImport.Namespace)
@js.native
object dispatchMod extends js.Object {
  def dispatch(origin: String, event: String): Unit = js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg): Unit = js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): Unit = js.native
  def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: FramebusSubscribeHandler,
    e: MessageEvent
  ): Unit = js.native
}

