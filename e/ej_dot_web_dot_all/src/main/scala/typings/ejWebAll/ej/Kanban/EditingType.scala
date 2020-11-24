package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
