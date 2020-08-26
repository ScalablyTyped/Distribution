package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Color> */
@js.native
trait PartialColor extends js.Object {
  var argb: js.UndefOr[String] = js.native
  var theme: js.UndefOr[Double] = js.native
}

object PartialColor {
  @scala.inline
  def apply(): PartialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColor]
  }
  @scala.inline
  implicit class PartialColorOps[Self <: PartialColor] (val x: Self) extends AnyVal {
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
    def setArgb(value: String): Self = this.set("argb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgb: Self = this.set("argb", js.undefined)
    @scala.inline
    def setTheme(value: Double): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

