package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.form._FormValueWidget
import typings.dojo.dojoStrings.constraints
import typings.dojo.dojoStrings.delimiter
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.easingIn
import typings.dojo.dojoStrings.easingOut
import typings.dojo.dojoStrings.inputClass
import typings.dojo.dojoStrings.inputHandler
import typings.dojo.dojoStrings.inputProperties
import typings.dojo.dojoStrings.maxItems
import typings.dojo.dojoStrings.readOnlyInput
import typings.dojo.dojoStrings.readOnlyItem
import typings.dojo.dojoStrings.regExp
import typings.dojo.dojoStrings.showCloseButtonWhenInvalid
import typings.dojo.dojoStrings.showCloseButtonWhenValid
import typings.dojo.dojoStrings.submitOnlyValidValue
import typings.dojo.dojoStrings.useAnim
import typings.dojo.dojoStrings.useArrowForEdit
import typings.dojo.dojoStrings.useOnBlur
import typings.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/ListInput.html
  *
  * An automatic list maker
  * you can add value to list with add method.
  * you can only remove by clicking close button
  *
  */
@JSGlobal("dojox.form.ListInput")
@js.native
class ListInput () extends _FormValueWidget {
  /**
    * user-defined object needed to pass parameters to the validator functions
    *
    */
  var constraints: js.Object = js.native
  /**
    * delimiter for the string. Every match will be splitted.
    * The string can contain only one delimiter.
    *
    */
  var delimiter: String = js.native
  /**
    * Animation duration
    *
    */
  var duration: Double = js.native
  /**
    * function used to easing on fadeIn end
    *
    */
  var easingIn: js.Function = js.native
  /**
    * function used to easing on fadeOut end
    *
    */
  var easingOut: js.Function = js.native
  /**
    * Class which will be used to create the input box. You can implements yours.
    * It must be a widget, focusNode or domNode must have "onkeydown" event
    * It must have .attr("value") to get value
    * It also must implement an (or more) handler for the "onChange" method
    *
    */
  var inputClass: String = js.native
  /**
    * The widget will connect on all handler to check input value
    * You can use comma separated list
    *
    */
  var inputHandler: String = js.native
  /**
    * Properties used to create input box
    * If String, it must be a valid JSON
    *
    */
  var inputProperties: String = js.native
  /**
    * Specify max item the list can have
    * null = infinity
    *
    */
  var maxItems: Double = js.native
  /**
    * if false, the list will be editable
    * Can only be set when instantiate
    *
    */
  var readOnlyInput: Boolean = js.native
  /**
    * If true, items can be edited
    * Can only be set when instantiate
    *
    */
  var readOnlyItem: Boolean = js.native
  /**
    * regular expression string used to validate the input
    * Do not specify both regExp and regExpGen
    *
    */
  var regExp: String = js.native
  /**
    * if true, a close button will be added on invalid item
    *
    */
  var showCloseButtonWhenInvalid: Boolean = js.native
  /**
    * if true, a close button will be added on valid item
    *
    */
  var showCloseButtonWhenValid: Boolean = js.native
  /**
    * If true, only valid value will be submitted with form
    *
    */
  var submitOnlyValidValue: Boolean = js.native
  /**
    * If true, then item will use an animation to show hide itself
    *
    */
  var useAnim: Boolean = js.native
  /**
    * If true, arraow left and right can be used for editing
    * Can only be set when instantiate
    *
    */
  var useArrowForEdit: Boolean = js.native
  /**
    * If true, onBlur event do a validate (like pressing ENTER)
    *
    */
  var useOnBlur: Boolean = js.native
  /**
    *
    */
  @JSName("value")
  var value_ListInput: String = js.native
  /**
    * Create new list element
    *
    * @param values
    */
  def add(values: String): Unit = js.native
  /**
    * Create new list element
    *
    * @param values
    */
  def add(values: js.Array[_]): Unit = js.native
  /**
    * Compare 2 values (as returned by attr('value') for this widget).
    *
    * @param val1
    * @param val2
    */
  def compare(val1: js.Array[_], val2: js.Array[_]): Double = js.native
  @JSName("get")
  def get_constraints(property: constraints): js.Object = js.native
  @JSName("get")
  def get_delimiter(property: delimiter): String = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_easingIn(property: easingIn): js.Function = js.native
  @JSName("get")
  def get_easingOut(property: easingOut): js.Function = js.native
  @JSName("get")
  def get_inputClass(property: inputClass): String = js.native
  @JSName("get")
  def get_inputHandler(property: inputHandler): String = js.native
  @JSName("get")
  def get_inputProperties(property: inputProperties): String = js.native
  @JSName("get")
  def get_maxItems(property: maxItems): Double = js.native
  @JSName("get")
  def get_readOnlyInput(property: readOnlyInput): Boolean = js.native
  @JSName("get")
  def get_readOnlyItem(property: readOnlyItem): Boolean = js.native
  @JSName("get")
  def get_regExp(property: regExp): String = js.native
  @JSName("get")
  def get_showCloseButtonWhenInvalid(property: showCloseButtonWhenInvalid): Boolean = js.native
  @JSName("get")
  def get_showCloseButtonWhenValid(property: showCloseButtonWhenValid): Boolean = js.native
  @JSName("get")
  def get_submitOnlyValidValue(property: submitOnlyValidValue): Boolean = js.native
  @JSName("get")
  def get_useAnim(property: useAnim): Boolean = js.native
  @JSName("get")
  def get_useArrowForEdit(property: useArrowForEdit): Boolean = js.native
  @JSName("get")
  def get_useOnBlur(property: useOnBlur): Boolean = js.native
  /**
    * Overridable function used to generate regExp when dependent on constraints.
    * Do not specify both regExp and regExpGen.
    *
    * @param constraints An object with the following properties:locale (String): locale used for validation, picks up value from this widget's lang attribute_flags_ (anything): various flags passed to pattern function
    */
  def regExpGen(constraints: js.Object): js.Any = js.native
  @JSName("set")
  def set_constraints(property: constraints, value: js.Object): Unit = js.native
  @JSName("set")
  def set_delimiter(property: delimiter, value: String): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_easingIn(property: easingIn, value: js.Function): Unit = js.native
  @JSName("set")
  def set_easingOut(property: easingOut, value: js.Function): Unit = js.native
  @JSName("set")
  def set_inputClass(property: inputClass, value: String): Unit = js.native
  @JSName("set")
  def set_inputHandler(property: inputHandler, value: String): Unit = js.native
  @JSName("set")
  def set_inputProperties(property: inputProperties, value: String): Unit = js.native
  @JSName("set")
  def set_maxItems(property: maxItems, value: Double): Unit = js.native
  @JSName("set")
  def set_readOnlyInput(property: readOnlyInput, value: Boolean): Unit = js.native
  @JSName("set")
  def set_readOnlyItem(property: readOnlyItem, value: Boolean): Unit = js.native
  @JSName("set")
  def set_regExp(property: regExp, value: String): Unit = js.native
  @JSName("set")
  def set_showCloseButtonWhenInvalid(property: showCloseButtonWhenInvalid, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showCloseButtonWhenValid(property: showCloseButtonWhenValid, value: Boolean): Unit = js.native
  @JSName("set")
  def set_submitOnlyValidValue(property: submitOnlyValidValue, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useAnim(property: useAnim, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useArrowForEdit(property: useArrowForEdit, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useOnBlur(property: useOnBlur, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_constraints(
    property: constraints,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_delimiter(
    property: delimiter,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_easingIn(
    property: easingIn,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_easingOut(
    property: easingOut,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_inputClass(
    property: inputClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_inputHandler(
    property: inputHandler,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_inputProperties(
    property: inputProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxItems(
    property: maxItems,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readOnlyInput(
    property: readOnlyInput,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readOnlyItem(
    property: readOnlyItem,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_regExp(
    property: regExp,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showCloseButtonWhenInvalid(
    property: showCloseButtonWhenInvalid,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showCloseButtonWhenValid(
    property: showCloseButtonWhenValid,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_submitOnlyValidValue(
    property: submitOnlyValidValue,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useAnim(
    property: useAnim,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useArrowForEdit(
    property: useArrowForEdit,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useOnBlur(
    property: useOnBlur,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

