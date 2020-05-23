package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: Oauthtoken): Request[Pageviews]
}

object PageViewsResource {
  @scala.inline
  def apply(get: Oauthtoken => Request[Pageviews]): PageViewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PageViewsResource]
  }
}

