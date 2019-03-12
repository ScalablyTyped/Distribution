package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguagesResource extends js.Object {
  /** Returns a list of application languages that the YouTube website supports. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey): gapiDotClientLib.gapiNs.clientNs.Request[I18nLanguageListResponse]
}

object I18nLanguagesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey => gapiDotClientLib.gapiNs.clientNs.Request[I18nLanguageListResponse]
  ): I18nLanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[I18nLanguagesResource]
  }
}

