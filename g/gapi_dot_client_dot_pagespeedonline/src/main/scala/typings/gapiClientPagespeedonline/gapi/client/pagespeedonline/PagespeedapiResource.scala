package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPagespeedonline.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: AnonAlt): Request_[Result]
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: AnonAlt => Request_[Result]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
  
    __obj.asInstanceOf[PagespeedapiResource]
  }
}

