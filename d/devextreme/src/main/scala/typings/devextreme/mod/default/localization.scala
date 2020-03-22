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
  /** Converts a Date object to a string using the specified format. */
  def formatDate(value: Date, format: format): String = js.native
  /** Substitutes the provided value(s) for placeholders in a message that the key specifies. */
  def formatMessage(key: String, value: String): String = js.native
  def formatMessage(key: String, value: js.Array[String]): String = js.native
  /** Converts a numeric value to a string using the specified format. */
  def formatNumber(value: Double, format: format): String = js.native
  /** Loads localized messages. */
  def loadMessages(messages: js.Any): Unit = js.native
  /** Gets the current locale identifier. */
  def locale(): String = js.native
  /** Sets the current locale identifier. */
  def locale(locale: String): Unit = js.native
  /** Parses a string into a Date object. */
  def parseDate(text: String, format: format): Date = js.native
  /** Parses a string into a numeric value. */
  def parseNumber(text: String, format: format): Double = js.native
}

