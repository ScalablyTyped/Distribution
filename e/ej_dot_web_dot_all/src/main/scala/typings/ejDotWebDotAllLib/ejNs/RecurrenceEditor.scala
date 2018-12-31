package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RecurrenceEditor")
@js.native
class RecurrenceEditor protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RecurrenceEditorNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RecurrenceEditorNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RecurrenceEditorNs.Model = js.native
  @JSName("model")
  var model_RecurrenceEditor: ejDotWebDotAllLib.ejNs.RecurrenceEditorNs.Model = js.native
  /** Generates the recurrence rule with the options selected within the Recurrence Editor.
    * @returns {string}
    */
  def getRecurrenceRule(): java.lang.String = js.native
  /** Generates the collection of date, that lies within the selected recurrence start and end date for which the recurrence pattern applies.
    * @param {string} It refers the recurrence rule.
    * @param {any} It refers the start date of the recurrence.
    * @returns {any}
    */
  def recurrenceDateGenerator(recurrenceString: java.lang.String, startDate: js.Any): js.Any = js.native
  /** It splits and returns the recurrence rule string into object collection.
    * @param {string} It refers the recurrence rule string.
    * @param {any} It refers the appointment dates (ExDate) to be excluded
    * @returns {any}
    */
  def recurrenceRuleSplit(recurrenceRule: java.lang.String, exDate: js.Any): js.Any = js.native
}

@JSGlobal("ej.RecurrenceEditor")
@js.native
object RecurrenceEditor extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.RecurrenceEditor = js.native
}

