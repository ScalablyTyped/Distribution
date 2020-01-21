package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.FieldTransformSetToServerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTransform extends js.Object {
  var appendMissingElements: js.UndefOr[ArrayValue] = js.undefined
  var fieldPath: js.UndefOr[String] = js.undefined
  var increment: js.UndefOr[Value] = js.undefined
  var removeAllFromArray: js.UndefOr[ArrayValue] = js.undefined
  var setToServerValue: js.UndefOr[FieldTransformSetToServerValue] = js.undefined
}

object FieldTransform {
  @scala.inline
  def apply(
    appendMissingElements: ArrayValue = null,
    fieldPath: String = null,
    increment: Value = null,
    removeAllFromArray: ArrayValue = null,
    setToServerValue: FieldTransformSetToServerValue = null
  ): FieldTransform = {
    val __obj = js.Dynamic.literal()
    if (appendMissingElements != null) __obj.updateDynamic("appendMissingElements")(appendMissingElements.asInstanceOf[js.Any])
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (removeAllFromArray != null) __obj.updateDynamic("removeAllFromArray")(removeAllFromArray.asInstanceOf[js.Any])
    if (setToServerValue != null) __obj.updateDynamic("setToServerValue")(setToServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTransform]
  }
}

