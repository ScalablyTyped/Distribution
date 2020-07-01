package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalItems extends js.Object {
  var selfLink: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[String] = js.native
}

object TotalItems {
  @scala.inline
  def apply(selfLink: String = null, totalItems: String = null): TotalItems = {
    val __obj = js.Dynamic.literal()
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalItems]
  }
}

