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
  
  val Boolean: Boolean with java.lang.String = js.native
  val DatePicker: DatePicker with java.lang.String = js.native
  val DateTimePicker: DateTimePicker with java.lang.String = js.native
  val Dropdown: Dropdown with java.lang.String = js.native
  val Maskedit: Maskedit with java.lang.String = js.native
  val Numeric: Numeric with java.lang.String = js.native
  val String: String with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.EditingType with java.lang.String] = js.native
}

