package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: Oauthtoken): Request[Pageviews] = js.native
}

object PageViewsResource {
  @scala.inline
  def apply(get: Oauthtoken => Request[Pageviews]): PageViewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PageViewsResource]
  }
  @scala.inline
  implicit class PageViewsResourceOps[Self <: PageViewsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Oauthtoken => Request[Pageviews]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

