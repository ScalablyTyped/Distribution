package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_ToggleButtonMixin.html
  *
  * A mixin to provide functionality to allow a button that can be in two states (checked or not).
  * 
  */
@JSGlobal("dijit.form._ToggleButtonMixin")
@js.native
class _ToggleButtonMixin () extends js.Object {
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * In markup, specified as "checked='checked'" or just "checked".
    * True if the button is depressed, or the checkbox is checked,
    * or the radio button is selected, etc.
    * 
    */
  var checked: Boolean = js.native
  /**
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
}

