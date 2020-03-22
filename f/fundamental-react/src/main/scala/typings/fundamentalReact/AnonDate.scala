package typings.fundamentalReact

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: Date
  var formattedDate: String
}

object AnonDate {
  @scala.inline
  def apply(date: Date, formattedDate: String): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], formattedDate = formattedDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

