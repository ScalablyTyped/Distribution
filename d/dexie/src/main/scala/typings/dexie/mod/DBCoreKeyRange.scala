package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreKeyRange extends js.Object {
  val lower: js.Any = js.native
  val lowerOpen: js.UndefOr[Boolean] = js.native
  val `type`: DBCoreRangeType = js.native
  val upper: js.Any = js.native
  val upperOpen: js.UndefOr[Boolean] = js.native
}

object DBCoreKeyRange {
  @scala.inline
  def apply(lower: js.Any, `type`: DBCoreRangeType, upper: js.Any): DBCoreKeyRange = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreKeyRange]
  }
  @scala.inline
  implicit class DBCoreKeyRangeOps[Self <: DBCoreKeyRange] (val x: Self) extends AnyVal {
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
    def setLower(value: js.Any): Self = this.set("lower", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DBCoreRangeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpper(value: js.Any): Self = this.set("upper", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerOpen(value: Boolean): Self = this.set("lowerOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerOpen: Self = this.set("lowerOpen", js.undefined)
    @scala.inline
    def setUpperOpen(value: Boolean): Self = this.set("upperOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperOpen: Self = this.set("upperOpen", js.undefined)
  }
  
}

