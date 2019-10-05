package typings.dojo.dijit.form

import typings.dojo.Fn_Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormMixin.html
  *
  * Mixin for containers of form widgets (i.e. widgets that represent a single value
  * and can be children of a <form> node or dijit/form/Form widget)
  * Can extract all the form widgets
  * values and combine them into a single javascript object, or alternately
  * take such an object and set the values for all the contained
  * form widgets
  * 
  */
@JSGlobal("dijit.form._FormMixin")
@js.native
class _FormMixin () extends js.Object {
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  var isValid_Original: Fn_Boolean = js.native
  /**
    * Will be "Error" if one or more of the child widgets has an invalid value,
    * "Incomplete" if not all of the required child widgets are filled in.  Otherwise, "",
    * which indicates that the form is ready to be submitted.
    * 
    */
  var state: String = js.native
  /**
    * You can call this function directly, ex. in the event that you
    * programmatically add a widget to the form after the form has been
    * initialized.
    * 
    * @param inStartup             
    */
  def connectChildren(inStartup: Boolean): Unit = js.native
  /**
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Deprecated method.   Applications no longer need to call this.   Remove for 2.0.
    * 
    */
  def disconnectChildren(): Unit = js.native
  /**
    * 
    */
  def getValues(): js.Any = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  def isValid(): Boolean = js.native
  /**
    * Stub function to connect to if you want to do something
    * (like disable/enable a submit button) when the valid
    * state changes on the form as a whole.
    * 
    * Deprecated.  Will be removed in 2.0.  Use watch("state", ...) instead.
    * 
    * @param isValid             
    */
  def onValidStateChange(isValid: Boolean): Unit = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
  /**
    * 
    * @param val             
    */
  def setValues(`val`: js.Any): js.Any = js.native
  /**
    * 
    */
  def startup(): Unit = js.native
  /**
    * returns if the form is valid - same as isValid - but
    * provides a few additional (ui-specific) features:
    * 
    * it will highlight any sub-widgets that are not valid
    * it will call focus() on the first invalid sub-widget
    * 
    */
  def validate(): js.Any = js.native
}

