package typings.gapiClientWebfonts.gapi.client.webfonts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientWebfonts.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: AnonAlt): Request_[WebfontList]
}

object WebfontsResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[WebfontList]): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[WebfontsResource]
  }
}

