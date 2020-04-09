package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "localization")
@js.native
class localization ()
  extends typings.devextreme.mod.DevExpress.localization

/* static members */
@JSImport("devextreme", "localization")
@js.native
object localization extends js.Object {
  /** @name localization.formatDate(value, format) */
  def formatDate(value: Date, format: format): String = js.native
  /** @name localization.formatMessage(key, value) */
  def formatMessage(key: String, value: String): String = js.native
  def formatMessage(key: String, value: js.Array[String]): String = js.native
  /** @name localization.formatNumber(value, format) */
  def formatNumber(value: Double, format: format): String = js.native
  /** @name localization.loadMessages(messages) */
  def loadMessages(messages: js.Any): Unit = js.native
  /** @name localization.locale() */
  def locale(): String = js.native
  /** @name localization.locale(locale) */
  def locale(locale: String): Unit = js.native
  /** @name localization.parseDate(text, format) */
  def parseDate(text: String, format: format): Date = js.native
  /** @name localization.parseNumber(text, format) */
  def parseNumber(text: String, format: format): Double = js.native
}

