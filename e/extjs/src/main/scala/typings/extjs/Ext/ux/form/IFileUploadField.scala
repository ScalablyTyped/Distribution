package typings.extjs.Ext.ux.form

import typings.extjs.Ext.IElement
import typings.extjs.Ext.button.IButton
import typings.extjs.Ext.form.field.ITrigger
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadField extends ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.undefined
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  @JSName("extractFileInput")
  var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.undefined
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  @JSName("isFileUpload")
  var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IFileUploadField {
  @scala.inline
  def apply(
    ITrigger: ITrigger = null,
    button: IButton = null,
    buttonConfig: js.Any = null,
    buttonMargin: Int | Double = null,
    buttonOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    clearOnSubmit: js.UndefOr[Boolean] = js.undefined,
    extractFileInput: () => HTMLElement = null,
    fileInputEl: IElement = null,
    getTriggerMarkup: () => Unit = null,
    isFileUpload: () => Boolean = null,
    onShow: () => Unit = null,
    setValue: () => Unit = null
  ): IFileUploadField = {
    val __obj = js.Dynamic.literal()
    if (ITrigger != null) js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttonConfig != null) __obj.updateDynamic("buttonConfig")(buttonConfig.asInstanceOf[js.Any])
    if (buttonMargin != null) __obj.updateDynamic("buttonMargin")(buttonMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonOnly)) __obj.updateDynamic("buttonOnly")(buttonOnly.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit.asInstanceOf[js.Any])
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(js.Any.fromFunction0(extractFileInput))
    if (fileInputEl != null) __obj.updateDynamic("fileInputEl")(fileInputEl.asInstanceOf[js.Any])
    if (getTriggerMarkup != null) __obj.updateDynamic("getTriggerMarkup")(js.Any.fromFunction0(getTriggerMarkup))
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(js.Any.fromFunction0(isFileUpload))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction0(setValue))
    __obj.asInstanceOf[IFileUploadField]
  }
}

