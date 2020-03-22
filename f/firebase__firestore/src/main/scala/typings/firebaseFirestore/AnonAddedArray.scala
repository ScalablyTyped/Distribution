package typings.firebaseFirestore

import typings.firebaseFirestore.modelDocumentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddedArray extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}

object AnonAddedArray {
  @scala.inline
  def apply(added: js.Array[Document] = null, removed: js.Array[Document] = null): AnonAddedArray = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddedArray]
  }
}

