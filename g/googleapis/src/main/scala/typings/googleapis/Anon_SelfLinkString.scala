package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SelfLinkString extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
}

object Anon_SelfLinkString {
  @scala.inline
  def apply(selfLink: String = null): Anon_SelfLinkString = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelfLinkString]
  }
}

