package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddedRemovedArray extends js.Object {
  var added: js.UndefOr[js.Array[String]] = js.undefined
  var removed: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_AddedRemovedArray {
  @scala.inline
  def apply(added: js.Array[String] = null, removed: js.Array[String] = null): Anon_AddedRemovedArray = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddedRemovedArray]
  }
}

