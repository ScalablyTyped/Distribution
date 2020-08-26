package typings.formatjsIntlDatetimeformat.anon

import typings.formatjsIntlDatetimeformat.typesMod.EraData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongNarrow extends js.Object {
  var long: EraData = js.native
  var narrow: EraData = js.native
  var short: EraData = js.native
}

object LongNarrow {
  @scala.inline
  def apply(long: EraData, narrow: EraData, short: EraData): LongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrow]
  }
  @scala.inline
  implicit class LongNarrowOps[Self <: LongNarrow] (val x: Self) extends AnyVal {
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
    def setLong(value: EraData): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrow(value: EraData): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: EraData): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

