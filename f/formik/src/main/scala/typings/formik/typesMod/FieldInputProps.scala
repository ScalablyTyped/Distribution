package typings.formik.typesMod

import typings.formik.FnCall
import typings.formik.FnCallE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInputProps[Value] extends js.Object {
  /** Is the field checked? */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** Multiple select? */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** Name of the field */
  var name: String
  /** Blur event handler */
  var onBlur: FnCallE
  /** Change event handler */
  var onChange: FnCall
  /** Value of the field */
  var value: Value
}

object FieldInputProps {
  @scala.inline
  def apply[Value](
    name: String,
    onBlur: FnCallE,
    onChange: FnCall,
    value: Value,
    checked: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): FieldInputProps[Value] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInputProps[Value]]
  }
}

