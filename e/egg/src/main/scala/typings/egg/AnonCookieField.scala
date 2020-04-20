package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookieField extends js.Object {
  /**
    * The locale value key in the cookie, default is locale.
    */
  var cookieField: String
  /**
    * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
    */
  var cookieMaxAge: String | Double
  /**
    * default value EN_US
    */
  var defaultLocale: String
  /**
    * i18n resource file dir, not recommend to change default value
    */
  var dir: String
  /**
    * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
    */
  var queryField: String
}

object AnonCookieField {
  @scala.inline
  def apply(
    cookieField: String,
    cookieMaxAge: String | Double,
    defaultLocale: String,
    dir: String,
    queryField: String
  ): AnonCookieField = {
    val __obj = js.Dynamic.literal(cookieField = cookieField.asInstanceOf[js.Any], cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], queryField = queryField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCookieField]
  }
}

