package typings.doublearray.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var all: Double = js.native
  var efficiency: Double = js.native
  var unused: Double = js.native
}

object All {
  @scala.inline
  def apply(all: Double, efficiency: Double, unused: Double): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], efficiency = efficiency.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
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
    def setAll(value: Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setEfficiency(value: Double): Self = this.set("efficiency", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnused(value: Double): Self = this.set("unused", value.asInstanceOf[js.Any])
  }
  
}

