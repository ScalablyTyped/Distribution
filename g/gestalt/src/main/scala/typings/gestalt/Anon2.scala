package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var event: SyntheticEvent[HTMLVideoElement, Event_]
}

object Anon2 {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLVideoElement, Event_]): Anon2 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2]
  }
}

