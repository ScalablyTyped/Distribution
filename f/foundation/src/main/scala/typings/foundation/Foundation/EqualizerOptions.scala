package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/equalizer.html#optional-javascript-configuration
@js.native
trait EqualizerOptions extends js.Object {
  var equalize_on_stack: js.UndefOr[Boolean] = js.native
  var use_tallest: js.UndefOr[Boolean] = js.native
}

object EqualizerOptions {
  @scala.inline
  def apply(): EqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualizerOptions]
  }
  @scala.inline
  implicit class EqualizerOptionsOps[Self <: EqualizerOptions] (val x: Self) extends AnyVal {
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
    def setEqualize_on_stack(value: Boolean): Self = this.set("equalize_on_stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualize_on_stack: Self = this.set("equalize_on_stack", js.undefined)
    @scala.inline
    def setUse_tallest(value: Boolean): Self = this.set("use_tallest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_tallest: Self = this.set("use_tallest", js.undefined)
  }
  
}

