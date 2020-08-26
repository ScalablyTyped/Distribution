package typings.formatjsIntlUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldData extends js.Object {
  var `-1`: js.UndefOr[String] = js.native
  var `-2`: js.UndefOr[String] = js.native
  var `-3`: js.UndefOr[String] = js.native
  var `0`: js.UndefOr[String] = js.native
  var `1`: js.UndefOr[String] = js.native
  var `2`: js.UndefOr[String] = js.native
  var `3`: js.UndefOr[String] = js.native
  var future: RelativeTimeData = js.native
  var past: RelativeTimeData = js.native
}

object FieldData {
  @scala.inline
  def apply(future: RelativeTimeData, past: RelativeTimeData): FieldData = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  @scala.inline
  implicit class FieldDataOps[Self <: FieldData] (val x: Self) extends AnyVal {
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
    def setFuture(value: RelativeTimeData): Self = this.set("future", value.asInstanceOf[js.Any])
    @scala.inline
    def setPast(value: RelativeTimeData): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def `set-1`(value: String): Self = this.set("-1", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-1`: Self = this.set("-1", js.undefined)
    @scala.inline
    def `set-2`(value: String): Self = this.set("-2", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-2`: Self = this.set("-2", js.undefined)
    @scala.inline
    def `set-3`(value: String): Self = this.set("-3", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-3`: Self = this.set("-3", js.undefined)
    @scala.inline
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def delete0: Self = this.set("0", js.undefined)
    @scala.inline
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
  }
  
}

