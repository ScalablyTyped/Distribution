package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieField extends js.Object {
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

object Anon_CookieField {
  @scala.inline
  def apply(
    cookieField: String,
    cookieMaxAge: String | Double,
    defaultLocale: String,
    dir: String,
    queryField: String
  ): Anon_CookieField = {
    val __obj = js.Dynamic.literal(cookieField = cookieField, cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale, dir = dir, queryField = queryField)
  
    __obj.asInstanceOf[Anon_CookieField]
  }
}

