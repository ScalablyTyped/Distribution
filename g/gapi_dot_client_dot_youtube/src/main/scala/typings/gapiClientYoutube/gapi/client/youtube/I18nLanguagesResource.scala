package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguagesResource extends js.Object {
  /** Returns a list of application languages that the YouTube website supports. */
  def list(request: AnonUserIp): Request_[I18nLanguageListResponse]
}

object I18nLanguagesResource {
  @scala.inline
  def apply(list: AnonUserIp => Request_[I18nLanguageListResponse]): I18nLanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[I18nLanguagesResource]
  }
}

