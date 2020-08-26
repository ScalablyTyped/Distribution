package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var startAt: js.UndefOr[String] = js.native
}

object BeginsWith {
  @scala.inline
  def apply(): BeginsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginsWith]
  }
  @scala.inline
  implicit class BeginsWithOps[Self <: BeginsWith] (val x: Self) extends AnyVal {
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
    def setBeginsWith(value: String): Self = this.set("beginsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginsWith: Self = this.set("beginsWith", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setStartAt(value: String): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
  }
  
}

