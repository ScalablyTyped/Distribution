package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Pageviews]
}

object PageViewsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Pageviews]
    ]
  ): PageViewsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[PageViewsResource]
  }
}

