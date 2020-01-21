package typings.flatpickr.minMaxTimePluginMod

import typings.flatpickr.globalsMod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var defaults: MinMaxTime
  var tableDateFormat: String
  def formatDate(date: Date, f: String): String
}

object State {
  @scala.inline
  def apply(defaults: MinMaxTime, formatDate: (Date, String) => String, tableDateFormat: String): State = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatDate = js.Any.fromFunction2(formatDate), tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

