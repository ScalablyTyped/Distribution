package typings.fecha.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fecha", "format")
@js.native
object format extends js.Object {
  /***
    * Format a date
    * @method format
    * @param {Date|number} dateObj
    * @param {string} mask Format of the date, i.e. 'mm-dd-yy' or 'shortDate'
    * @returns {string} Formatted date string
    */
  def apply(dateObj: Date): String = js.native
  def apply(dateObj: Date, mask: String): String = js.native
  def apply(dateObj: Date, mask: String, i18n: I18nSettingsOptional): String = js.native
}

