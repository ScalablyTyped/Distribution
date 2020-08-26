package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetUpdatingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current target element value.
    */
  var currentElement: js.UndefOr[js.Any] = js.native
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the previous target element value.
    */
  var previousElement: js.UndefOr[js.Any] = js.native
  /** Returns the target html value.
    */
  var targetHtml: js.UndefOr[String] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object TargetUpdatingEventArgs {
  @scala.inline
  def apply(): TargetUpdatingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetUpdatingEventArgs]
  }
  @scala.inline
  implicit class TargetUpdatingEventArgsOps[Self <: TargetUpdatingEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentElement(value: js.Any): Self = this.set("currentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentElement: Self = this.set("currentElement", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousElement(value: js.Any): Self = this.set("previousElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousElement: Self = this.set("previousElement", js.undefined)
    @scala.inline
    def setTargetHtml(value: String): Self = this.set("targetHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHtml: Self = this.set("targetHtml", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

