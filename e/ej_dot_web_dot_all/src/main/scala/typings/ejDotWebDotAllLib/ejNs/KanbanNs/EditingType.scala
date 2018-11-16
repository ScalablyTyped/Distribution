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
  
  val DatePicker: DatePicker with java.lang.String = js.native
  val DateTimePicker: DateTimePicker with java.lang.String = js.native
  val Dropdown: Dropdown with java.lang.String = js.native
  val Numeric: Numeric with java.lang.String = js.native
  val RTE: RTE with java.lang.String = js.native
  val String: String with java.lang.String = js.native
  val TextArea: TextArea with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.EditingType with java.lang.String] = js.native
}

