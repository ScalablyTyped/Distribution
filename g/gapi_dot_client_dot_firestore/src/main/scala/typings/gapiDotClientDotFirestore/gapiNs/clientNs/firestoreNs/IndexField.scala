package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexField extends js.Object {
  /**
    * The path of the field. Must match the field path specification described
    * by google.firestore.v1beta1.Document.fields.
    * Special field path `__name__` may be used by itself or at the end of a
    * path. `__type__` may be used only at the end of path.
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  /** The field's mode. */
  var mode: js.UndefOr[String] = js.undefined
}

object IndexField {
  @scala.inline
  def apply(fieldPath: String = null, mode: String = null): IndexField = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[IndexField]
  }
}

