package typings.dojo.dijit.form

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_ButtonMixin.html
  *
  * 
  */
@JSGlobal("dijit.form._ButtonMixin")
@js.native
class ButtonMixin () extends js.Object {
  /**
    * Content to display in button.
    * 
    */
  var label: String = js.native
  /**
    * Type of button (submit, reset, button, checkbox, radio)
    * 
    */
  var `type`: String = js.native
  /**
    * Callback for when button is clicked.
    * If type="submit", return true to perform submit, or false to cancel it.
    * 
    * @param e             
    */
  def onClick(e: Event_): Boolean = js.native
  /**
    * 
    */
  def postCreate(): Unit = js.native
}

