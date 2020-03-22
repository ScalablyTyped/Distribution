package typings.fecha.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fecha", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultI18n: I18nSettings = js.native
  @JSName("parse")
  var parse_Original: js.Function3[
    /* dateStr */ String, 
    /* format */ String, 
    /* i18n */ js.UndefOr[I18nSettingsOptional], 
    Date | Null
  ] = js.native
  def format(dateObj: Date): String = js.native
  def format(dateObj: Date, mask: String): String = js.native
  def format(dateObj: Date, mask: String, i18n: I18nSettingsOptional): String = js.native
  def parse(dateStr: String, format: String): Date | Null = js.native
  def parse(dateStr: String, format: String, i18n: I18nSettingsOptional): Date | Null = js.native
  def setGlobalDateI18n(i18n: I18nSettingsOptional): I18nSettings = js.native
  def setGlobalDateMasks(masks: StringDictionary[String]): StringDictionary[String] = js.native
}

