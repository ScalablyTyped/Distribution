package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyPortWrapper extends js.Object {
  @JSName("$")
  var $: Double = js.native
  var `@enabled`: Boolean = js.native
}

object LegacyPortWrapper {
  @scala.inline
  def apply($: Double, `@enabled`: Boolean): LegacyPortWrapper = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.updateDynamic("@enabled")(`@enabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyPortWrapper]
  }
  @scala.inline
  implicit class LegacyPortWrapperOps[Self <: LegacyPortWrapper] (val x: Self) extends AnyVal {
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
    def set$(value: Double): Self = this.set("$", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@enabled`(value: Boolean): Self = this.set("@enabled", value.asInstanceOf[js.Any])
  }
  
}

