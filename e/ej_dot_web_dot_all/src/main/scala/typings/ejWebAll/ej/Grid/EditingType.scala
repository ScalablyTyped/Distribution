package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditingType extends js.Object
@JSGlobal("ej.Grid.EditingType")
@js.native
object EditingType extends js.Object {
  
  ///Specifies editing type as boolean edit.
  @js.native
  sealed trait Boolean extends EditingType
  
  ///Specifies editing type as datepicker.
  @js.native
  sealed trait DatePicker extends EditingType
  
  ///Specifies editing type as datetime picker.
  @js.native
  sealed trait DateTimePicker extends EditingType
  
  ///Specifies editing type as dropdown edit.
  @js.native
  sealed trait Dropdown extends EditingType
  
  ///Specifies editing type as numeric edit.
  @js.native
  sealed trait Numeric extends EditingType
  
  ///Specifies editing type as string edit.
  @js.native
  sealed trait String extends EditingType
}
