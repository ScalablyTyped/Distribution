package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddedRemoved extends js.Object {
  var added: js.UndefOr[js.Array[String]] = js.undefined
  var removed: js.UndefOr[js.Array[String]] = js.undefined
}

object AddedRemoved {
  @scala.inline
  def apply(added: js.Array[String] = null, removed: js.Array[String] = null): AddedRemoved = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedRemoved]
  }
}

