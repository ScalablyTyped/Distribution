package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nRegionsResource extends js.Object {
  /** Returns a list of content regions that the YouTube website supports. */
  def list(request: UserIp): Request[I18nRegionListResponse] = js.native
}

object I18nRegionsResource {
  @scala.inline
  def apply(list: UserIp => Request[I18nRegionListResponse]): I18nRegionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[I18nRegionsResource]
  }
  @scala.inline
  implicit class I18nRegionsResourceOps[Self <: I18nRegionsResource] (val x: Self) extends AnyVal {
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
    def setList(value: UserIp => Request[I18nRegionListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

