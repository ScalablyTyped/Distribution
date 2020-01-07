package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SelfLinkTotalItems extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[String] = js.native
}

object Anon_SelfLinkTotalItems {
  @scala.inline
  def apply(selfLink: String = null, totalItems: String = null): Anon_SelfLinkTotalItems = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelfLinkTotalItems]
  }
}

