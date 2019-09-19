package typings.atFormatjsIntlDashRelativetimeformat.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var fields: js.UndefOr[LocaleFieldsData] = js.undefined
  var locale: String
}

object LocaleData {
  @scala.inline
  def apply(locale: String, fields: LocaleFieldsData = null): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[LocaleData]
  }
}

