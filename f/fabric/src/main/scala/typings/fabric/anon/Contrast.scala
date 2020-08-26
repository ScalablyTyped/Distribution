package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contrast extends js.Object {
  var contrast: js.UndefOr[Double] = js.native
}

object Contrast {
  @scala.inline
  def apply(): Contrast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contrast]
  }
  @scala.inline
  implicit class ContrastOps[Self <: Contrast] (val x: Self) extends AnyVal {
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
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
  }
  
}

