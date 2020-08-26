package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.RegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuideCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube channels. */
  def list(request: RegionCode): Request[GuideCategoryListResponse] = js.native
}

object GuideCategoriesResource {
  @scala.inline
  def apply(list: RegionCode => Request[GuideCategoryListResponse]): GuideCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GuideCategoriesResource]
  }
  @scala.inline
  implicit class GuideCategoriesResourceOps[Self <: GuideCategoriesResource] (val x: Self) extends AnyVal {
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
    def setList(value: RegionCode => Request[GuideCategoryListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

