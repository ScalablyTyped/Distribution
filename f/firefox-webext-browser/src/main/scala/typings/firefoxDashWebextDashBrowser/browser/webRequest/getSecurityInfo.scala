package typings.firefoxDashWebextDashBrowser.browser.webRequest

import typings.firefoxDashWebextDashBrowser.Anon_CertificateChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webRequest.getSecurityInfo")
@js.native
object getSecurityInfo extends js.Object {
  /**
    * Retrieves the security information for the request. Returns a promise that will resolve to a SecurityInfo object.
    */
  def apply(requestId: String): js.Promise[SecurityInfo] = js.native
  def apply(requestId: String, options: Anon_CertificateChain): js.Promise[SecurityInfo] = js.native
}

