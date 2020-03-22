package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChanges extends js.Object {
  var changes: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonChanges {
  @scala.inline
  def apply(changes: js.Array[_] = null): AnonChanges = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChanges]
  }
}

