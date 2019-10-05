package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_DialogMixin.html
  *
  * This provides functions useful to Dialog and TooltipDialog
  * 
  */
@JSGlobal("dijit._DialogMixin")
@js.native
class _DialogMixin () extends js.Object {
  /**
    * Callback when the user hits the submit button.
    * Override this method to handle Dialog execution.
    * After the user has pressed the submit button, the Dialog
    * first calls onExecute() to notify the container to hide the
    * dialog and restore focus to wherever it used to be.
    * 
    * Then this method is called.
    * 
    * @param formContents             
    */
  def execute(formContents: js.Object): Unit = js.native
  /**
    * Called when user has pressed the Dialog's cancel button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    * 
    */
  def onCancel(): Unit = js.native
  /**
    * Called when user has pressed the dialog's OK button, to notify container.
    * Developer shouldn't override or connect to this method;
    * it's a private communication device between the TooltipDialog
    * and the thing that opened it (ex: dijit/form/DropDownButton)
    * 
    */
  def onExecute(): Unit = js.native
}

