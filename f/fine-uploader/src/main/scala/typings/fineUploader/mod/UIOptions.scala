package typings.fineUploader.mod

import typings.fineUploader.coreMod.CoreOptions
import typings.fineUploader.coreMod.PromiseOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIOptions extends CoreOptions {
  /**
    * UIDeleteFileOptions
    */
  @JSName("deleteFile")
  var deleteFile_UIOptions: js.UndefOr[UIDeleteFileOptions] = js.native
  /**
    * display options
    */
  var display: js.UndefOr[UIDisplayOptions] = js.native
  /**
    * dragAndDrop options
    */
  var dragAndDrop: js.UndefOr[UIDragAndDropOptions] = js.native
  /**
    * Container element for the default drop zone
    *
    * @default `null`
    */
  var element: js.UndefOr[HTMLElement] = js.native
  /**
    * failedUploadTextDisplay options
    */
  var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.native
  /**
    * Container element for the item list
    *
    * @default `null`
    */
  var listElement: js.UndefOr[HTMLElement] = js.native
  /**
    * messages
    */
  @JSName("messages")
  var messages_UIOptions: js.UndefOr[UIMessages] = js.native
  /**
    * paste UI options
    */
  @JSName("paste")
  var paste_UIOptions: js.UndefOr[UIPasteOptions] = js.native
  /**
    * retry options
    */
  var retry: js.UndefOr[UIRetryOptions] = js.native
  /**
    * UI scaling options
    */
  @JSName("scaling")
  var scaling_UIOptions: js.UndefOr[UIScalingOptions] = js.native
  /**
    * Provide a function here to prompt the user to confirm deletion of a file.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.confirm(message); }`
    */
  var showConfirm: js.UndefOr[ShowConfirmFunction] = js.native
  /**
    * Provide a function here to display a message to the user when the uploader receives an error or the user attempts to leave the page.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.alert(message); }`
    */
  var showMessage: js.UndefOr[ShowMessageFunction] = js.native
  /**
    * Provide a function here to prompt the user for a filename when pasting file(s).
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message, defaultValue) { window.prompt(message, defaultValue); }`
    */
  var showPrompt: js.UndefOr[ShowPromptFunction] = js.native
  /**
    * This points to the container element that contains the template to use for one or more Fine Uploader UI instances.
    *
    * You can either specify a string, which is the element ID (the ID of the container element on the page) or an `Element` that points to the container element
    *
    * @default `'qq-template'`
    */
  var template: js.UndefOr[String | HTMLElement] = js.native
  /**
    * UI text options
    */
  @JSName("text")
  var text_UIOptions: js.UndefOr[UITextOptions] = js.native
  /**
    * thumbnail options
    */
  var thumbnails: js.UndefOr[UIThumbnailsOptions] = js.native
}

object UIOptions {
  @scala.inline
  def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  @scala.inline
  implicit class UIOptionsOps[Self <: UIOptions] (val x: Self) extends AnyVal {
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
    def setDeleteFile(value: UIDeleteFileOptions): Self = this.set("deleteFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteFile: Self = this.set("deleteFile", js.undefined)
    @scala.inline
    def setDisplay(value: UIDisplayOptions): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDragAndDrop(value: UIDragAndDropOptions): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDrop: Self = this.set("dragAndDrop", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setFailedUploadTextDisplay(value: UIFailedUploadTextDisplay): Self = this.set("failedUploadTextDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedUploadTextDisplay: Self = this.set("failedUploadTextDisplay", js.undefined)
    @scala.inline
    def setListElement(value: HTMLElement): Self = this.set("listElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListElement: Self = this.set("listElement", js.undefined)
    @scala.inline
    def setMessages(value: UIMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setPaste(value: UIPasteOptions): Self = this.set("paste", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    @scala.inline
    def setRetry(value: UIRetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setScaling(value: UIScalingOptions): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def setShowConfirm(value: /* message */ String => PromiseOptions | Unit): Self = this.set("showConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowConfirm: Self = this.set("showConfirm", js.undefined)
    @scala.inline
    def setShowMessage(value: /* message */ String => PromiseOptions | Unit): Self = this.set("showMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowMessage: Self = this.set("showMessage", js.undefined)
    @scala.inline
    def setShowPrompt(value: (/* message */ String, /* defaultValue */ String) => PromiseOptions | Unit): Self = this.set("showPrompt", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShowPrompt: Self = this.set("showPrompt", js.undefined)
    @scala.inline
    def setTemplate(value: String | HTMLElement): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: UITextOptions): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setThumbnails(value: UIThumbnailsOptions): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
  }
  
}

