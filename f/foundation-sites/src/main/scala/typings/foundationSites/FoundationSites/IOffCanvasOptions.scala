package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOffCanvasOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var forceTop: js.UndefOr[Boolean] = js.native
  var isRevealed: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var revealClass: js.UndefOr[String] = js.native
  var revealOn: js.UndefOr[String] = js.native
  var transitionTime: js.UndefOr[Double] = js.native
  var trapFocus: js.UndefOr[Boolean] = js.native
}

object IOffCanvasOptions {
  @scala.inline
  def apply(): IOffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOffCanvasOptions]
  }
  @scala.inline
  implicit class IOffCanvasOptionsOps[Self <: IOffCanvasOptions] (val x: Self) extends AnyVal {
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setForceTop(value: Boolean): Self = this.set("forceTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceTop: Self = this.set("forceTop", js.undefined)
    @scala.inline
    def setIsRevealed(value: Boolean): Self = this.set("isRevealed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRevealed: Self = this.set("isRevealed", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRevealClass(value: String): Self = this.set("revealClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevealClass: Self = this.set("revealClass", js.undefined)
    @scala.inline
    def setRevealOn(value: String): Self = this.set("revealOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevealOn: Self = this.set("revealOn", js.undefined)
    @scala.inline
    def setTransitionTime(value: Double): Self = this.set("transitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionTime: Self = this.set("transitionTime", js.undefined)
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
  }
  
}

