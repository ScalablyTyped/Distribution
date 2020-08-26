package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawIndicatorEventArgs extends js.Object {
  /** for canceling the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns an object to customize bullet graph indicator text and symbol before rendering it.
    */
  var indicatorSettings: js.UndefOr[js.Any] = js.native
  /** returns the object of bullet graph.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the type of event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object DrawIndicatorEventArgs {
  @scala.inline
  def apply(): DrawIndicatorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawIndicatorEventArgs]
  }
  @scala.inline
  implicit class DrawIndicatorEventArgsOps[Self <: DrawIndicatorEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setIndicatorSettings(value: js.Any): Self = this.set("indicatorSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorSettings: Self = this.set("indicatorSettings", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

