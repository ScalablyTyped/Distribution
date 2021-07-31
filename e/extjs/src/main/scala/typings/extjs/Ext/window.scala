package typings.extjs.Ext

import typings.extjs.Ext.util.IComponentDragger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object window {
  
  trait IMessageBox
    extends StObject
       with typings.extjs.Ext.window.IWindow {
    
    /** [Property] (Number) */
    var CANCEL: js.UndefOr[Double] = js.undefined
    
    /** [Property] (String) */
    var ERROR: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (String) */
    var INFO: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Number) */
    var NO: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var OK: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var OKCANCEL: js.UndefOr[Double] = js.undefined
    
    /** [Property] (String) */
    var QUESTION: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (String) */
    var WARNING: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Number) */
    var YES: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var YESNO: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var YESNOCANCEL: js.UndefOr[Double] = js.undefined
    
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
    var defaultTextHeight: js.UndefOr[Double] = js.undefined
    
    /** [Method] Hides this Component setting it to invisible using the configured hideMode
      * @returns Ext.Component this
      */
    @JSName("hide")
    var hide_IMessageBox: js.UndefOr[js.Function0[IComponent]] = js.undefined
    
    /** [Property] (Number) */
    var minProgressWidth: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var minPromptWidth: js.UndefOr[Double] = js.undefined
    
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
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
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
          /* value */ js.UndefOr[Double], 
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
    def apply(): typings.extjs.Ext.window.IMessageBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.window.IMessageBox]
    }
    
    @scala.inline
    implicit class IMessageBoxMutableBuilder[Self <: typings.extjs.Ext.window.IMessageBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(
        value: (/* title */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "alert", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setButtonText(value: js.Any): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCANCEL(value: Double): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCANCELUndefined: Self = StObject.set(x, "CANCEL", js.undefined)
      
      @scala.inline
      def setConfirm(
        value: (/* title */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "confirm", js.Any.fromFunction4(value))
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setDefaultTextHeight(value: Double): Self = StObject.set(x, "defaultTextHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTextHeightUndefined: Self = StObject.set(x, "defaultTextHeight", js.undefined)
      
      @scala.inline
      def setERROR(value: java.lang.String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERRORUndefined: Self = StObject.set(x, "ERROR", js.undefined)
      
      @scala.inline
      def setHide(value: () => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setINFO(value: java.lang.String): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFOUndefined: Self = StObject.set(x, "INFO", js.undefined)
      
      @scala.inline
      def setMinProgressWidth(value: Double): Self = StObject.set(x, "minProgressWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinProgressWidthUndefined: Self = StObject.set(x, "minProgressWidth", js.undefined)
      
      @scala.inline
      def setMinPromptWidth(value: Double): Self = StObject.set(x, "minPromptWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPromptWidthUndefined: Self = StObject.set(x, "minPromptWidth", js.undefined)
      
      @scala.inline
      def setNO(value: Double): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOUndefined: Self = StObject.set(x, "NO", js.undefined)
      
      @scala.inline
      def setOK(value: Double): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOKCANCEL(value: Double): Self = StObject.set(x, "OKCANCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOKCANCELUndefined: Self = StObject.set(x, "OKCANCEL", js.undefined)
      
      @scala.inline
      def setOKUndefined: Self = StObject.set(x, "OK", js.undefined)
      
      @scala.inline
      def setProgress(
        value: (/* title */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String], /* progressText */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "progress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setPrompt(
        value: (/* title */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* multiline */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "prompt", js.Any.fromFunction6(value))
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setQUESTION(value: java.lang.String): Self = StObject.set(x, "QUESTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUESTIONUndefined: Self = StObject.set(x, "QUESTION", js.undefined)
      
      @scala.inline
      def setSetIcon(
        value: (/* icon */ js.UndefOr[java.lang.String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "setIcon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetIconUndefined: Self = StObject.set(x, "setIcon", js.undefined)
      
      @scala.inline
      def setShow(value: /* config */ js.UndefOr[js.Any] => typings.extjs.Ext.window.IMessageBox): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setUpdateProgress(
        value: (/* value */ js.UndefOr[Double], /* progressText */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "updateProgress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateProgressUndefined: Self = StObject.set(x, "updateProgress", js.undefined)
      
      @scala.inline
      def setWARNING(value: java.lang.String): Self = StObject.set(x, "WARNING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARNINGUndefined: Self = StObject.set(x, "WARNING", js.undefined)
      
      @scala.inline
      def setWait_(
        value: (/* msg */ js.UndefOr[java.lang.String], /* title */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any]) => typings.extjs.Ext.window.IMessageBox
      ): Self = StObject.set(x, "wait", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
      
      @scala.inline
      def setYES(value: Double): Self = StObject.set(x, "YES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYESNO(value: Double): Self = StObject.set(x, "YESNO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYESNOCANCEL(value: Double): Self = StObject.set(x, "YESNOCANCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYESNOCANCELUndefined: Self = StObject.set(x, "YESNOCANCEL", js.undefined)
      
      @scala.inline
      def setYESNOUndefined: Self = StObject.set(x, "YESNO", js.undefined)
      
      @scala.inline
      def setYESUndefined: Self = StObject.set(x, "YES", js.undefined)
    }
  }
  
  trait IWindow
    extends StObject
       with typings.extjs.Ext.panel.IPanel {
    
    /** [Method] Invoked after the Panel is Collapsed  */
    @JSName("afterCollapse")
    var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Invoked after the Panel is Expanded  */
    @JSName("afterExpand")
    var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String/Ext.Element) */
    var animateTarget: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Applies the state to the object
      * @param state Object
      */
    @JSName("applyState")
    var applyState_IWindow: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    @JSName("autoRender")
    var autoRender_IWindow: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Ext.util.ComponentDragger) */
    @JSName("dd")
    var dd_IWindow: js.UndefOr[IComponentDragger] = js.undefined
    
    /** [Config Option] (String/Number/Ext.Component) */
    var defaultFocus: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var expandOnShow: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Gets the configured default focus item  */
    var getDefaultFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean/Function) */
    var ghost: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var hideShadowOnDeactivate: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var isWindow: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
      * @param animate Boolean true to animate this Window to full size.
      * @returns Ext.window.Window this
      */
    var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var maximized: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var minimizable: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Placeholder method for minimizing the window
      * @returns Ext.window.Window this
      */
    var minimize: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var modal: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Function) */
    var onEsc: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var plain: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
      * @param animate Object
      * @returns Ext.window.Window this
      */
    var restore: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.undefined
    
    /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
      * @returns Ext.window.Window this
      */
    var toggleMaximize: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (Number) */
    var x: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var y: js.UndefOr[Double] = js.undefined
  }
  object IWindow {
    
    @scala.inline
    def apply(): typings.extjs.Ext.window.IWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.window.IWindow]
    }
    
    @scala.inline
    implicit class IWindowMutableBuilder[Self <: typings.extjs.Ext.window.IWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCollapse(value: () => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
      
      @scala.inline
      def setAfterExpand(value: () => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
      
      @scala.inline
      def setAnimateTarget(value: js.Any): Self = StObject.set(x, "animateTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateTargetUndefined: Self = StObject.set(x, "animateTarget", js.undefined)
      
      @scala.inline
      def setApplyState(value: /* state */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "applyState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyStateUndefined: Self = StObject.set(x, "applyState", js.undefined)
      
      @scala.inline
      def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
      
      @scala.inline
      def setDd(value: IComponentDragger): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      @scala.inline
      def setDefaultFocus(value: js.Any): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      @scala.inline
      def setExpandOnShow(value: Boolean): Self = StObject.set(x, "expandOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnShowUndefined: Self = StObject.set(x, "expandOnShow", js.undefined)
      
      @scala.inline
      def setGetDefaultFocus(value: () => Unit): Self = StObject.set(x, "getDefaultFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultFocusUndefined: Self = StObject.set(x, "getDefaultFocus", js.undefined)
      
      @scala.inline
      def setGhost(value: js.Any): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      @scala.inline
      def setHideShadowOnDeactivate(value: Boolean): Self = StObject.set(x, "hideShadowOnDeactivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideShadowOnDeactivateUndefined: Self = StObject.set(x, "hideShadowOnDeactivate", js.undefined)
      
      @scala.inline
      def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindowUndefined: Self = StObject.set(x, "isWindow", js.undefined)
      
      @scala.inline
      def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      @scala.inline
      def setMaximize(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.window.IWindow): Self = StObject.set(x, "maximize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
      
      @scala.inline
      def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      @scala.inline
      def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      @scala.inline
      def setMinimize(value: () => typings.extjs.Ext.window.IWindow): Self = StObject.set(x, "minimize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnEsc(value: js.Any): Self = StObject.set(x, "onEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setRestore(value: /* animate */ js.UndefOr[js.Any] => typings.extjs.Ext.window.IWindow): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      @scala.inline
      def setToggleMaximize(value: () => typings.extjs.Ext.window.IWindow): Self = StObject.set(x, "toggleMaximize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleMaximizeUndefined: Self = StObject.set(x, "toggleMaximize", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
