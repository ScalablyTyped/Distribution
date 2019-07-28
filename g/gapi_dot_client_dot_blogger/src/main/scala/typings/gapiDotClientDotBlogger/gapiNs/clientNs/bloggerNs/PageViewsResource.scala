package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: Anon_AltBlogIdFields): Request[Pageviews]
}

object PageViewsResource {
  @scala.inline
  def apply(get: Anon_AltBlogIdFields => Request[Pageviews]): PageViewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PageViewsResource]
  }
}

