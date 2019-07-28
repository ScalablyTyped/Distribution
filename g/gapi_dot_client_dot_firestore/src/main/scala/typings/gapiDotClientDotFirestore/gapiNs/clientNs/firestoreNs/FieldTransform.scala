package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTransform extends js.Object {
  /**
    * The path of the field. See Document.fields for the field path syntax
    * reference.
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  /** Sets the field to the given server value. */
  var setToServerValue: js.UndefOr[String] = js.undefined
}

object FieldTransform {
  @scala.inline
  def apply(fieldPath: String = null, setToServerValue: String = null): FieldTransform = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath)
    if (setToServerValue != null) __obj.updateDynamic("setToServerValue")(setToServerValue)
    __obj.asInstanceOf[FieldTransform]
  }
}

