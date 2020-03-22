package typings.firefoxWebextBrowser.browser.cookies

import typings.firefoxWebextBrowser.AnonExpirationDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.set")
@js.native
object set extends js.Object {
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def apply(details: AnonExpirationDate): js.Promise[Cookie] = js.native
}

