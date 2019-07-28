package typings.domDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: String
  var duration: String
  var end: String
  var property: String
  var timing: String
  var transform: String
}

object Anon_Delay {
  @scala.inline
  def apply(delay: String, duration: String, end: String, property: String, timing: String, transform: String): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, end = end, property = property, timing = timing, transform = transform)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

