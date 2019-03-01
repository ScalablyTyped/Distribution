package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFile extends ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[extjsLib.ExtNs.buttonNs.IButton] = js.undefined
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  @JSName("extractFileInput")
  var extractFileInput_IFile: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  @JSName("isFileUpload")
  var isFileUpload_IFile: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IFile {
  @scala.inline
  def apply(
    ITrigger: ITrigger = null,
    button: extjsLib.ExtNs.buttonNs.IButton = null,
    buttonConfig: js.Any = null,
    buttonMargin: scala.Int | scala.Double = null,
    buttonOnly: js.UndefOr[scala.Boolean] = js.undefined,
    buttonText: java.lang.String = null,
    clearOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    componentLayout: js.Any = null,
    extractFileInput: js.Function0[stdLib.HTMLElement] = null,
    fileInputEl: extjsLib.ExtNs.IElement = null,
    getTriggerMarkup: js.Function0[scala.Unit] = null,
    isFileUpload: js.Function0[scala.Boolean] = null,
    onDisable: js.Function0[scala.Unit] = null,
    onEnable: js.Function0[scala.Unit] = null,
    onRender: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.Function0[scala.Unit] = null,
    setValue: js.Function0[scala.Unit] = null
  ): IFile = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITrigger)
    if (button != null) __obj.updateDynamic("button")(button)
    if (buttonConfig != null) __obj.updateDynamic("buttonConfig")(buttonConfig)
    if (buttonMargin != null) __obj.updateDynamic("buttonMargin")(buttonMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonOnly)) __obj.updateDynamic("buttonOnly")(buttonOnly)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(extractFileInput)
    if (fileInputEl != null) __obj.updateDynamic("fileInputEl")(fileInputEl)
    if (getTriggerMarkup != null) __obj.updateDynamic("getTriggerMarkup")(getTriggerMarkup)
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(isFileUpload)
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable)
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[IFile]
  }
}

