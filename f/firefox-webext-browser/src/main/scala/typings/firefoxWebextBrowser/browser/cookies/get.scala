package typings.firefoxWebextBrowser.browser.cookies

import typings.firefoxWebextBrowser.AnonFirstPartyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.get")
@js.native
object get extends js.Object {
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
    * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
    * earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def apply(details: AnonFirstPartyDomain): js.Promise[Cookie] = js.native
}

