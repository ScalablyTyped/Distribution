package typings.firefoxDashWebextDashBrowser.browser.identity

import typings.firefoxDashWebextDashBrowser.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.identity.getProfileUserInfo")
@js.native
object getProfileUserInfo extends js.Object {
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[Anon_Email] = js.native
}

