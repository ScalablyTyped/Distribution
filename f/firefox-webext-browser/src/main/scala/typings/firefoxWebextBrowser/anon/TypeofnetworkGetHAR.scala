package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.devtools.network.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnetworkGetHAR extends js.Object {
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
  @scala.inline
  implicit class TypeofnetworkGetHAROps[Self <: TypeofnetworkGetHAR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetHAR(value: () => js.Promise[StringDictionary[_]]): Self = this.set("getHAR", js.Any.fromFunction0(value))
    @scala.inline
    def setOnNavigated(value: WebExtEvent[js.Function1[/* url */ String, Unit]]): Self = this.set("onNavigated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequestFinished(value: WebExtEvent[js.Function1[/* request */ Request, Unit]]): Self = this.set("onRequestFinished", value.asInstanceOf[js.Any])
  }
  
}

