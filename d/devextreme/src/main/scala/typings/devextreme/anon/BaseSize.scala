package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSize extends js.Object {
  var baseSize: js.UndefOr[Double | auto] = js.native
  var ratio: js.UndefOr[Double] = js.native
  var screen: js.UndefOr[String] = js.native
  var shrink: js.UndefOr[Double] = js.native
}

object BaseSize {
  @scala.inline
  def apply(): BaseSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSize]
  }
  @scala.inline
  implicit class BaseSizeOps[Self <: BaseSize] (val x: Self) extends AnyVal {
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
    def setBaseSize(value: Double | auto): Self = this.set("baseSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseSize: Self = this.set("baseSize", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setScreen(value: String): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
    @scala.inline
    def setShrink(value: Double): Self = this.set("shrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
  }
  
}

