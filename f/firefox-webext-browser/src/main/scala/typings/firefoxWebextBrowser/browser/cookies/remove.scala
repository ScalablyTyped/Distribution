package typings.firefoxWebextBrowser.browser.cookies

import typings.firefoxWebextBrowser.AnonFirstPartyDomain
import typings.firefoxWebextBrowser.AnonFirstPartyDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.remove")
@js.native
object remove extends js.Object {
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def apply(details: AnonFirstPartyDomain): js.Promise[AnonFirstPartyDomainName] = js.native
}

