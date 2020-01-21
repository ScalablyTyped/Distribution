package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelfLinkString extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
}

object AnonSelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): AnonSelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfLinkString]
  }
}

