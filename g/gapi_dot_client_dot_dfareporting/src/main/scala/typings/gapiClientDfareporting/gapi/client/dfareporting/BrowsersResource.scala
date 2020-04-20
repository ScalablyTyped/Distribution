package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersResource extends js.Object {
  /** Retrieves a list of browsers. */
  def list(request: AnonKey): Request_[BrowsersListResponse]
}

object BrowsersResource {
  @scala.inline
  def apply(list: AnonKey => Request_[BrowsersListResponse]): BrowsersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BrowsersResource]
  }
}

