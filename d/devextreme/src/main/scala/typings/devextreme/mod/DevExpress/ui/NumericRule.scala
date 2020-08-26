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

@js.native
trait NumericRule extends js.Object {
  /** @name NumericRule.ignoreEmptyValue */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.native
  /** @name NumericRule.message */
  var message: js.UndefOr[String] = js.native
  /** @name NumericRule.type */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.native
}

object NumericRule {
  @scala.inline
  def apply(): NumericRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericRule]
  }
  @scala.inline
  implicit class NumericRuleOps[Self <: NumericRule] (val x: Self) extends AnyVal {
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
    def setIgnoreEmptyValue(value: Boolean): Self = this.set("ignoreEmptyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEmptyValue: Self = this.set("ignoreEmptyValue", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setType(value: required | numeric | range | stringLength | custom | compare | pattern | email | async): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

