package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the misspellWordCss class name.
    */
  var misspellWordCss: js.UndefOr[String] = js.native
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.native
  /** Returns the input string.
    */
  var targetSentence: js.UndefOr[String] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
  @scala.inline
  implicit class ActionBeginEventArgsOps[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
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
    def setMisspellWordCss(value: String): Self = this.set("misspellWordCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMisspellWordCss: Self = this.set("misspellWordCss", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setTargetSentence(value: String): Self = this.set("targetSentence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSentence: Self = this.set("targetSentence", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

