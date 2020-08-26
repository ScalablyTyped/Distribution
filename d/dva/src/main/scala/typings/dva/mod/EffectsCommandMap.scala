package typings.dva.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectsCommandMap
  extends /* key */ StringDictionary[js.Any] {
  var call: js.Function = js.native
  var cancel: js.Function = js.native
  var select: js.Function = js.native
  var take: js.Function = js.native
  def put[A /* <: AnyAction */](action: A): js.Any = js.native
}

object EffectsCommandMap {
  @scala.inline
  def apply(
    call: js.Function,
    cancel: js.Function,
    put: js.Any => js.Any,
    select: js.Function,
    take: js.Function
  ): EffectsCommandMap = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), select = select.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectsCommandMap]
  }
  @scala.inline
  implicit class EffectsCommandMapOps[Self <: EffectsCommandMap] (val x: Self) extends AnyVal {
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
    def setCall(value: js.Function): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: js.Function): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: js.Any => js.Any): Self = this.set("put", js.Any.fromFunction1(value))
    @scala.inline
    def setSelect(value: js.Function): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def setTake(value: js.Function): Self = this.set("take", value.asInstanceOf[js.Any])
  }
  
}

