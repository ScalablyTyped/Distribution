package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditingType extends js.Object

@JSGlobal("ej.TreeGrid.EditingType")
@js.native
object EditingType extends js.Object {
  ///It Specifies Boolean edit type.
  @js.native
  sealed trait Boolean
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies DatePicker edit type.
  @js.native
  sealed trait DatePicker
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies DateTimePicker edit type.
  @js.native
  sealed trait DateTimePicker
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies Dropdown edit type.
  @js.native
  sealed trait Dropdown
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies Maskedit edit type.
  @js.native
  sealed trait Maskedit
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies Numeric edit type.
  @js.native
  sealed trait Numeric
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  ///It Specifies String edit type.
  @js.native
  sealed trait String
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType
  
  /* 1 */ val Boolean: Boolean with scala.Double = js.native
  /* 4 */ val DatePicker: DatePicker with scala.Double = js.native
  /* 5 */ val DateTimePicker: DateTimePicker with scala.Double = js.native
  /* 3 */ val Dropdown: Dropdown with scala.Double = js.native
  /* 6 */ val Maskedit: Maskedit with scala.Double = js.native
  /* 2 */ val Numeric: Numeric with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType with scala.Double] = js.native
}

