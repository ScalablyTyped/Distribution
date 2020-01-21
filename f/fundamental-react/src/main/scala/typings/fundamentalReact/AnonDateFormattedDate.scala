package typings.fundamentalReact

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateFormattedDate extends js.Object {
  var date: Date
  var formattedDate: String
}

object AnonDateFormattedDate {
  @scala.inline
  def apply(date: Date, formattedDate: String): AnonDateFormattedDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], formattedDate = formattedDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateFormattedDate]
  }
}

