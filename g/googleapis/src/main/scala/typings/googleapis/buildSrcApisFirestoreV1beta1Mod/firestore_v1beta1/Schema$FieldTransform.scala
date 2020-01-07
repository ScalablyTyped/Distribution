package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation of a field of the document.
  */
@js.native
trait Schema$FieldTransform extends js.Object {
  /**
    * Append the given elements in order if they are not already present in the
    * current field value. If the field is not an array, or if the field does
    * not yet exist, it is first set to the empty array.  Equivalent numbers of
    * different types (e.g. 3L and 3.0) are considered equal when checking if a
    * value is missing. NaN is equal to NaN, and Null is equal to Null. If the
    * input contains multiple equivalent values, only the first will be
    * considered.  The corresponding transform_result will be the null value.
    */
  var appendMissingElements: js.UndefOr[Schema$ArrayValue] = js.native
  /**
    * The path of the field. See Document.fields for the field path syntax
    * reference.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * Adds the given value to the field&#39;s current value.  This must be an
    * integer or a double value. If the field is not an integer or double, or
    * if the field does not yet exist, the transformation will set the field to
    * the given value. If either of the given value or the current field value
    * are doubles, both values will be interpreted as doubles. Double
    * arithmetic and representation of double values follow IEEE 754 semantics.
    * If there is positive/negative integer overflow, the field is resolved to
    * the largest magnitude positive/negative integer.
    */
  var increment: js.UndefOr[Schema$Value] = js.native
  /**
    * Sets the field to the maximum of its current value and the given value.
    * This must be an integer or a double value. If the field is not an integer
    * or double, or if the field does not yet exist, the transformation will
    * set the field to the given value. If a maximum operation is applied where
    * the field and the input value are of mixed types (that is - one is an
    * integer and one is a double) the field takes on the type of the larger
    * operand. If the operands are equivalent (e.g. 3 and 3.0), the field does
    * not change. 0, 0.0, and -0.0 are all zero. The maximum of a zero stored
    * value and zero input value is always the stored value. The maximum of any
    * numeric value x and NaN is NaN.
    */
  var maximum: js.UndefOr[Schema$Value] = js.native
  /**
    * Sets the field to the minimum of its current value and the given value.
    * This must be an integer or a double value. If the field is not an integer
    * or double, or if the field does not yet exist, the transformation will
    * set the field to the input value. If a minimum operation is applied where
    * the field and the input value are of mixed types (that is - one is an
    * integer and one is a double) the field takes on the type of the smaller
    * operand. If the operands are equivalent (e.g. 3 and 3.0), the field does
    * not change. 0, 0.0, and -0.0 are all zero. The minimum of a zero stored
    * value and zero input value is always the stored value. The minimum of any
    * numeric value x and NaN is NaN.
    */
  var minimum: js.UndefOr[Schema$Value] = js.native
  /**
    * Remove all of the given elements from the array in the field. If the
    * field is not an array, or if the field does not yet exist, it is set to
    * the empty array.  Equivalent numbers of the different types (e.g. 3L
    * and 3.0) are considered equal when deciding whether an element should be
    * removed. NaN is equal to NaN, and Null is equal to Null. This will remove
    * all equivalent values if there are duplicates.  The corresponding
    * transform_result will be the null value.
    */
  var removeAllFromArray: js.UndefOr[Schema$ArrayValue] = js.native
  /**
    * Sets the field to the given server value.
    */
  var setToServerValue: js.UndefOr[String] = js.native
}

object Schema$FieldTransform {
  @scala.inline
  def apply(
    appendMissingElements: Schema$ArrayValue = null,
    fieldPath: String = null,
    increment: Schema$Value = null,
    maximum: Schema$Value = null,
    minimum: Schema$Value = null,
    removeAllFromArray: Schema$ArrayValue = null,
    setToServerValue: String = null
  ): Schema$FieldTransform = {
    val __obj = js.Dynamic.literal()
    if (appendMissingElements != null) __obj.updateDynamic("appendMissingElements")(appendMissingElements.asInstanceOf[js.Any])
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (removeAllFromArray != null) __obj.updateDynamic("removeAllFromArray")(removeAllFromArray.asInstanceOf[js.Any])
    if (setToServerValue != null) __obj.updateDynamic("setToServerValue")(setToServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldTransform]
  }
}

