package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait linesOptions extends seriesTypeBase {
  var steps: js.UndefOr[Boolean] = js.native
}

object linesOptions {
  @scala.inline
  def apply(): linesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[linesOptions]
  }
  @scala.inline
  implicit class linesOptionsOps[Self <: linesOptions] (val x: Self) extends AnyVal {
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
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

