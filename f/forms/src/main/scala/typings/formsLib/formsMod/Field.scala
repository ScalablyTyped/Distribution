package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends FieldParameters {
  /** A widget object to use when rendering the field. */
  @JSName("widget")
  var widget_Field: Widget = js.native
  /** Returns a new bound field object. Calls parse on the data and stores in the bound field's data attribute, stores the raw value in the value attribute. */
  def bind(rawData: js.Any): FieldBound = js.native
  /** Returns an array of default CSS classes considering the field's attributes, e.g. ['field', 'required', 'error'] for a required field with an error message. */
  def classes(): js.Array[java.lang.String] = js.native
  /** Returns a string containing a HTML element containing the fields error message, or an empty string if there is no error associated with the field. */
  def errorHTML(): java.lang.String = js.native
  /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
  def labelHTML(name: java.lang.String): java.lang.String = js.native
  /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
  def labelHTML(name: java.lang.String, id: java.lang.String): java.lang.String = js.native
  /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
  def labelHTML(name: java.lang.String, id: scala.Boolean): java.lang.String = js.native
  /** Returns a string containing the label text from field.label, or defaults to using the field name with underscores replaced with spaces and the first letter capitalised. */
  def labelText(): java.lang.String = js.native
  /** Returns a string containing the label text from field.label, or defaults to using the field name with underscores replaced with spaces and the first letter capitalised. */
  def labelText(name: java.lang.String): java.lang.String = js.native
  /** Coerces the raw data from the request into the correct format for the field, returning the result, e.g. '123' becomes 123 for the number field. */
  def parse(rawData: js.Any): js.Any = js.native
  /**
       * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
       * which returns a HTML representation of the field label, error message and widget wrapped in a div.
       */
  def toHTML(): java.lang.String = js.native
  /**
       * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
       * which returns a HTML representation of the field label, error message and widget wrapped in a div.
       */
  def toHTML(name: java.lang.String): java.lang.String = js.native
  /**
       * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
       * which returns a HTML representation of the field label, error message and widget wrapped in a div.
       */
  def toHTML(name: java.lang.String, iterator: FieldIterator): java.lang.String = js.native
}

