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
  
  val Boolean: Boolean with java.lang.String = js.native
  val DatePicker: DatePicker with java.lang.String = js.native
  val DateTimePicker: DateTimePicker with java.lang.String = js.native
  val Dropdown: Dropdown with java.lang.String = js.native
  val Numeric: Numeric with java.lang.String = js.native
  val String: String with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.EditingType with java.lang.String] = js.native
}

