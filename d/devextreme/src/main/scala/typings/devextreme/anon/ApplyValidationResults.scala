package typings.devextreme.anon

import typings.devextreme.mod.global.JQueryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyValidationResults extends js.Object {
  var applyValidationResults: js.UndefOr[js.Function] = js.native
  var bypass: js.UndefOr[js.Function] = js.native
  var focus: js.UndefOr[js.Function] = js.native
  var getValue: js.UndefOr[js.Function] = js.native
  var reset: js.UndefOr[js.Function] = js.native
  var validationRequestsCallbacks: js.UndefOr[js.Array[js.Function] | JQueryCallback] = js.native
}

object ApplyValidationResults {
  @scala.inline
  def apply(): ApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyValidationResults]
  }
  @scala.inline
  implicit class ApplyValidationResultsOps[Self <: ApplyValidationResults] (val x: Self) extends AnyVal {
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
    def setApplyValidationResults(value: js.Function): Self = this.set("applyValidationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyValidationResults: Self = this.set("applyValidationResults", js.undefined)
    @scala.inline
    def setBypass(value: js.Function): Self = this.set("bypass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypass: Self = this.set("bypass", js.undefined)
    @scala.inline
    def setFocus(value: js.Function): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setGetValue(value: js.Function): Self = this.set("getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setReset(value: js.Function): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setValidationRequestsCallbacksVarargs(value: js.Function*): Self = this.set("validationRequestsCallbacks", js.Array(value :_*))
    @scala.inline
    def setValidationRequestsCallbacks(value: js.Array[js.Function] | JQueryCallback): Self = this.set("validationRequestsCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRequestsCallbacks: Self = this.set("validationRequestsCallbacks", js.undefined)
  }
  
}

