package typings.framebus

import typings.framebus.framebusBooleans.`false`
import typings.framebus.typesMod.FramebusPayload
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/unpack-payload", JSImport.Namespace)
@js.native
object unpackPayloadMod extends js.Object {
  def unpackPayload(e: MessageEvent): FramebusPayload | `false` = js.native
}

