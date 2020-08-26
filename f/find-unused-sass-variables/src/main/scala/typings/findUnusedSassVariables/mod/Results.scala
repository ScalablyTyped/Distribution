package typings.findUnusedSassVariables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  /** he sum of all variables in the files (unused and used ones) */
  val total: Double = js.native
  /** the array of unused variables */
  val unused: js.Array[String] = js.native
}

object Results {
  @scala.inline
  def apply(total: Double, unused: js.Array[String]): Results = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
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
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnusedVarargs(value: String*): Self = this.set("unused", js.Array(value :_*))
    @scala.inline
    def setUnused(value: js.Array[String]): Self = this.set("unused", value.asInstanceOf[js.Any])
  }
  
}

