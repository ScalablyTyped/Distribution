package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddedRemoved extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}

object Anon_AddedRemoved {
  @scala.inline
  def apply(added: js.Array[Document] = null, removed: js.Array[Document] = null): Anon_AddedRemoved = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddedRemoved]
  }
}

