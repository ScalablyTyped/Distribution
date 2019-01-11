package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs

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
  val onNavigated: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.native
  /* devtools.network events */
  /**
    * Fired when a network request is finished and all request data are available.
    * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
    */
  val onRequestFinished: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* request */ firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs.Request, 
      scala.Unit
    ]
  ] = js.native
  /* devtools.network functions */
  /** Returns HAR log that contains all known network requests. */
  def getHAR(): js.Promise[_] = js.native
}

