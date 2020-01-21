package typings.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cookies types */
/**
  * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies). 'no_restriction'
  * corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax', and 'strict' to
  * 'SameSite=Strict'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict
*/
trait SameSiteStatus extends js.Object

object SameSiteStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax = this.cast("lax")
  @scala.inline
  def no_restriction: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction = this.cast("no_restriction")
  @scala.inline
  def strict: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict = this.cast("strict")
}

