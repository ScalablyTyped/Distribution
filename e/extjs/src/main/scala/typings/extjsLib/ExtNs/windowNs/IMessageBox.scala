package typings
package extjsLib.ExtNs.windowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBox extends IWindow {
  /** [Property] (Number) */
  var CANCEL: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (String) */
  var ERROR: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var INFO: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Number) */
  var NO: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var OK: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var OKCANCEL: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (String) */
  var QUESTION: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var WARNING: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Number) */
  var YES: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var YESNO: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var YESNOCANCEL: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var buttonText: js.UndefOr[js.Any] = js.undefined
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @returns Ext.window.MessageBox this
  		*/
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var defaultTextHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMessageBox: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Property] (Number) */
  var minProgressWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var minPromptWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Displays a message box with a progress bar
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param progressText String The text to display inside the progress bar
  		* @returns Ext.window.MessageBox this
  		*/
  var progress: js.UndefOr[
    js.Function3[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* progressText */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
  		* @param title String The title bar text
  		* @param msg String The message box body text
  		* @param fn Function The callback function invoked after the message box is closed. See show method for details.
  		* @param scope Object The scope (this reference) in which the callback is executed.
  		* @param multiline Boolean/Number True to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox/
  		* @param value String Default value of the text input element
  		* @returns Ext.window.MessageBox this
  		*/
  var prompt: js.UndefOr[
    js.Function6[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* multiline */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Adds the specified icon to the dialog
  		* @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
  		* @param width Number The width of the icon. If not specified, the default is used
  		* @param height Number The height of the icon. If not specified, the default is used
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("setIcon")
  var setIcon_IMessageBox: js.UndefOr[
    js.Function3[
      /* icon */ js.UndefOr[java.lang.String], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
  		* @param config Object The following config options are supported:
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("show")
  var show_IMessageBox: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Updates a progress style message box s text and progress bar
  		* @param value Number Any number between 0 and 1 (e.g., .5)
  		* @param progressText String The progress text to display inside the progress bar.
  		* @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
  		* @returns Ext.window.MessageBox this
  		*/
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[scala.Double], 
      /* progressText */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays a message box with an infinitely auto updating progress bar
  		* @param msg String The message box body text
  		* @param title String The title bar text
  		* @param config Object A Ext.ProgressBar.wait config object
  		* @returns Ext.window.MessageBox this
  		*/
  @JSName("wait")
  var wait_FIMessageBox: js.UndefOr[
    js.Function3[
      /* msg */ js.UndefOr[java.lang.String], 
      /* title */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
}

object IMessageBox {
  @scala.inline
  def apply(
    CANCEL: scala.Int | scala.Double = null,
    ERROR: java.lang.String = null,
    INFO: java.lang.String = null,
    IWindow: IWindow = null,
    NO: scala.Int | scala.Double = null,
    OK: scala.Int | scala.Double = null,
    OKCANCEL: scala.Int | scala.Double = null,
    QUESTION: java.lang.String = null,
    WARNING: java.lang.String = null,
    YES: scala.Int | scala.Double = null,
    YESNO: scala.Int | scala.Double = null,
    YESNOCANCEL: scala.Int | scala.Double = null,
    alert: js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      IMessageBox
    ] = null,
    buttonText: js.Any = null,
    closeAction: java.lang.String = null,
    cls: java.lang.String = null,
    confirm: js.Function4[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      IMessageBox
    ] = null,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    defaultTextHeight: scala.Int | scala.Double = null,
    hide: js.Function0[extjsLib.ExtNs.IComponent] = null,
    hideMode: java.lang.String = null,
    layout: js.Any = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minProgressWidth: scala.Int | scala.Double = null,
    minPromptWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    onShow: js.Function0[scala.Unit] = null,
    progress: js.Function3[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* progressText */ js.UndefOr[java.lang.String], 
      IMessageBox
    ] = null,
    prompt: js.Function6[
      /* title */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* multiline */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      IMessageBox
    ] = null,
    resizable: js.Any = null,
    setIcon: js.Function3[
      /* icon */ js.UndefOr[java.lang.String], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      IMessageBox
    ] = null,
    show: js.Function1[/* config */ js.UndefOr[js.Any], IMessageBox] = null,
    shrinkWrapDock: js.Any = null,
    title: java.lang.String = null,
    updateProgress: js.Function3[
      /* value */ js.UndefOr[scala.Double], 
      /* progressText */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      IMessageBox
    ] = null,
    wait: js.Function3[
      /* msg */ js.UndefOr[java.lang.String], 
      /* title */ js.UndefOr[java.lang.String], 
      /* config */ js.UndefOr[js.Any], 
      IMessageBox
    ] = null
  ): IMessageBox = {
    val __obj = js.Dynamic.literal()
    if (CANCEL != null) __obj.updateDynamic("CANCEL")(CANCEL.asInstanceOf[js.Any])
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR)
    if (INFO != null) __obj.updateDynamic("INFO")(INFO)
    js.Dynamic.global.Object.assign(__obj, IWindow)
    if (NO != null) __obj.updateDynamic("NO")(NO.asInstanceOf[js.Any])
    if (OK != null) __obj.updateDynamic("OK")(OK.asInstanceOf[js.Any])
    if (OKCANCEL != null) __obj.updateDynamic("OKCANCEL")(OKCANCEL.asInstanceOf[js.Any])
    if (QUESTION != null) __obj.updateDynamic("QUESTION")(QUESTION)
    if (WARNING != null) __obj.updateDynamic("WARNING")(WARNING)
    if (YES != null) __obj.updateDynamic("YES")(YES.asInstanceOf[js.Any])
    if (YESNO != null) __obj.updateDynamic("YESNO")(YESNO.asInstanceOf[js.Any])
    if (YESNOCANCEL != null) __obj.updateDynamic("YESNOCANCEL")(YESNOCANCEL.asInstanceOf[js.Any])
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (closeAction != null) __obj.updateDynamic("closeAction")(closeAction)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (defaultTextHeight != null) __obj.updateDynamic("defaultTextHeight")(defaultTextHeight.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minProgressWidth != null) __obj.updateDynamic("minProgressWidth")(minProgressWidth.asInstanceOf[js.Any])
    if (minPromptWidth != null) __obj.updateDynamic("minPromptWidth")(minPromptWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (resizable != null) __obj.updateDynamic("resizable")(resizable)
    if (setIcon != null) __obj.updateDynamic("setIcon")(setIcon)
    if (show != null) __obj.updateDynamic("show")(show)
    if (shrinkWrapDock != null) __obj.updateDynamic("shrinkWrapDock")(shrinkWrapDock)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updateProgress != null) __obj.updateDynamic("updateProgress")(updateProgress)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[IMessageBox]
  }
}

