package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changes extends js.Object {
  var changes: js.UndefOr[js.Array[_]] = js.undefined
}

object Changes {
  @scala.inline
  def apply(changes: js.Array[_] = null): Changes = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
}

