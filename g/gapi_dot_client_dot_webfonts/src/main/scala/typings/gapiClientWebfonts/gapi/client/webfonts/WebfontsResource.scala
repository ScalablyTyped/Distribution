package typings.gapiClientWebfonts.gapi.client.webfonts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebfonts.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: Alt): Request[WebfontList]
}

object WebfontsResource {
  @scala.inline
  def apply(list: Alt => Request[WebfontList]): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[WebfontsResource]
  }
}

