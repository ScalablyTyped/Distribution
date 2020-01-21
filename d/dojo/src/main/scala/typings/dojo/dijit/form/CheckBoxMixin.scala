package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_CheckBoxMixin.html
  *
  * Mixin to provide widget functionality corresponding to an HTML checkbox
  * User interacts with real html inputs.
  * On onclick (which occurs by mouse click, space-bar, or
  * using the arrow keys to switch the selected radio button),
  * we update the state of the checkbox/radio.
  * 
  */
@JSGlobal("dijit.form._CheckBoxMixin")
@js.native
class CheckBoxMixin () extends js.Object {
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "readOnly".
    * Similar to disabled except readOnly form values are submitted.
    * 
    */
  var readOnly: Boolean = js.native
  /**
    * As an initialization parameter, equivalent to value field on normal checkbox
    * (if checked, the value is passed as the value when form is submitted).
    * 
    */
  var value: String = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
}

