package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactNumbers.`0`
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHour extends js.Object {
  var hour: String
  var meridiem: `0` | `1`
  var minute: String
  var second: String
}

object AnonHour {
  @scala.inline
  def apply(hour: String, meridiem: `0` | `1`, minute: String, second: String): AnonHour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHour]
  }
}

