package typings.gapiDotClientDotPartners.gapi.client.partners

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMessagesResource extends js.Object {
  /**
    * Logs a generic message from the client, such as
    * `Failed to render component`, `Profile page is running slow`,
    * `More than 500 users have accessed this result.`, etc.
    */
  def log(request: Anon_AccesstokenAlt): Request[LogMessageResponse]
}

object ClientMessagesResource {
  @scala.inline
  def apply(log: Anon_AccesstokenAlt => Request[LogMessageResponse]): ClientMessagesResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ClientMessagesResource]
  }
}

