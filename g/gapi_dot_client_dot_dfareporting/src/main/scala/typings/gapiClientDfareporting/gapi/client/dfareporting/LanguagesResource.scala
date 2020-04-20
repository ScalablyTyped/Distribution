package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /** Retrieves a list of languages. */
  def list(request: AnonKey): Request_[LanguagesListResponse]
}

object LanguagesResource {
  @scala.inline
  def apply(list: AnonKey => Request_[LanguagesListResponse]): LanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LanguagesResource]
  }
}

