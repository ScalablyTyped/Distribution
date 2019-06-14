package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

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
  sealed trait DatePicker
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as date time picker edit type
  @js.native
  sealed trait DateTimePicker
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as drop down edit type
  @js.native
  sealed trait Dropdown
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as numeric edit type
  @js.native
  sealed trait Numeric
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as RTE edit type
  @js.native
  sealed trait RTE
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as string edit type
  @js.native
  sealed trait String
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  ///Allows to set edit type as text area edit type
  @js.native
  sealed trait TextArea
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditingType
  
  /* 3 */ val DatePicker: DatePicker with scala.Double = js.native
  /* 4 */ val DateTimePicker: DateTimePicker with scala.Double = js.native
  /* 2 */ val Dropdown: Dropdown with scala.Double = js.native
  /* 1 */ val Numeric: Numeric with scala.Double = js.native
  /* 6 */ val RTE: RTE with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  /* 5 */ val TextArea: TextArea with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.EditingType with scala.Double] = js.native
}

