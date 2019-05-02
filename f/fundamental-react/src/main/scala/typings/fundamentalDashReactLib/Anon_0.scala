package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var hour: java.lang.String
  var meridiem: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`0` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1`
  var minute: java.lang.String
  var second: java.lang.String
}

object Anon_0 {
  @scala.inline
  def apply(
    hour: java.lang.String,
    meridiem: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`0` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1`,
    minute: java.lang.String,
    second: java.lang.String
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(hour = hour, meridiem = meridiem.asInstanceOf[js.Any], minute = minute, second = second)
  
    __obj.asInstanceOf[Anon_0]
  }
}

