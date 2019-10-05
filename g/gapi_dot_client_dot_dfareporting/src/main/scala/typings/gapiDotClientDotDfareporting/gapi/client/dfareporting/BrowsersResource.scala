package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersResource extends js.Object {
  /** Retrieves a list of browsers. */
  def list(request: Anon_AltFieldsKey): Request[BrowsersListResponse]
}

object BrowsersResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[BrowsersListResponse]): BrowsersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BrowsersResource]
  }
}

