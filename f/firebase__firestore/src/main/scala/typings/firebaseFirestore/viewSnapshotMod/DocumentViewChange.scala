package typings.firebaseFirestore.viewSnapshotMod

import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentViewChange extends js.Object {
  var doc: Document
  var `type`: ChangeType
}

object DocumentViewChange {
  @scala.inline
  def apply(doc: Document, `type`: ChangeType): DocumentViewChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewChange]
  }
}

