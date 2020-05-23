package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: js.UndefOr[js.Any] = js.undefined
  var unchecked: js.UndefOr[js.Any] = js.undefined
}

object Checked {
  @scala.inline
  def apply(checked: js.Any = null, unchecked: js.Any = null): Checked = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

