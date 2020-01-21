package typings.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gettext extends js.Object {
  def __(msgid: String, args: js.Any*): String = js.native
  def _n(msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
  def _p(msgctxt: String, msgid: String, args: js.Any*): String = js.native
  def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
  def getLocale(): String = js.native
  def gettext(msgid: String, args: js.Any*): String = js.native
  def loadJSON(jsonData: JsonData): Gettext = js.native
  def loadJSON(jsonData: JsonData, domain: String): Gettext = js.native
  def ngettext(msgid: String, msgid_plural: String, n: Double, args: js.Any*): String = js.native
  def pgettext(msgctxt: String, msgid: String, args: js.Any*): String = js.native
  def setLocale(locale: String): Gettext = js.native
  def setMessages(domain: String, locale: String, messages: JsonDataMessages): Gettext = js.native
  def setMessages(domain: String, locale: String, messages: JsonDataMessages, plural_forms: PluralForm): Gettext = js.native
  def textdomain(): Gettext | String = js.native
  def textdomain(domain: String): Gettext | String = js.native
}

