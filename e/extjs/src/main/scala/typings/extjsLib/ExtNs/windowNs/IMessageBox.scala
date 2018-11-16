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

