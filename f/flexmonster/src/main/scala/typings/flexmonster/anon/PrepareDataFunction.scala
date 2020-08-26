package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrepareDataFunction extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.native
  var `type`: String = js.native
}

object PrepareDataFunction {
  @scala.inline
  def apply(`type`: String): PrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareDataFunction]
  }
  @scala.inline
  implicit class PrepareDataFunctionOps[Self <: PrepareDataFunction] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepareDataFunction(value: /* rawData */ js.Any => _): Self = this.set("prepareDataFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepareDataFunction: Self = this.set("prepareDataFunction", js.undefined)
    @scala.inline
    def setSlice(value: typings.flexmonster.mod.Slice): Self = this.set("slice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
  }
  
}

