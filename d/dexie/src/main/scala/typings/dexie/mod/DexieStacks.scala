package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieStacks extends js.Object {
  var dbcore: DBCore = js.native
}

object DexieStacks {
  @scala.inline
  def apply(dbcore: DBCore): DexieStacks = {
    val __obj = js.Dynamic.literal(dbcore = dbcore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieStacks]
  }
  @scala.inline
  implicit class DexieStacksOps[Self <: DexieStacks] (val x: Self) extends AnyVal {
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
    def setDbcore(value: DBCore): Self = this.set("dbcore", value.asInstanceOf[js.Any])
  }
  
}

