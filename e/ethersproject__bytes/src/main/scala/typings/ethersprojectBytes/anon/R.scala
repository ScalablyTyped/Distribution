package typings.ethersprojectBytes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R extends js.Object {
  var _vs: js.UndefOr[String] = js.native
  var r: String = js.native
  var recoveryParam: js.UndefOr[Double] = js.native
  var s: js.UndefOr[String] = js.native
  var v: js.UndefOr[Double] = js.native
}

object R {
  @scala.inline
  def apply(r: String): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  @scala.inline
  implicit class ROps[Self <: R] (val x: Self) extends AnyVal {
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
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def set_vs(value: String): Self = this.set("_vs", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_vs: Self = this.set("_vs", js.undefined)
    @scala.inline
    def setRecoveryParam(value: Double): Self = this.set("recoveryParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryParam: Self = this.set("recoveryParam", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

