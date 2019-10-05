package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_IsFocused
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dojoStrings.editOptions
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.html
  *
  * A TextBox for entering numbers, with formatting and range checking
  * NumberTextBox is a textbox for entering and displaying numbers, supporting
  * the following main features:
  * 
  * Enforce minimum/maximum allowed values (as well as enforcing that the user types
  *  a number rather than a random string)
  * NLS support (altering roles of comma and dot as "thousands-separator" and "decimal-point"
  *  depending on locale).
  * Separate modes for editing the value and displaying it, specifically that
  *  the thousands separator character (typically comma) disappears when editing
  *  but reappears after the field is blurred.
  * Formatting and constraints regarding the number of places (digits after the decimal point)
  *  allowed on input, and number of places displayed when blurred (see constraints parameter).
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.NumberTextBox")
@js.native
class NumberTextBox () extends RangeBoundTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Properties to mix into constraints when the value is being edited.
    * This is here because we edit the number in the format "12345", which is
    * different than the display value (ex: "12,345")
    * 
    */
  var editOptions: js.Object = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_NumberTextBox: String = js.native
  /**
    * 
    */
  def Mixin(): Unit = js.native
  @JSName("get")
  def get_editOptions(property: editOptions): js.Object = js.native
  @JSName("set")
  def set_editOptions(property: editOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_editOptions(property: editOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

@JSGlobal("dijit.form.NumberTextBox")
@js.native
object NumberTextBox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.Mixin.html
    *
    * A mixin for all number textboxes
    * 
    */
  @js.native
  class Mixin () extends js.Object {
    /**
      * Despite the name, this parameter specifies both constraints on the input
      * (including minimum/maximum allowed values) as well as
      * formatting options like places (the number of digits to display after
      * the decimal point).
      * 
      */
    var constraints: js.Object = js.native
    /**
      * Properties to mix into constraints when the value is being edited.
      * This is here because we edit the number in the format "12345", which is
      * different than the display value (ex: "12,345")
      * 
      */
    var editOptions: js.Object = js.native
    /**
      * 
      * @param isFocused             
      */
    @JSName("isValid")
    var isValid_Original: Fn_IsFocused = js.native
    /**
      * The value of this NumberTextBox as a Javascript Number (i.e., not a String).
      * If the displayed value is blank, the value is NaN, and if the user types in
      * an gibberish value (like "hello world"), the value is undefined
      * (i.e. get('value') returns undefined).
      * 
      * Symmetrically, set('value', NaN) will clear the displayed value,
      * whereas set('value', undefined) will have no effect.
      * 
      */
    var value: Double = js.native
    /**
      * This is called with both the display value (string), and the actual value (a number).
      * When called with the actual value it does corrections so that '' etc. are represented as NaN.
      * Otherwise it dispatches to the superclass's filter() method.
      * 
      * See dijit/form/TextBox.filter() for more details.
      * 
      * @param value             
      */
    def filter(value: Double): Double = js.native
    /**
      * Formats the value as a Number, according to constraints.
      * 
      * @param value             
      * @param constraints An object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.  Literal characters in patterns are not supported.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.places (Number, optional): fixed number of decimal places to show.  This overrides anyinformation in the provided pattern.round (Number, optional): 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1means do not round.locale (String, optional): override the locale used to determine formatting rulesfractional (Boolean, optional): If false, show no decimal places, overriding places and pattern settings.            
      */
    def format(value: Double, constraints: js.Object): js.Any = js.native
    /**
      * 
      * @param isFocused             
      */
    def isValid(isFocused: Boolean): js.Any = js.native
    /**
      * Replaceable function to convert a formatted string to a number value
      * 
      * @param value             
      * @param constraints An object with the following properties:pattern (String, optional): override formatting patternwith this string.  Default value is based on locale.  Overriding this property will defeatlocalization.  Literal characters in patterns are not supported.type (String, optional): choose a format type based on the locale from the following:decimal, scientific (not yet supported), percent, currency. decimal by default.places (Number, optional): fixed number of decimal places to show.  This overrides anyinformation in the provided pattern.round (Number, optional): 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1means do not round.locale (String, optional): override the locale used to determine formatting rulesfractional (Boolean, optional): If false, show no decimal places, overriding places and pattern settings.            
      */
    def parse(value: String, constraints: js.Object): js.Any = js.native
    /**
      * 
      * @param constraints             
      */
    def pattern(constraints: js.Any): String = js.native
    /**
      * 
      */
    def postMixInProperties(): Unit = js.native
    /**
      * Convert value (a Number) into a canonical string (ie, how the number literal is written in javascript/java/C/etc.)
      * 
      * @param value             
      * @param options               Optional            
      */
    def serialize(value: Double, options: js.Object): String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.__Constraints.html
    *
    * Specifies both the rules on valid/invalid values (minimum, maximum,
    * number of required decimal places), and also formatting options for
    * displaying the value when the field is not focused.
    * 
    */
  @js.native
  class __Constraints () extends js.Object {
    /**
      * If false, show no decimal places, overriding places and pattern settings.
      * 
      */
    var fractional: Boolean = js.native
    /**
      * override the locale used to determine formatting rules
      * 
      */
    var locale: String = js.native
    /**
      * Maximum signed value.  Default is +Infinity
      * 
      */
    var max: Double = js.native
    /**
      * Minimum signed value.  Default is -Infinity
      * 
      */
    var min: Double = js.native
    /**
      * override formatting pattern
      * with this string.  Default value is based on locale.  Overriding this property will defeat
      * localization.  Literal characters in patterns are not supported.
      * 
      */
    var pattern: String = js.native
    /**
      * fixed number of decimal places to show.  This overrides any
      * information in the provided pattern.
      * 
      */
    var places: Double = js.native
    /**
      * 5 rounds to nearest .5; 0 rounds to nearest whole (default). -1
      * means do not round.
      * 
      */
    var round: Double = js.native
    /**
      * strict parsing, false by default.  Strict parsing requires input as produced by the format() method.
      * Non-strict is more permissive, e.g. flexible on white space, omitting thousands separators
      * 
      */
    var strict: Boolean = js.native
    /**
      * choose a format type based on the locale from the following:
      * decimal, scientific (not yet supported), percent, currency. decimal by default.
      * 
      */
    var `type`: String = js.native
  }
  
}

