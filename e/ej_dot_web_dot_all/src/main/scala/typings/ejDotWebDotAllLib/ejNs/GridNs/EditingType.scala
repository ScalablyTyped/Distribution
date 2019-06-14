package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Boolean
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  ///Specifies editing type as datepicker.
  @js.native
  sealed trait DatePicker
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  ///Specifies editing type as datetime picker.
  @js.native
  sealed trait DateTimePicker
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  ///Specifies editing type as dropdown edit.
  @js.native
  sealed trait Dropdown
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  ///Specifies editing type as numeric edit.
  @js.native
  sealed trait Numeric
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  ///Specifies editing type as string edit.
  @js.native
  sealed trait String
    extends ejDotWebDotAllLib.ejNs.GridNs.EditingType
  
  /* 1 */ val Boolean: Boolean with scala.Double = js.native
  /* 4 */ val DatePicker: DatePicker with scala.Double = js.native
  /* 5 */ val DateTimePicker: DateTimePicker with scala.Double = js.native
  /* 3 */ val Dropdown: Dropdown with scala.Double = js.native
  /* 2 */ val Numeric: Numeric with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.EditingType with scala.Double] = js.native
}

