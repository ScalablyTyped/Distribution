package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Column
import typings.devextreme.devextremeStrings.async
import typings.devextreme.devextremeStrings.compare
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.pattern
import typings.devextreme.devextremeStrings.range
import typings.devextreme.devextremeStrings.required
import typings.devextreme.devextremeStrings.stringLength
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncRule extends js.Object {
  /** @name AsyncRule.ignoreEmptyValue */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.native
  /** @name AsyncRule.message */
  var message: js.UndefOr[String] = js.native
  /** @name AsyncRule.reevaluate */
  var reevaluate: js.UndefOr[Boolean] = js.native
  /** @name AsyncRule.type */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.native
  /** @name AsyncRule.validationCallback */
  var validationCallback: js.UndefOr[js.Function1[/* options */ Column, Promise[_] | JQueryPromise[_]]] = js.native
}

object AsyncRule {
  @scala.inline
  def apply(): AsyncRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncRule]
  }
  @scala.inline
  implicit class AsyncRuleOps[Self <: AsyncRule] (val x: Self) extends AnyVal {
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
    def setReevaluate(value: Boolean): Self = this.set("reevaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReevaluate: Self = this.set("reevaluate", js.undefined)
    @scala.inline
    def setType(value: required | numeric | range | stringLength | custom | compare | pattern | email | async): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidationCallback(value: /* options */ Column => Promise[_] | JQueryPromise[_]): Self = this.set("validationCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidationCallback: Self = this.set("validationCallback", js.undefined)
  }
  
}

