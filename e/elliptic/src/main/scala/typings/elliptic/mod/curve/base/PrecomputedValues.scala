package typings.elliptic.mod.curve.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecomputedValues extends js.Object {
   // ?
  var beta: js.Any = js.native
  var doubles: js.Any = js.native
   // ?
  var naf: js.Any = js.native
}

object PrecomputedValues {
  @scala.inline
  def apply(beta: js.Any, doubles: js.Any, naf: js.Any): PrecomputedValues = {
    val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], doubles = doubles.asInstanceOf[js.Any], naf = naf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecomputedValues]
  }
  @scala.inline
  implicit class PrecomputedValuesOps[Self <: PrecomputedValues] (val x: Self) extends AnyVal {
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
    def setBeta(value: js.Any): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubles(value: js.Any): Self = this.set("doubles", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaf(value: js.Any): Self = this.set("naf", value.asInstanceOf[js.Any])
  }
  
}

