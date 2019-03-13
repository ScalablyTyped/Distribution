package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieField extends js.Object {
  /**
    * The locale value key in the cookie, default is locale.
    */
  var cookieField: java.lang.String
  /**
    * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
    */
  var cookieMaxAge: java.lang.String | scala.Double
  /**
    * default value EN_US
    */
  var defaultLocale: java.lang.String
  /**
    * i18n resource file dir, not recommend to change default value
    */
  var dir: java.lang.String
  /**
    * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
    */
  var queryField: java.lang.String
}

object Anon_CookieField {
  @scala.inline
  def apply(
    cookieField: java.lang.String,
    cookieMaxAge: java.lang.String | scala.Double,
    defaultLocale: java.lang.String,
    dir: java.lang.String,
    queryField: java.lang.String
  ): Anon_CookieField = {
    val __obj = js.Dynamic.literal(cookieField = cookieField, cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale, dir = dir, queryField = queryField)
  
    __obj.asInstanceOf[Anon_CookieField]
  }
}

