package typings.dojo.dijit.form.NumberTextBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.Mixin.html
  *
  * A mixin for all number textboxes
  * 
  */
@JSGlobal("dijit.form.NumberTextBox.Mixin")
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

