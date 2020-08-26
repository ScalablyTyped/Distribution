package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nLanguagesResource extends js.Object {
  /** Returns a list of application languages that the YouTube website supports. */
  def list(request: UserIp): Request[I18nLanguageListResponse] = js.native
}

object I18nLanguagesResource {
  @scala.inline
  def apply(list: UserIp => Request[I18nLanguageListResponse]): I18nLanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[I18nLanguagesResource]
  }
  @scala.inline
  implicit class I18nLanguagesResourceOps[Self <: I18nLanguagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: UserIp => Request[I18nLanguageListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

