package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHAR extends js.Object {
  /**
    * Fired when the inspected window navigates to a new page.
    * @param url URL of the new page.
    */
  val onNavigated: WebExtEvent[js.Function1[/* url */ java.lang.String, scala.Unit]]
  /* devtools.network events */
  /**
    * Fired when a network request is finished and all request data are available.
    * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
    */
  val onRequestFinished: WebExtEvent[
    js.Function1[
      /* request */ firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs.Request, 
      scala.Unit
    ]
  ]
  /* devtools.network functions */
  /** Returns HAR log that contains all known network requests. */
  def getHAR(): js.Promise[_]
}

object Anon_GetHAR {
  @scala.inline
  def apply(
    getHAR: js.Function0[js.Promise[_]],
    onNavigated: WebExtEvent[js.Function1[/* url */ java.lang.String, scala.Unit]],
    onRequestFinished: WebExtEvent[
      js.Function1[
        /* request */ firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs.Request, 
        scala.Unit
      ]
    ]
  ): Anon_GetHAR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHAR")(getHAR)
    __obj.updateDynamic("onNavigated")(onNavigated)
    __obj.updateDynamic("onRequestFinished")(onRequestFinished)
    __obj.asInstanceOf[Anon_GetHAR]
  }
}

