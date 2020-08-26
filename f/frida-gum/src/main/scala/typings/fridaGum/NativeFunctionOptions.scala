package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFunctionOptions extends js.Object {
  var abi: js.UndefOr[NativeABI] = js.native
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.native
  var scheduling: js.UndefOr[SchedulingBehavior] = js.native
  var traps: js.UndefOr[CodeTraps] = js.native
}

object NativeFunctionOptions {
  @scala.inline
  def apply(): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeFunctionOptions]
  }
  @scala.inline
  implicit class NativeFunctionOptionsOps[Self <: NativeFunctionOptions] (val x: Self) extends AnyVal {
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
    def setAbi(value: NativeABI): Self = this.set("abi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbi: Self = this.set("abi", js.undefined)
    @scala.inline
    def setExceptions(value: ExceptionsBehavior): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    @scala.inline
    def setScheduling(value: SchedulingBehavior): Self = this.set("scheduling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduling: Self = this.set("scheduling", js.undefined)
    @scala.inline
    def setTraps(value: CodeTraps): Self = this.set("traps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraps: Self = this.set("traps", js.undefined)
  }
  
}

