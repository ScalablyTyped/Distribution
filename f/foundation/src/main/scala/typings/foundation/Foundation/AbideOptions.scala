package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbideOptions extends js.Object {
  var error_labels: js.UndefOr[Boolean] = js.native
  var focus_on_invalid: js.UndefOr[Boolean] = js.native
  var live_validate: js.UndefOr[Boolean] = js.native
  var patterns: js.UndefOr[AbidePatterns] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var validate_on_blur: js.UndefOr[Boolean] = js.native
  var validators: js.UndefOr[js.Object] = js.native
}

object AbideOptions {
  @scala.inline
  def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  @scala.inline
  implicit class AbideOptionsOps[Self <: AbideOptions] (val x: Self) extends AnyVal {
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
    def setError_labels(value: Boolean): Self = this.set("error_labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_labels: Self = this.set("error_labels", js.undefined)
    @scala.inline
    def setFocus_on_invalid(value: Boolean): Self = this.set("focus_on_invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus_on_invalid: Self = this.set("focus_on_invalid", js.undefined)
    @scala.inline
    def setLive_validate(value: Boolean): Self = this.set("live_validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLive_validate: Self = this.set("live_validate", js.undefined)
    @scala.inline
    def setPatterns(value: AbidePatterns): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setValidate_on_blur(value: Boolean): Self = this.set("validate_on_blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate_on_blur: Self = this.set("validate_on_blur", js.undefined)
    @scala.inline
    def setValidators(value: js.Object): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
  
}

