package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentPageNum extends js.Object {
  var currentPageNum: js.UndefOr[Double] = js.native
}

object CurrentPageNum {
  @scala.inline
  def apply(): CurrentPageNum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentPageNum]
  }
  @scala.inline
  implicit class CurrentPageNumOps[Self <: CurrentPageNum] (val x: Self) extends AnyVal {
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
    def setCurrentPageNum(value: Double): Self = this.set("currentPageNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageNum: Self = this.set("currentPageNum", js.undefined)
  }
  
}

