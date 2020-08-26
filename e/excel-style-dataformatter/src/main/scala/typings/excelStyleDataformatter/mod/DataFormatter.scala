package typings.excelStyleDataformatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFormatter extends js.Object {
  /**
    * Defines locales
    * @param  locales
    */
  def defineLocales(locales: js.Array[LocalesOptions]): Unit = js.native
  /**
    * Format a value
    * @param value
    * @param type value type
    * @param format format preset
    */
  def format(value: js.Any, `type`: String, format: String): FormatResult = js.native
  /**
    * Sets locale
    * If locale doesn't exist, sets default
    * @param locale
    */
  def setLocale(locale: String): Unit = js.native
  /**
    * Sets UTC offset for dates
    * @param offset in minutes
    */
  def setUTCOffset(): Unit = js.native
  def setUTCOffset(offset: Double): Unit = js.native
}

