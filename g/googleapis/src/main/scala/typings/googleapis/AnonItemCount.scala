package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemCount extends js.Object {
  var itemCount: js.UndefOr[String] = js.native
  var itemType: js.UndefOr[String] = js.native
}

object AnonItemCount {
  @scala.inline
  def apply(itemCount: String = null, itemType: String = null): AnonItemCount = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemCount]
  }
}

