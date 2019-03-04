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
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, end = end, property = property, timing = timing, transform = transform)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

