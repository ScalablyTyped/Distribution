package typings
package gapiDotClientDotWebfontsLib.gapiNs.clientNs.webfontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: gapiDotClientDotWebfontsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[WebfontList]
}

object WebfontsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotWebfontsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[WebfontList]
  ): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[WebfontsResource]
  }
}

