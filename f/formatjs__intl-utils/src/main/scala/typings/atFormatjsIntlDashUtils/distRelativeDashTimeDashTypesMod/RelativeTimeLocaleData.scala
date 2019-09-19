package typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeLocaleData extends js.Object {
  var fields: LocaleFieldsData
  var locale: String
}

object RelativeTimeLocaleData {
  @scala.inline
  def apply(fields: LocaleFieldsData, locale: String): RelativeTimeLocaleData = {
    val __obj = js.Dynamic.literal(fields = fields, locale = locale)
  
    __obj.asInstanceOf[RelativeTimeLocaleData]
  }
}

