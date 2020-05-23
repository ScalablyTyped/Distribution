package typings.ejWebAll.ej.TreeGrid

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
  
}

