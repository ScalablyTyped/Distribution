package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchOptions extends LinesOptions {
  /**
    * Describes how many lines of context should be included.
    * @default 4
    */
  var context: js.UndefOr[Double] = js.native
}

object PatchOptions {
  @scala.inline
  def apply(): PatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOptions]
  }
  @scala.inline
  implicit class PatchOptionsOps[Self <: PatchOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: Double): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

