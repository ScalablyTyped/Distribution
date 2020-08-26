package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludePadding extends js.Object {
  var includePadding: Boolean = js.native
}

object IncludePadding {
  @scala.inline
  def apply(includePadding: Boolean): IncludePadding = {
    val __obj = js.Dynamic.literal(includePadding = includePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludePadding]
  }
  @scala.inline
  implicit class IncludePaddingOps[Self <: IncludePadding] (val x: Self) extends AnyVal {
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
    def setIncludePadding(value: Boolean): Self = this.set("includePadding", value.asInstanceOf[js.Any])
  }
  
}

