package typings.fecha.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fecha", "parse")
@js.native
object parse extends js.Object {
  /**
    * Parse a date string into a Javascript Date object /
    * @method parse
    * @param {string} dateStr Date string
    * @param {string} format Date parse format
    * @param {i18n} I18nSettingsOptional Full or subset of I18N settings
    * @returns {Date|null} Returns Date object. Returns null what date string is invalid or doesn't match format
    */
  def apply(dateStr: String, format: String): Date | Null = js.native
  def apply(dateStr: String, format: String, i18n: I18nSettingsOptional): Date | Null = js.native
}

