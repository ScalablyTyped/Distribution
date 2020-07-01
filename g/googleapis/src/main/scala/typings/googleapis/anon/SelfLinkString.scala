package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfLinkString extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
}

object SelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): SelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfLinkString]
  }
}

