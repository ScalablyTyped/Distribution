package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Grid.EditingType.Boolean
import typings.ejDotWebDotAll.ej.Grid.EditingType.Dropdown
import typings.ejDotWebDotAll.ej.Grid.EditingType.Numeric
import typings.ejDotWebDotAll.ej.Grid.EditingType.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditingType extends js.Object

@JSGlobal("ej.Grid.EditingType")
@js.native
object EditingType extends js.Object {
  ///Specifies editing type as boolean edit.
  @js.native
  sealed trait Boolean extends EditingType
  
  ///Specifies editing type as datepicker.
  @js.native
  sealed trait DatePicker extends EditingType
  
  ///Specifies editing type as datetime picker.
  @js.native
  sealed trait DateTimePicker extends EditingType
  
  ///Specifies editing type as dropdown edit.
  @js.native
  sealed trait Dropdown extends EditingType
  
  ///Specifies editing type as numeric edit.
  @js.native
  sealed trait Numeric extends EditingType
  
  ///Specifies editing type as string edit.
  @js.native
  sealed trait String extends EditingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
  /* 1 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 4 */ @js.native
  object DatePicker
    extends TopLevel[typings.ejDotWebDotAll.ej.Grid.EditingType.DatePicker with Double]
  
  /* 5 */ @js.native
  object DateTimePicker
    extends TopLevel[typings.ejDotWebDotAll.ej.Grid.EditingType.DateTimePicker with Double]
  
  /* 3 */ @js.native
  object Dropdown extends TopLevel[Dropdown with Double]
  
  /* 2 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
}

