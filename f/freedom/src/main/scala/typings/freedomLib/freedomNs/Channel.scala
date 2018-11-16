package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Channels are ways that freedom modules can send each other messages.
@js.native
trait Channel
  extends OnAndEmit[js.Any, js.Any] {
  def close(): scala.Unit = js.native
}

