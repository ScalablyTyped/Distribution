package typings.ejDotWebDotAll.ej.Kanban

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Kanban.EditingType.Dropdown
import typings.ejDotWebDotAll.ej.Kanban.EditingType.Numeric
import typings.ejDotWebDotAll.ej.Kanban.EditingType.String
import typings.ejDotWebDotAll.ej.Kanban.EditingType.TextArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditingType extends js.Object

@JSGlobal("ej.Kanban.EditingType")
@js.native
object EditingType extends js.Object {
  ///Allows to set edit type as date picker edit type
  @js.native
  sealed trait DatePicker extends EditingType
  
  ///Allows to set edit type as date time picker edit type
  @js.native
  sealed trait DateTimePicker extends EditingType
  
  ///Allows to set edit type as drop down edit type
  @js.native
  sealed trait Dropdown extends EditingType
  
  ///Allows to set edit type as numeric edit type
  @js.native
  sealed trait Numeric extends EditingType
  
  ///Allows to set edit type as RTE edit type
  @js.native
  sealed trait RTE extends EditingType
  
  ///Allows to set edit type as string edit type
  @js.native
  sealed trait String extends EditingType
  
  ///Allows to set edit type as text area edit type
  @js.native
  sealed trait TextArea extends EditingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
  /* 3 */ @js.native
  object DatePicker
    extends TopLevel[typings.ejDotWebDotAll.ej.Kanban.EditingType.DatePicker with Double]
  
  /* 4 */ @js.native
  object DateTimePicker
    extends TopLevel[typings.ejDotWebDotAll.ej.Kanban.EditingType.DateTimePicker with Double]
  
  /* 2 */ @js.native
  object Dropdown extends TopLevel[Dropdown with Double]
  
  /* 1 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  /* 6 */ @js.native
  object RTE
    extends TopLevel[typings.ejDotWebDotAll.ej.Kanban.EditingType.RTE with Double]
  
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
  /* 5 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
}

