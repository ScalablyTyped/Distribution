package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonColumn
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

trait CustomRule extends js.Object {
  /** @name CustomRule.ignoreEmptyValue */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** @name CustomRule.message */
  var message: js.UndefOr[String] = js.undefined
  /** @name CustomRule.reevaluate */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** @name CustomRule.type */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
  /** @name CustomRule.validationCallback */
  var validationCallback: js.UndefOr[js.Function1[/* options */ AnonColumn, Boolean]] = js.undefined
}

object CustomRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null,
    validationCallback: /* options */ AnonColumn => Boolean = null
  ): CustomRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationCallback != null) __obj.updateDynamic("validationCallback")(js.Any.fromFunction1(validationCallback))
    __obj.asInstanceOf[CustomRule]
  }
}

