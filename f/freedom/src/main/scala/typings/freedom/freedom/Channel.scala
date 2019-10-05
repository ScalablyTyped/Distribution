package typings.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Channels are ways that freedom modules can send each other messages.
@js.native
trait Channel
  extends OnAndEmit[js.Any, js.Any] {
  def close(): Unit = js.native
}

