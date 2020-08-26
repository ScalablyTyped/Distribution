package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptionsSync extends CopyOptions {
  @JSName("filter")
  var filter_CopyOptionsSync: js.UndefOr[CopyFilterSync] = js.native
}

object CopyOptionsSync {
  @scala.inline
  def apply(): CopyOptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionsSync]
  }
  @scala.inline
  implicit class CopyOptionsSyncOps[Self <: CopyOptionsSync] (val x: Self) extends AnyVal {
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
    def setFilter(value: (/* src */ String, /* dest */ String) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

