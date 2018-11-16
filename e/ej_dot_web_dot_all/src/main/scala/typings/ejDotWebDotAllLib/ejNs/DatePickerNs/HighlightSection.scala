package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightSection extends js.Object

@JSGlobal("ej.DatePicker.HighlightSection")
@js.native
object HighlightSection extends js.Object {
  ///Nothing will be highlighted, remove highlights from DatePicker popup calendar if already exists
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.HighlightSection
  
  ///Highlight the week of the currently  selected date in DatePicker popup calendar
  @js.native
  sealed trait Week
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.HighlightSection
  
  ///Highlight the workdays in a currently  selected date's week in DatePicker popup calendar
  @js.native
  sealed trait WorkDays
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.HighlightSection
  
  val None: None with java.lang.String = js.native
  val Week: Week with java.lang.String = js.native
  val WorkDays: WorkDays with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.HighlightSection with java.lang.String] = js.native
}

