package typings.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfLinkString extends js.Object {
  /** The URL of the Blogs for this user. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object SelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): SelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfLinkString]
  }
}

