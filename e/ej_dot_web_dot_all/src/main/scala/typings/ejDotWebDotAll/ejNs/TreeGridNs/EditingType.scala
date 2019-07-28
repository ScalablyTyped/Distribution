package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
  sealed trait Boolean extends EditingType
  
  ///It Specifies DatePicker edit type.
  @js.native
  sealed trait DatePicker extends EditingType
  
  ///It Specifies DateTimePicker edit type.
  @js.native
  sealed trait DateTimePicker extends EditingType
  
  ///It Specifies Dropdown edit type.
  @js.native
  sealed trait Dropdown extends EditingType
  
  ///It Specifies Maskedit edit type.
  @js.native
  sealed trait Maskedit extends EditingType
  
  ///It Specifies Numeric edit type.
  @js.native
  sealed trait Numeric extends EditingType
  
  ///It Specifies String edit type.
  @js.native
  sealed trait String extends EditingType
  
  /* 1 */ val Boolean: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.Boolean with Double = js.native
  /* 4 */ val DatePicker: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.DatePicker with Double = js.native
  /* 5 */ val DateTimePicker: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.DateTimePicker with Double = js.native
  /* 3 */ val Dropdown: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.Dropdown with Double = js.native
  /* 6 */ val Maskedit: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.Maskedit with Double = js.native
  /* 2 */ val Numeric: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.Numeric with Double = js.native
  /* 0 */ val String: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditingType.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
}

