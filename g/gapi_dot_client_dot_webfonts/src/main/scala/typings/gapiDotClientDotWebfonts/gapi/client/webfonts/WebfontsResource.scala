package typings.gapiDotClientDotWebfonts.gapi.client.webfonts

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotWebfonts.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: Anon_Alt): Request[WebfontList]
}

object WebfontsResource {
  @scala.inline
  def apply(list: Anon_Alt => Request[WebfontList]): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[WebfontsResource]
  }
}

