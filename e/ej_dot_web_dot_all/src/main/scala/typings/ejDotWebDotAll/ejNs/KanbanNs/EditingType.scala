package typings.ejDotWebDotAll.ejNs.KanbanNs

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
  
  /* 3 */ val DatePicker: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.DatePicker with Double = js.native
  /* 4 */ val DateTimePicker: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.DateTimePicker with Double = js.native
  /* 2 */ val Dropdown: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.Dropdown with Double = js.native
  /* 1 */ val Numeric: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.Numeric with Double = js.native
  /* 6 */ val RTE: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.RTE with Double = js.native
  /* 0 */ val String: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.String with Double = js.native
  /* 5 */ val TextArea: typings.ejDotWebDotAll.ejNs.KanbanNs.EditingType.TextArea with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
}

