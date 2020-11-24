package typings.extjs.Ext.window

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageBox extends IWindow {
  
  /** [Property] (Number) */
  var CANCEL: js.UndefOr[Double] = js.native
  
  /** [Property] (String) */
  var ERROR: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var INFO: js.UndefOr[String] = js.native
  
  /** [Property] (Number) */
  var NO: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var OK: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var OKCANCEL: js.UndefOr[Double] = js.native
  
  /** [Property] (String) */
  var QUESTION: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var WARNING: js.UndefOr[String] = js.native
  
  /** [Property] (Number) */
  var YES: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var YESNO: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var YESNOCANCEL: js.UndefOr[Double] = js.native
  
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  var alert: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Property] (Object) */
  var buttonText: js.UndefOr[js.Any] = js.native
  
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param fn Function The callback function invoked after the message box is closed. See show method for details.
    * @param scope Object The scope (this reference) in which the callback is executed.
    * @returns Ext.window.MessageBox this
    */
  var confirm: js.UndefOr[
    js.Function4[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  
  /** [Property] (Number) */
  var defaultTextHeight: js.UndefOr[Double] = js.native
  
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_IMessageBox: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Property] (Number) */
  var minProgressWidth: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var minPromptWidth: js.UndefOr[Double] = js.native
  
  /** [Method] Displays a message box with a progress bar
    * @param title String The title bar text
    * @param msg String The message box body text
    * @param progressText String The text to display inside the progress bar
    * @returns Ext.window.MessageBox this
    */
  var progress: js.UndefOr[
    js.Function3[
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* progressText */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  
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
      /* title */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* multiline */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Adds the specified icon to the dialog
    * @param icon String A CSS classname specifying the icon's background image url, or empty string to clear the icon
    * @param width Number The width of the icon. If not specified, the default is used
    * @param height Number The height of the icon. If not specified, the default is used
    * @returns Ext.window.MessageBox this
    */
  @JSName("setIcon")
  var setIcon_IMessageBox: js.UndefOr[
    js.Function3[
      /* icon */ js.UndefOr[String], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Displays a new message box or reinitializes an existing message box based on the config options passed in
    * @param config Object The following config options are supported:
    * @returns Ext.window.MessageBox this
    */
  @JSName("show")
  var show_IMessageBox: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Method] Updates a progress style message box s text and progress bar
    * @param value Number Any number between 0 and 1 (e.g., .5)
    * @param progressText String The progress text to display inside the progress bar.
    * @param msg String The message box's body text is replaced with the specified string (defaults to undefined so that any existing body text will not get overwritten by default unless a new value is passed in)
    * @returns Ext.window.MessageBox this
    */
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Double], 
      /* progressText */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Displays a message box with an infinitely auto updating progress bar
    * @param msg String The message box body text
    * @param title String The title bar text
    * @param config Object A Ext.ProgressBar.wait config object
    * @returns Ext.window.MessageBox this
    */
  @JSName("wait")
  var wait_FIMessageBox: js.UndefOr[
    js.Function3[
      /* msg */ js.UndefOr[String], 
      /* title */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
}
object IMessageBox {
  
  @scala.inline
  def apply(): IMessageBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBox]
  }
  
  @scala.inline
  implicit class IMessageBoxOps[Self <: IMessageBox] (val x: Self) extends AnyVal {
    
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
    def setCANCEL(value: Double): Self = this.set("CANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCANCEL: Self = this.set("CANCEL", js.undefined)
    
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteERROR: Self = this.set("ERROR", js.undefined)
    
    @scala.inline
    def setINFO(value: String): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteINFO: Self = this.set("INFO", js.undefined)
    
    @scala.inline
    def setNO(value: Double): Self = this.set("NO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNO: Self = this.set("NO", js.undefined)
    
    @scala.inline
    def setOK(value: Double): Self = this.set("OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOK: Self = this.set("OK", js.undefined)
    
    @scala.inline
    def setOKCANCEL(value: Double): Self = this.set("OKCANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOKCANCEL: Self = this.set("OKCANCEL", js.undefined)
    
    @scala.inline
    def setQUESTION(value: String): Self = this.set("QUESTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQUESTION: Self = this.set("QUESTION", js.undefined)
    
    @scala.inline
    def setWARNING(value: String): Self = this.set("WARNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWARNING: Self = this.set("WARNING", js.undefined)
    
    @scala.inline
    def setYES(value: Double): Self = this.set("YES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYES: Self = this.set("YES", js.undefined)
    
    @scala.inline
    def setYESNO(value: Double): Self = this.set("YESNO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYESNO: Self = this.set("YESNO", js.undefined)
    
    @scala.inline
    def setYESNOCANCEL(value: Double): Self = this.set("YESNOCANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYESNOCANCEL: Self = this.set("YESNOCANCEL", js.undefined)
    
    @scala.inline
    def setAlert(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = this.set("alert", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setButtonText(value: js.Any): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setConfirm(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = this.set("confirm", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setDefaultTextHeight(value: Double): Self = this.set("defaultTextHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTextHeight: Self = this.set("defaultTextHeight", js.undefined)
    
    @scala.inline
    def setHide(value: () => IComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setMinProgressWidth(value: Double): Self = this.set("minProgressWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProgressWidth: Self = this.set("minProgressWidth", js.undefined)
    
    @scala.inline
    def setMinPromptWidth(value: Double): Self = this.set("minPromptWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPromptWidth: Self = this.set("minPromptWidth", js.undefined)
    
    @scala.inline
    def setProgress(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* progressText */ js.UndefOr[String]) => IMessageBox
    ): Self = this.set("progress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setPrompt(
      value: (/* title */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* multiline */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IMessageBox
    ): Self = this.set("prompt", js.Any.fromFunction6(value))
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setSetIcon(
      value: (/* icon */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => IMessageBox
    ): Self = this.set("setIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    
    @scala.inline
    def setShow(value: /* config */ js.UndefOr[js.Any] => IMessageBox): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setUpdateProgress(
      value: (/* value */ js.UndefOr[Double], /* progressText */ js.UndefOr[String], /* msg */ js.UndefOr[String]) => IMessageBox
    ): Self = this.set("updateProgress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUpdateProgress: Self = this.set("updateProgress", js.undefined)
    
    @scala.inline
    def setWait(
      value: (/* msg */ js.UndefOr[String], /* title */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => IMessageBox
    ): Self = this.set("wait", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
