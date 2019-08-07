package typings.atFormatjsIntlDashRelativetimeformat.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var fields: js.UndefOr[LocaleFieldsData] = js.undefined
  var locale: String
  var parentLocale: js.UndefOr[String] = js.undefined
}

object LocaleData {
  @scala.inline
  def apply(locale: String, fields: LocaleFieldsData = null, parentLocale: String = null): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (parentLocale != null) __obj.updateDynamic("parentLocale")(parentLocale)
    __obj.asInstanceOf[LocaleData]
  }
}

