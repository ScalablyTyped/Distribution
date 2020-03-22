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
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncRule extends js.Object {
  /** If true, the validationCallback is not executed for null, undefined, false, and empty strings. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether the rule should always be checked for the target value or only when the value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "async" to use the AsyncRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
  /** A function that validates the target value. */
  var validationCallback: js.UndefOr[js.Function1[/* options */ AnonColumn, Promise[_] | JQueryPromise[_]]] = js.undefined
}

object AsyncRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null,
    validationCallback: /* options */ AnonColumn => Promise[_] | JQueryPromise[_] = null
  ): AsyncRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationCallback != null) __obj.updateDynamic("validationCallback")(js.Any.fromFunction1(validationCallback))
    __obj.asInstanceOf[AsyncRule]
  }
}

