package typings.forms.formsMod

import typings.forms.Anon_Body
import typings.forms.Anon_Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  /** Field objects this form was created with */
  var fields: FormFields = js.native
  /** Binds data to correct fields, returning a new bound form object. */
  def bind(data: js.Any): FormBound = js.native
  /** Inspects a request or object literal and binds any data to the correct fields. */
  def handle(req: Anon_Body, callbacks: Anon_Empty): Unit = js.native
  /**
    * Runs toHTML on each field returning the result.
    * If an iterator is specified, it is called for each field with the field name and object as it's arguments,
    * the iterator's results are concatenated to create the HTML output, allowing for highly customised markup.
    */
  def toHTML(): String = js.native
  def toHTML(iterator: FieldIterator): String = js.native
}

