package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var el: stdLib.HTMLElement
}

object EventData {
  @scala.inline
  def apply(el: stdLib.HTMLElement): EventData = {
    val __obj = js.Dynamic.literal(el = el)
  
    __obj.asInstanceOf[EventData]
  }
}

