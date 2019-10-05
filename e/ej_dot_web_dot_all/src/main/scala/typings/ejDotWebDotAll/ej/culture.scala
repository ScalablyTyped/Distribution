package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait culture extends js.Object {
  var calendars: js.UndefOr[calendarsSettings] = js.undefined
  var englishName: js.UndefOr[String] = js.undefined
  var isRTL: Boolean
  var language: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namtiveName: js.UndefOr[String] = js.undefined
  var numberFormat: js.UndefOr[formatSettings] = js.undefined
}

object culture {
  @scala.inline
  def apply(
    isRTL: Boolean,
    calendars: calendarsSettings = null,
    englishName: String = null,
    language: String = null,
    name: String = null,
    namtiveName: String = null,
    numberFormat: formatSettings = null
  ): culture = {
    val __obj = js.Dynamic.literal(isRTL = isRTL)
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (englishName != null) __obj.updateDynamic("englishName")(englishName)
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namtiveName != null) __obj.updateDynamic("namtiveName")(namtiveName)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[culture]
  }
}

