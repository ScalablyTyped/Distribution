package typings.dojo.dojox.form.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_FormMixin.html
  *
  * Form manager's mixin for form-specific functionality.
  * This mixin adds automated "onreset", and "onsubmit" event processing
  * if we are based on a form node, defines onReset(), onSubmit(),
  * reset(), submit(), and isValid() methods like dijit.form.Form.
  * It should be used together with dojox.form.manager.Mixin.
  *
  */
@JSGlobal("dojox.form.manager._FormMixin")
@js.native
class FormMixin () extends js.Object {
  /**
    *
    */
  var accept: String = js.native
  /**
    *
    */
  var `accept-charset`: String = js.native
  /**
    *
    */
  var action: String = js.native
  /**
    *
    */
  var encType: String = js.native
  /**
    *
    */
  var method: String = js.native
  /**
    *
    */
  var name: String = js.native
  /**
    *
    */
  var target: String = js.native
  /**
    * Make sure that every widget that has a validator function returns true.
    *
    */
  def isValid(): Boolean = js.native
  /**
    * Callback when user resets the form. This method is intended
    * to be over-ridden. When the reset method is called
    * programmatically, the return value from onReset is used
    * to compute whether or not resetting should proceed
    *
    */
  def onReset(): Boolean = js.native
  /**
    * Callback when user submits the form. This method is
    * intended to be over-ridden, but by default it checks and
    * returns the validity of form elements. When the submit
    * method is called programmatically, the return value from
    * onSubmit is used to compute whether or not submission
    * should proceed
    *
    */
  def onSubmit(): js.Any = js.native
  /**
    * Resets form widget values.
    *
    */
  def reset(): js.Function = js.native
  /**
    *
    */
  def startup(): Unit = js.native
  /**
    * programmatically submit form if and only if the onSubmit returns true
    *
    */
  def submit(): Unit = js.native
  /**
    * validate() returns if the form is valid - same as isValid -
    * but provides a few additional (ui-specific) features: it
    * will highlight any sub-widgets that are not valid it will
    * call focus() on the first invalid sub-widget
    *
    */
  def validate(): Boolean = js.native
}

