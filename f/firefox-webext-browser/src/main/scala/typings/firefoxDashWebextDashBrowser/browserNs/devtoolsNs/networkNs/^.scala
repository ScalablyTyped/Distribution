package typings.firefoxDashWebextDashBrowser.browserNs.devtoolsNs.networkNs

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.network")
@js.native
object ^ extends js.Object {
  /**
    * Fired when the inspected window navigates to a new page.
    * @param url URL of the new page.
    */
  val onNavigated: WebExtEvent[js.Function1[/* url */ String, Unit]] = js.native
  /* devtools.network events */
  /**
    * Fired when a network request is finished and all request data are available.
    * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
    */
  val onRequestFinished: WebExtEvent[js.Function1[/* request */ Request, Unit]] = js.native
  /* devtools.network functions */
  /** Returns HAR log that contains all known network requests. */
  def getHAR(): js.Promise[StringDictionary[_]] = js.native
}

