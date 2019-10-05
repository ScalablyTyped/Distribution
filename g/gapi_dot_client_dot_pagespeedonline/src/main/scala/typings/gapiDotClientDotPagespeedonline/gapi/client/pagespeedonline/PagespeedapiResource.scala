package typings.gapiDotClientDotPagespeedonline.gapi.client.pagespeedonline

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPagespeedonline.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: Anon_Alt): Request[Result]
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: Anon_Alt => Request[Result]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
  
    __obj.asInstanceOf[PagespeedapiResource]
  }
}

