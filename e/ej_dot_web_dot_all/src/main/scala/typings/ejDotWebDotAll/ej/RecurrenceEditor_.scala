package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RecurrenceEditor")
@js.native
class RecurrenceEditor_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.RecurrenceEditor.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.RecurrenceEditor.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.RecurrenceEditor.Model = js.native
  @JSName("model")
  var model_RecurrenceEditor_ : typings.ejDotWebDotAll.ej.RecurrenceEditor.Model = js.native
  /** Generates the recurrence rule with the options selected within the Recurrence Editor.
    * @returns {string}
    */
  def getRecurrenceRule(): String = js.native
  /** Generates the collection of date, that lies within the selected recurrence start and end date for which the recurrence pattern applies.
    * @param {string} It refers the recurrence rule.
    * @param {any} It refers the start date of the recurrence.
    * @returns {any}
    */
  def recurrenceDateGenerator(recurrenceString: String, startDate: js.Any): js.Any = js.native
  /** It splits and returns the recurrence rule string into object collection.
    * @param {string} It refers the recurrence rule string.
    * @param {any} It refers the appointment dates (ExDate) to be excluded
    * @returns {any}
    */
  def recurrenceRuleSplit(recurrenceRule: String, exDate: js.Any): js.Any = js.native
}

