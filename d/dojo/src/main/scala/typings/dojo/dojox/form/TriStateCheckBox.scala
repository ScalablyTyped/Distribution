package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.form.Button
import typings.dojo.dojoStrings.checked
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.stateValue
import typings.dojo.dojoStrings.states
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/TriStateCheckBox.html
  *
  * Checkbox with three states
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ToggleButtonMixin because Inheritance from two classes. Inlined checked, postCreate, reset */ @JSGlobal("dojox.form.TriStateCheckBox")
@js.native
class TriStateCheckBox () extends Button {
  /**
    * Current check state of the check box.
    *
    */
  var checked: Boolean = js.native
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "readOnly".
    * Similar to disabled except readOnly form values are submitted.
    *
    */
  var readOnly: Boolean = js.native
  /**
    *
    */
  var stateValue: js.Object = js.native
  /**
    * States of TriStateCheckBox.
    * The value of This.checked should be one of these three states:
    * [false, true, "mixed"]
    *
    */
  var states: js.Array[_] = js.native
  /**
    * Emulate a click on the check box, but will not trigger the
    * onClick method.
    *
    */
  def click(): Unit = js.native
  /**
    * Fix _currentState property if it's out of bound.
    *
    */
  def fixState(): Unit = js.native
  @JSName("get")
  def get_checked(property: checked): Boolean = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_stateValue(property: stateValue): js.Object = js.native
  @JSName("get")
  def get_states(property: states): js.Array[_] = js.native
  /**
    *
    */
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  /**
    * Deprecated.  Use set('checked', true/false) instead.
    *
    * @param checked
    */
  def setChecked(checked: String): Unit = js.native
  /**
    * Deprecated.  Use set('checked', true/false) instead.
    *
    * @param checked
    */
  def setChecked(checked: Boolean): Unit = js.native
  @JSName("set")
  def set_checked(property: checked, value: Boolean): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_stateValue(property: stateValue, value: js.Object): Unit = js.native
  @JSName("set")
  def set_states(property: states, value: js.Array[_]): Unit = js.native
  @JSName("watch")
  def watch_checked(
    property: checked,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_stateValue(
    property: stateValue,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_states(
    property: states,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

