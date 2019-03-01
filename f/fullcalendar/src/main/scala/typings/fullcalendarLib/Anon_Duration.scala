package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.Any
  var unit: js.Any
  var unzonedRange: js.Any
}

object Anon_Duration {
  @scala.inline
  def apply(duration: js.Any, unit: js.Any, unzonedRange: js.Any): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("unit")(unit)
    __obj.updateDynamic("unzonedRange")(unzonedRange)
    __obj.asInstanceOf[Anon_Duration]
  }
}

