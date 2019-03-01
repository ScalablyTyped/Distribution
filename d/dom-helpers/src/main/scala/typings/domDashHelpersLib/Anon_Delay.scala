package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: java.lang.String
  var duration: java.lang.String
  var end: java.lang.String
  var property: java.lang.String
  var timing: java.lang.String
  var transform: java.lang.String
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: java.lang.String,
    duration: java.lang.String,
    end: java.lang.String,
    property: java.lang.String,
    timing: java.lang.String,
    transform: java.lang.String
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("timing")(timing)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Delay]
  }
}

