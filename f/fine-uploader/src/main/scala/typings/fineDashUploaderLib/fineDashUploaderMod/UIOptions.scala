package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIOptions
  extends fineDashUploaderLib.libCoreMod.CoreOptions {
  /**
    * UIDeleteFileOptions
    */
  @JSName("deleteFile")
  var deleteFile_UIOptions: js.UndefOr[UIDeleteFileOptions] = js.undefined
  /**
    * display options
    */
  var display: js.UndefOr[UIDisplayOptions] = js.undefined
  /**
    * dragAndDrop options
    */
  var dragAndDrop: js.UndefOr[UIDragAndDropOptions] = js.undefined
  /**
    * Container element for the default drop zone
    *
    * @default `null`
    */
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * failedUploadTextDisplay options
    */
  var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.undefined
  /**
    * Container element for the item list
    *
    * @default `null`
    */
  var listElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * messages
    */
  @JSName("messages")
  var messages_UIOptions: js.UndefOr[UIMessages] = js.undefined
  /**
    * paste UI options
    */
  @JSName("paste")
  var paste_UIOptions: js.UndefOr[UIPasteOptions] = js.undefined
  /**
    * retry options
    */
  var retry: js.UndefOr[UIRetryOptions] = js.undefined
  /**
    * UI scaling options
    */
  @JSName("scaling")
  var scaling_UIOptions: js.UndefOr[UIScalingOptions] = js.undefined
  /**
    * Provide a function here to prompt the user to confirm deletion of a file.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.confirm(message); }`
    */
  var showConfirm: js.UndefOr[ShowConfirmFunction] = js.undefined
  /**
    * Provide a function here to display a message to the user when the uploader receives an error or the user attempts to leave the page.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.alert(message); }`
    */
  var showMessage: js.UndefOr[ShowMessageFunction] = js.undefined
  /**
    * Provide a function here to prompt the user for a filename when pasting file(s).
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message, defaultValue) { window.prompt(message, defaultValue); }`
    */
  var showPrompt: js.UndefOr[ShowPromptFunction] = js.undefined
  /**
    * This points to the container element that contains the template to use for one or more Fine Uploader UI instances.
    *
    * You can either specify a string, which is the element ID (the ID of the container element on the page) or an `Element` that points to the container element
    *
    * @default `'qq-template'`
    */
  var template: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /**
    * UI text options
    */
  @JSName("text")
  var text_UIOptions: js.UndefOr[UITextOptions] = js.undefined
  /**
    * thumbnail options
    */
  var thumbnails: js.UndefOr[UIThumbnailsOptions] = js.undefined
}

