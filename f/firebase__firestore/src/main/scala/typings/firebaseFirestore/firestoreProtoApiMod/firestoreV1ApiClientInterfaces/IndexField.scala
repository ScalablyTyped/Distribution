package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.IndexFieldMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexField extends js.Object {
  var fieldPath: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[IndexFieldMode] = js.undefined
}

object IndexField {
  @scala.inline
  def apply(fieldPath: String = null, mode: IndexFieldMode = null): IndexField = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
}

