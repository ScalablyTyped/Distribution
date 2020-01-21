package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.constraints
import typings.dojo.dojoStrings.invalidMessage
import typings.dojo.dojoStrings.isValid
import typings.dojo.dojoStrings.message
import typings.dojo.dojoStrings.missingMessage
import typings.dojo.dojoStrings.pattern
import typings.dojo.dojoStrings.promptMessage
import typings.dojo.dojoStrings.regExp
import typings.dojo.dojoStrings.required
import typings.dojo.dojoStrings.state
import typings.dojo.dojoStrings.tooltipPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/ValidationTextBox.html
  *
  * Base class for textbox widgets with the ability to validate content of various types and provide user feedback.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.ValidationTextBox")
@js.native
class ValidationTextBox () extends TextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * user-defined object needed to pass parameters to the validator functions
    * 
    */
  var constraints: js.Object = js.native
  /**
    * The message to display if value is invalid.
    * The translated string value is read from the message file by default.
    * Set to "" to use the promptMessage instead.
    * 
    */
  var invalidMessage: String = js.native
  /**
    * Currently error/prompt message.
    * When using the default tooltip implementation, this will only be
    * displayed when the field is focused.
    * 
    */
  var message: String = js.native
  /**
    * The message to display if value is empty and the field is required.
    * The translated string value is read from the message file by default.
    * Set to "" to use the invalidMessage instead.
    * 
    */
  var missingMessage: String = js.native
  /**
    * This defines the regular expression used to validate the input.
    * Do not add leading ^ or $ characters since the widget adds these.
    * A function may be used to generate a valid pattern when dependent on constraints or other runtime factors.
    * set('pattern', String|Function).
    * 
    */
  var pattern: String = js.native
  /**
    * If defined, display this hint string immediately on focus to the textbox, if empty.
    * Also displays if the textbox value is Incomplete (not yet valid but will be with additional input).
    * Think of this like a tooltip that tells the user what to do, not an error message
    * that tells the user what they've done wrong.
    * 
    * Message disappears when user starts typing.
    * 
    */
  var promptMessage: String = js.native
  /**
    * 
    */
  var regExp: String = js.native
  /**
    * User is required to enter data into this field.
    * 
    */
  var required: Boolean = js.native
  /**
    * Shows current state (ie, validation result) of input (""=Normal, Incomplete, or Error)
    * 
    */
  var state: String = js.native
  /**
    * See description of dijit/Tooltip.defaultPosition for details on this parameter.
    * 
    */
  var tooltipPosition: js.Object = js.native
  /**
    * Overridable method to display validation errors/hints.
    * By default uses a tooltip.
    * 
    * @param message             
    */
  def displayMessage(message: String): Unit = js.native
  /**
    * Return an error message to show if appropriate
    * 
    * @param isFocused             
    */
  def getErrorMessage(isFocused: Boolean): js.Any = js.native
  /**
    * Return a hint message to show when widget is first focused
    * 
    * @param isFocused             
    */
  def getPromptMessage(isFocused: Boolean): js.Any = js.native
  @JSName("get")
  def get_constraints(property: constraints): js.Object = js.native
  @JSName("get")
  def get_invalidMessage(property: invalidMessage): String = js.native
  @JSName("get")
  def get_isValid(property: isValid): js.Any = js.native
  @JSName("get")
  def get_message(property: message): String = js.native
  @JSName("get")
  def get_missingMessage(property: missingMessage): String = js.native
  @JSName("get")
  def get_pattern(property: pattern): String = js.native
  @JSName("get")
  def get_promptMessage(property: promptMessage): String = js.native
  @JSName("get")
  def get_regExp(property: regExp): String = js.native
  @JSName("get")
  def get_required(property: required): Boolean = js.native
  @JSName("get")
  def get_state(property: state): String = js.native
  @JSName("get")
  def get_tooltipPosition(property: tooltipPosition): js.Object = js.native
  /**
    * Deprecated.  Use set('pattern', Function) instead.
    * 
    * @param constraints An object with the following properties:locale (String): locale used for validation, picks up value from this widget's lang attribute_flags_ (anything): various flags passed to pattern function            
    */
  def regExpGen(constraints: js.Object): Unit = js.native
  @JSName("set")
  def set_constraints(property: constraints, value: js.Object): Unit = js.native
  @JSName("set")
  def set_invalidMessage(property: invalidMessage, value: String): Unit = js.native
  @JSName("set")
  def set_isValid(property: isValid, value: js.Any): Unit = js.native
  @JSName("set")
  def set_message(property: message, value: String): Unit = js.native
  @JSName("set")
  def set_missingMessage(property: missingMessage, value: String): Unit = js.native
  @JSName("set")
  def set_pattern(property: pattern, value: String): Unit = js.native
  @JSName("set")
  def set_promptMessage(property: promptMessage, value: String): Unit = js.native
  @JSName("set")
  def set_regExp(property: regExp, value: String): Unit = js.native
  @JSName("set")
  def set_required(property: required, value: Boolean): Unit = js.native
  @JSName("set")
  def set_state(property: state, value: String): Unit = js.native
  @JSName("set")
  def set_tooltipPosition(property: tooltipPosition, value: js.Object): Unit = js.native
  /**
    * Called by oninit, onblur, and onkeypress.
    * Show missing or invalid messages if appropriate, and highlight textbox field.
    * 
    * @param isFocused             
    */
  def validate(isFocused: Boolean): js.Any = js.native
  /**
    * Overridable function used to validate the text input against the regular expression.
    * 
    * @param value             
    * @param constraints An object with the following properties:locale (String): locale used for validation, picks up value from this widget's lang attribute_flags_ (anything): various flags passed to pattern function            
    */
  def validator(value: js.Any, constraints: js.Object): js.Any = js.native
  @JSName("watch")
  def watch_constraints(
    property: constraints,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_invalidMessage(
    property: invalidMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isValid(
    property: isValid,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_message(
    property: message,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_missingMessage(
    property: missingMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_pattern(
    property: pattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_promptMessage(
    property: promptMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_regExp(
    property: regExp,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_required(
    property: required,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_state(
    property: state,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tooltipPosition(
    property: tooltipPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

