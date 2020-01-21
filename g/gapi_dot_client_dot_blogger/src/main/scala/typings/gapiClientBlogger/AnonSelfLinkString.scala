package typings.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelfLinkString extends js.Object {
  /** The URL of the Blogs for this user. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object AnonSelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): AnonSelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfLinkString]
  }
}

