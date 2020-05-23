package typings.firebaseFirestore.anon

import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Removed extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}

object Removed {
  @scala.inline
  def apply(added: js.Array[Document] = null, removed: js.Array[Document] = null): Removed = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
}

