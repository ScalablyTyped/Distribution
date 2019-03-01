package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait culture extends js.Object {
  var calendars: js.UndefOr[calendarsSettings] = js.undefined
  var englishName: js.UndefOr[java.lang.String] = js.undefined
  var isRTL: scala.Boolean
  var language: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namtiveName: js.UndefOr[java.lang.String] = js.undefined
  var numberFormat: js.UndefOr[formatSettings] = js.undefined
}

object culture {
  @scala.inline
  def apply(
    isRTL: scala.Boolean,
    calendars: calendarsSettings = null,
    englishName: java.lang.String = null,
    language: java.lang.String = null,
    name: java.lang.String = null,
    namtiveName: java.lang.String = null,
    numberFormat: formatSettings = null
  ): culture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRTL")(isRTL)
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (englishName != null) __obj.updateDynamic("englishName")(englishName)
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namtiveName != null) __obj.updateDynamic("namtiveName")(namtiveName)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[culture]
  }
}

