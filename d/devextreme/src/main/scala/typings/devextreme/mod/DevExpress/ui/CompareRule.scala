package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.EqualssignEqualssign
import typings.devextreme.devextremeStrings.EqualssignEqualssignEqualssign
import typings.devextreme.devextremeStrings.ExclamationmarkEqualssign
import typings.devextreme.devextremeStrings.ExclamationmarkEqualssignEqualssign
import typings.devextreme.devextremeStrings.Greaterthansign
import typings.devextreme.devextremeStrings.GreaterthansignEqualssign
import typings.devextreme.devextremeStrings.Lessthansign
import typings.devextreme.devextremeStrings.LessthansignEqualssign
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

trait CompareRule extends js.Object {
  /** @name CompareRule.comparisonTarget */
  var comparisonTarget: js.UndefOr[js.Function0[_]] = js.undefined
  /** @name CompareRule.comparisonType */
  var comparisonType: js.UndefOr[
    ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
  ] = js.undefined
  /** @name CompareRule.ignoreEmptyValue */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** @name CompareRule.message */
  var message: js.UndefOr[String] = js.undefined
  /** @name CompareRule.reevaluate */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** @name CompareRule.type */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object CompareRule {
  @scala.inline
  def apply(
    comparisonTarget: () => _ = null,
    comparisonType: ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign = null,
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): CompareRule = {
    val __obj = js.Dynamic.literal()
    if (comparisonTarget != null) __obj.updateDynamic("comparisonTarget")(js.Any.fromFunction0(comparisonTarget))
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareRule]
  }
}

