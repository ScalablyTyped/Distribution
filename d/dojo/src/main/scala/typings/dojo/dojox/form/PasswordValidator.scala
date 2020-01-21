package typings.dojo.dojox.form

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.form.FormValueWidget
import typings.dojo.dojoStrings.oldName
import typings.dojo.dojoStrings.required
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/PasswordValidator.html
  *
  * A password validation widget that simplifies the "old/new/verify"
  * style of requesting passwords.  You will probably want to override
  * this class and implement your own pwCheck function.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.PasswordValidator")
@js.native
class PasswordValidator () extends FormValueWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The name to send our old password as (when form is posted)
    *
    */
  var oldName: js.Object = js.native
  /**
    * Whether or not it is required for form submission
    *
    */
  var required: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  @JSName("value")
  var value_PasswordValidator: String = js.native
  @JSName("get")
  def get_oldName(property: oldName): js.Object = js.native
  @JSName("get")
  def get_required(property: required): Boolean = js.native
  /**
    * we are valid if ALL our children are valid
    *
    * @param isFocused
    */
  @JSName("isValid")
  def isValid_MPasswordValidator(isFocused: Boolean): js.Any = js.native
  /**
    * Overridable function for validation of the old password box.
    *
    * This function is called and passed the old password.  Return
    * true if it's OK to continue, and false if it is not.
    *
    * IMPORTANT SECURITY NOTE:  Do NOT EVER EVER EVER check this in
    * HTML or JavaScript!!!
    *
    * You will probably want to override this function to callback
    * to a server to verify the password (the callback will need to
    * be synchronous) - and it's probably a good idea to validate
    * it again on form submission before actually doing
    * anything destructive - that's why the "oldName" value
    * is available.
    *
    * And don't just fetch the password from the server
    * either :)  Send the test password (probably hashed, for
    * security) and return from the server a status instead.
    *
    * Again - DON'T BE INSECURE!!!  Security is left as an exercise
    * for the reader :)
    *
    * @param password
    */
  def pwCheck(password: String): Boolean = js.native
  @JSName("set")
  def set_oldName(property: oldName, value: js.Object): Unit = js.native
  @JSName("set")
  def set_required(property: required, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  /**
    * Validating this widget validates all our children
    *
    * @param isFocused
    */
  def validate(isFocused: Boolean): js.Any = js.native
  @JSName("watch")
  def watch_oldName(
    property: oldName,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
}

