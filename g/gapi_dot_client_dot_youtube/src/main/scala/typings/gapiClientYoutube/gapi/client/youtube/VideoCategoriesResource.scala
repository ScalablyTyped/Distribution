package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.RegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube videos. */
  def list(request: RegionCode): Request[VideoCategoryListResponse] = js.native
}

object VideoCategoriesResource {
  @scala.inline
  def apply(list: RegionCode => Request[VideoCategoryListResponse]): VideoCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoCategoriesResource]
  }
  @scala.inline
  implicit class VideoCategoriesResourceOps[Self <: VideoCategoriesResource] (val x: Self) extends AnyVal {
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
    def setList(value: RegionCode => Request[VideoCategoryListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

