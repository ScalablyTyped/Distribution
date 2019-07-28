package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguagesResource extends js.Object {
  /** Returns a list of application languages that the YouTube website supports. */
  def list(request: Anon_AltFieldsHlKey): Request[I18nLanguageListResponse]
}

object I18nLanguagesResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHlKey => Request[I18nLanguageListResponse]): I18nLanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[I18nLanguagesResource]
  }
}

