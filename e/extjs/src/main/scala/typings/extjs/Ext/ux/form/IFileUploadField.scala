package typings.extjs.Ext.ux.form

import typings.extjs.Ext.IElement
import typings.extjs.Ext.button.IButton
import typings.extjs.Ext.form.field.ITrigger
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUploadField extends ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.native
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  @JSName("extractFileInput")
  var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.native
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  @JSName("isFileUpload")
  var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
}

object IFileUploadField {
  @scala.inline
  def apply(): IFileUploadField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileUploadField]
  }
  @scala.inline
  implicit class IFileUploadFieldOps[Self <: IFileUploadField] (val x: Self) extends AnyVal {
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
    def setButton(value: IButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtonConfig(value: js.Any): Self = this.set("buttonConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonConfig: Self = this.set("buttonConfig", js.undefined)
    @scala.inline
    def setButtonMargin(value: Double): Self = this.set("buttonMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonMargin: Self = this.set("buttonMargin", js.undefined)
    @scala.inline
    def setButtonOnly(value: Boolean): Self = this.set("buttonOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonOnly: Self = this.set("buttonOnly", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setClearOnSubmit(value: Boolean): Self = this.set("clearOnSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearOnSubmit: Self = this.set("clearOnSubmit", js.undefined)
    @scala.inline
    def setExtractFileInput(value: () => HTMLElement): Self = this.set("extractFileInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExtractFileInput: Self = this.set("extractFileInput", js.undefined)
    @scala.inline
    def setFileInputEl(value: IElement): Self = this.set("fileInputEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileInputEl: Self = this.set("fileInputEl", js.undefined)
    @scala.inline
    def setGetTriggerMarkup(value: () => Unit): Self = this.set("getTriggerMarkup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTriggerMarkup: Self = this.set("getTriggerMarkup", js.undefined)
    @scala.inline
    def setIsFileUpload(value: () => Boolean): Self = this.set("isFileUpload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFileUpload: Self = this.set("isFileUpload", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setSetValue(value: () => Unit): Self = this.set("setValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}

