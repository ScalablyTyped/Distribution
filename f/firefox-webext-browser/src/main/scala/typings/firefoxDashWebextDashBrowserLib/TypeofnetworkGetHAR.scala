package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnetworkGetHAR extends js.Object {
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

object TypeofnetworkGetHAR {
  @scala.inline
  def apply(
    getHAR: () => js.Promise[_],
    onNavigated: WebExtEvent[js.Function1[/* url */ java.lang.String, scala.Unit]],
    onRequestFinished: WebExtEvent[
      js.Function1[
        /* request */ firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.networkNs.Request, 
        scala.Unit
      ]
    ]
  ): TypeofnetworkGetHAR = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction0(getHAR), onNavigated = onNavigated, onRequestFinished = onRequestFinished)
  
    __obj.asInstanceOf[TypeofnetworkGetHAR]
  }
}

