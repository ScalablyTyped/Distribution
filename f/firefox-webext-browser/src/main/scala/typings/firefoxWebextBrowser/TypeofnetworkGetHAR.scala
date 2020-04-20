package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.devtools.network.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnetworkGetHAR extends js.Object {
  /**
    * Fired when the inspected window navigates to a new page.
    * @param url URL of the new page.
    */
  val onNavigated: WebExtEvent[js.Function1[/* url */ String, Unit]]
  /* devtools.network events */
  /**
    * Fired when a network request is finished and all request data are available.
    * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
    */
  val onRequestFinished: WebExtEvent[js.Function1[/* request */ Request, Unit]]
  /* devtools.network functions */
  /** Returns HAR log that contains all known network requests. */
  def getHAR(): js.Promise[StringDictionary[_]]
}

object TypeofnetworkGetHAR {
  @scala.inline
  def apply(
    getHAR: () => js.Promise[StringDictionary[_]],
    onNavigated: WebExtEvent[js.Function1[/* url */ String, Unit]],
    onRequestFinished: WebExtEvent[js.Function1[/* request */ Request, Unit]]
  ): TypeofnetworkGetHAR = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction0(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnetworkGetHAR]
  }
}

