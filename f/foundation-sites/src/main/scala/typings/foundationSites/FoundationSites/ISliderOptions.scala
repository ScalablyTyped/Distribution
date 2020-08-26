package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderOptions extends js.Object {
  var binding: js.UndefOr[Boolean] = js.native
  var clickSelect: js.UndefOr[Boolean] = js.native
  var decimal: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledClass: js.UndefOr[String] = js.native
  var doubleSided: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[Double] = js.native
  var initialEnd: js.UndefOr[Double] = js.native
  var initialStart: js.UndefOr[Double] = js.native
  var moveTime: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ISliderOptions {
  @scala.inline
  def apply(): ISliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderOptions]
  }
  @scala.inline
  implicit class ISliderOptionsOps[Self <: ISliderOptions] (val x: Self) extends AnyVal {
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
    def setBinding(value: Boolean): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setClickSelect(value: Boolean): Self = this.set("clickSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickSelect: Self = this.set("clickSelect", js.undefined)
    @scala.inline
    def setDecimal(value: Double): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    @scala.inline
    def setDoubleSided(value: Boolean): Self = this.set("doubleSided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleSided: Self = this.set("doubleSided", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInitialEnd(value: Double): Self = this.set("initialEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialEnd: Self = this.set("initialEnd", js.undefined)
    @scala.inline
    def setInitialStart(value: Double): Self = this.set("initialStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialStart: Self = this.set("initialStart", js.undefined)
    @scala.inline
    def setMoveTime(value: Double): Self = this.set("moveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveTime: Self = this.set("moveTime", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

