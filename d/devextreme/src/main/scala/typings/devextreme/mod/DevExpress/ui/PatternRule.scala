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
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternRule extends js.Object {
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Specifies the regular expression that the validated value must match. */
  var pattern: js.UndefOr[RegExp | String] = js.undefined
  /** Specifies the rule type. Set it to "pattern" to use the PatternRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object PatternRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    pattern: RegExp | String = null,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): PatternRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternRule]
  }
}

