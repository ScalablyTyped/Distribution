package typings.dos2unix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var error: Double = js.native
  var fix: Double = js.native
  var skip: Double = js.native
}

object Stats {
  @scala.inline
  def apply(error: Double, fix: Double, skip: Double): Stats = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFix(value: Double): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
  
}

