package typings.formatjsIntlUtils.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPatternData extends js.Object {
  var long: ListPattern = js.native
  var narrow: js.UndefOr[ListPattern] = js.native
  var short: js.UndefOr[ListPattern] = js.native
}

object ListPatternData {
  @scala.inline
  def apply(long: ListPattern): ListPatternData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPatternData]
  }
  @scala.inline
  implicit class ListPatternDataOps[Self <: ListPatternData] (val x: Self) extends AnyVal {
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
    def setLong(value: ListPattern): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrow(value: ListPattern): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    @scala.inline
    def setShort(value: ListPattern): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
  
}

