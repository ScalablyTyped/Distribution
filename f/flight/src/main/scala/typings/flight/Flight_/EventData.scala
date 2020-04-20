package typings.flight.Flight_

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var el: HTMLElement
}

object EventData {
  @scala.inline
  def apply(el: HTMLElement): EventData = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

