package typings.gapiClientCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var label_with_op: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AnonDisplayName {
  @scala.inline
  def apply(displayName: String = null, label_with_op: String = null, name: String = null): AnonDisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (label_with_op != null) __obj.updateDynamic("label_with_op")(label_with_op.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

