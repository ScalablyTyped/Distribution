package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareOptions extends js.Object {
  var file: js.UndefOr[String] = js.native
  var highlightColor: js.UndefOr[String] = js.native
  var highlightStyle: js.UndefOr[HighlightStyle] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object CompareOptions {
  @scala.inline
  def apply(): CompareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareOptions]
  }
  @scala.inline
  implicit class CompareOptionsOps[Self <: CompareOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    @scala.inline
    def setHighlightStyle(value: HighlightStyle): Self = this.set("highlightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightStyle: Self = this.set("highlightStyle", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

