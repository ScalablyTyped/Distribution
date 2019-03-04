package typings
package gapiDotClientDotPagespeedonlineLib.gapiNs.clientNs.pagespeedonlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: gapiDotClientDotPagespeedonlineLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Result]
}

object PagespeedapiResource {
  @scala.inline
  def apply(
    runpagespeed: js.Function1[
      gapiDotClientDotPagespeedonlineLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Result]
    ]
  ): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = runpagespeed)
  
    __obj.asInstanceOf[PagespeedapiResource]
  }
}

