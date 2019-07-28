package typings.gapiDotClientDotBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfLinkString extends js.Object {
  /** The URL of the Blogs for this user. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Anon_SelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): Anon_SelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Anon_SelfLinkString]
  }
}

