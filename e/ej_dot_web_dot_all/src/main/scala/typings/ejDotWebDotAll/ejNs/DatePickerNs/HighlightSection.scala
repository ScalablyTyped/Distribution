package typings.ejDotWebDotAll.ejNs.DatePickerNs

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
  sealed trait None extends HighlightSection
  
  ///Highlight the week of the currently  selected date in DatePicker popup calendar
  @js.native
  sealed trait Week extends HighlightSection
  
  ///Highlight the workdays in a currently  selected date's week in DatePicker popup calendar
  @js.native
  sealed trait WorkDays extends HighlightSection
  
  /* 2 */ val None: typings.ejDotWebDotAll.ejNs.DatePickerNs.HighlightSection.None with Double = js.native
  /* 0 */ val Week: typings.ejDotWebDotAll.ejNs.DatePickerNs.HighlightSection.Week with Double = js.native
  /* 1 */ val WorkDays: typings.ejDotWebDotAll.ejNs.DatePickerNs.HighlightSection.WorkDays with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighlightSection with Double] = js.native
}

