package typings.ejWebAll.ej.NavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxErrorEventArgs extends js.Object {
  /** URL of the content.
    */
  var URL: js.UndefOr[String] = js.native
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Instance of the navigation drawer model object.
    */
  var model: js.UndefOr[Model] = js.native
  /** Error page content.
    */
  var responseText: js.UndefOr[String] = js.native
  /** Error code.
    */
  var status: js.UndefOr[Double] = js.native
  /** The corresponding error description.
    */
  var statusText: js.UndefOr[String] = js.native
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
  @scala.inline
  implicit class AjaxErrorEventArgsOps[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
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
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

