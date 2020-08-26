package typings.formatjsIntlNumberformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundUnitData extends js.Object {
  var long: String = js.native
  var narrow: String = js.native
  var short: String = js.native
}

object CompoundUnitData {
  @scala.inline
  def apply(long: String, narrow: String, short: String): CompoundUnitData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundUnitData]
  }
  @scala.inline
  implicit class CompoundUnitDataOps[Self <: CompoundUnitData] (val x: Self) extends AnyVal {
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
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrow(value: String): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

