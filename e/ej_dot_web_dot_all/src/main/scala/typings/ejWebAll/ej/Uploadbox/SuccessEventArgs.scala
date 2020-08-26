package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessEventArgs extends js.Object {
  /** AJAX event argument for reference.
    */
  var e: js.UndefOr[js.Any] = js.native
  /** Uploaded file list.
    */
  var files: js.UndefOr[js.Any] = js.native
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** response from the server.
    */
  var responseText: js.UndefOr[String] = js.native
  /** successfully uploaded files list.
    */
  var success: js.UndefOr[js.Any] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** XHR-AJAX Object for reference.
    */
  var xhr: js.UndefOr[js.Any] = js.native
}

object SuccessEventArgs {
  @scala.inline
  def apply(): SuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessEventArgs]
  }
  @scala.inline
  implicit class SuccessEventArgsOps[Self <: SuccessEventArgs] (val x: Self) extends AnyVal {
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
    def setE(value: js.Any): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setFiles(value: js.Any): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    @scala.inline
    def setSuccess(value: js.Any): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXhr(value: js.Any): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

