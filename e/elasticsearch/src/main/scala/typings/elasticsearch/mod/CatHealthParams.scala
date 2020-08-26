package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatHealthParams extends CatCommonParams {
  var ts: js.UndefOr[Boolean] = js.native
}

object CatHealthParams {
  @scala.inline
  def apply(format: String): CatHealthParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatHealthParams]
  }
  @scala.inline
  implicit class CatHealthParamsOps[Self <: CatHealthParams] (val x: Self) extends AnyVal {
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
    def setTs(value: Boolean): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
  }
  
}

