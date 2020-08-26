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

@js.native
trait CompareRule extends js.Object {
  /** @name CompareRule.comparisonTarget */
  var comparisonTarget: js.UndefOr[js.Function0[_]] = js.native
  /** @name CompareRule.comparisonType */
  var comparisonType: js.UndefOr[
    ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
  ] = js.native
  /** @name CompareRule.ignoreEmptyValue */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.native
  /** @name CompareRule.message */
  var message: js.UndefOr[String] = js.native
  /** @name CompareRule.reevaluate */
  var reevaluate: js.UndefOr[Boolean] = js.native
  /** @name CompareRule.type */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.native
}

object CompareRule {
  @scala.inline
  def apply(): CompareRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareRule]
  }
  @scala.inline
  implicit class CompareRuleOps[Self <: CompareRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComparisonTarget(value: () => _): Self = this.set("comparisonTarget", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComparisonTarget: Self = this.set("comparisonTarget", js.undefined)
    @scala.inline
    def setComparisonType(
      value: ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = this.set("comparisonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonType: Self = this.set("comparisonType", js.undefined)
    @scala.inline
    def setIgnoreEmptyValue(value: Boolean): Self = this.set("ignoreEmptyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEmptyValue: Self = this.set("ignoreEmptyValue", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReevaluate(value: Boolean): Self = this.set("reevaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReevaluate: Self = this.set("reevaluate", js.undefined)
    @scala.inline
    def setType(value: required | numeric | range | stringLength | custom | compare | pattern | email | async): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

