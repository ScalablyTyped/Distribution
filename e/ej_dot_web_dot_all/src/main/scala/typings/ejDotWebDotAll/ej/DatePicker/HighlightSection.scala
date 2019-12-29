package typings.ejDotWebDotAll.ej.DatePicker

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighlightSection with Double] = js.native
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 1 */ @js.native
  object WorkDays extends TopLevel[WorkDays with Double]
  
}

