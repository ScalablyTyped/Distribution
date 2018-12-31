package typings
package excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFormatter extends js.Object {
  /**
  	 * Defines locales
  	 * @param  locales
  	 */
  def defineLocales(
    locales: js.Array[
      excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod.DataFormatterNs.LocalesOptions
    ]
  ): scala.Unit = js.native
  /**
  	 * Format a value
  	 * @param value
  	 * @param type value type
  	 * @param format format preset
  	 */
  def format(value: js.Any, `type`: java.lang.String, format: java.lang.String): excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod.DataFormatterNs.FormatResult = js.native
  /**
  	 * Sets locale
  	 * If locale doesn't exist, sets default
  	 * @param locale
  	 */
  def setLocale(locale: java.lang.String): scala.Unit = js.native
  def setUTCOffset(): scala.Unit = js.native
  /**
  	 * Sets UTC offset for dates
  	 * @param offset in minutes
  	 */
  def setUTCOffset(offset: scala.Double): scala.Unit = js.native
}

