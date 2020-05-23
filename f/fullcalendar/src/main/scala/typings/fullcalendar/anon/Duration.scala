package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.Any
  var unit: js.Any
  var unzonedRange: js.Any
}

object Duration {
  @scala.inline
  def apply(duration: js.Any, unit: js.Any, unzonedRange: js.Any): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unzonedRange = unzonedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

