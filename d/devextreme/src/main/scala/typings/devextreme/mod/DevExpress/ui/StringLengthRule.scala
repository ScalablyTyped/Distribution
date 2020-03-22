package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.async
import typings.devextreme.devextremeStrings.compare
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.pattern
import typings.devextreme.devextremeStrings.range
import typings.devextreme.devextremeStrings.required
import typings.devextreme.devextremeStrings.stringLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLengthRule extends js.Object {
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the maximum length allowed for the validated value. */
  var max: js.UndefOr[Double] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Specifies the minimum length allowed for the validated value. */
  var min: js.UndefOr[Double] = js.undefined
  /** Indicates whether or not to remove the Space characters from the validated value. */
  var trim: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "stringLength" to use the StringLengthRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object StringLengthRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    message: String = null,
    min: Int | Double = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): StringLengthRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLengthRule]
  }
}

