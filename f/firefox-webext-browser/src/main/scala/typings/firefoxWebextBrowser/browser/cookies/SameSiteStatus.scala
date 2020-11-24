package typings.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cookies types */
/**
  * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies). 'no_restriction' corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax', and 'strict' to 'SameSite=Strict'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict
*/
trait SameSiteStatus extends js.Object
object SameSiteStatus {
  
  @scala.inline
  def lax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax = "lax".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax]
  
  @scala.inline
  def no_restriction: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction = "no_restriction".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction]
  
  @scala.inline
  def strict: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict = "strict".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict]
}
