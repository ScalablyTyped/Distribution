package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/subscribe-replier", JSImport.Namespace)
@js.native
object subscribeReplierMod extends js.Object {
  def subscribeReplier(fn: FramebusSubscribeHandler, origin: String): String = js.native
}

