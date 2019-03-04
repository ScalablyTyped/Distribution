package typings
package gettextDotJsLib.gettextDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gettext extends js.Object {
  def __(msgid: java.lang.String, args: js.Any*): java.lang.String = js.native
  def _n(msgid: java.lang.String, msgid_plural: java.lang.String, n: scala.Double, args: js.Any*): java.lang.String = js.native
  def _p(msgctxt: java.lang.String, msgid: java.lang.String, args: js.Any*): java.lang.String = js.native
  def dcnpgettext(
    domain: java.lang.String,
    msgctxt: java.lang.String,
    msgid: java.lang.String,
    msgid_plural: java.lang.String,
    n: scala.Double,
    args: js.Any*
  ): java.lang.String = js.native
  def getLocale(): java.lang.String = js.native
  def gettext(msgid: java.lang.String, args: js.Any*): java.lang.String = js.native
  def loadJSON(jsonData: JsonData): Gettext = js.native
  def loadJSON(jsonData: JsonData, domain: java.lang.String): Gettext = js.native
  def ngettext(msgid: java.lang.String, msgid_plural: java.lang.String, n: scala.Double, args: js.Any*): java.lang.String = js.native
  def pgettext(msgctxt: java.lang.String, msgid: java.lang.String, args: js.Any*): java.lang.String = js.native
  def setLocale(locale: java.lang.String): Gettext = js.native
  def setMessages(domain: java.lang.String, locale: java.lang.String, messages: JsonDataMessages): Gettext = js.native
  def setMessages(
    domain: java.lang.String,
    locale: java.lang.String,
    messages: JsonDataMessages,
    plural_forms: PluralForm
  ): Gettext = js.native
  def textdomain(): Gettext | java.lang.String = js.native
  def textdomain(domain: java.lang.String): Gettext | java.lang.String = js.native
}

