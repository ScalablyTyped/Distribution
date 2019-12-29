package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
  /* 1 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 4 */ @js.native
  object DatePicker extends TopLevel[DatePicker with Double]
  
  /* 5 */ @js.native
  object DateTimePicker extends TopLevel[DateTimePicker with Double]
  
  /* 3 */ @js.native
  object Dropdown extends TopLevel[Dropdown with Double]
  
  /* 6 */ @js.native
  object Maskedit extends TopLevel[Maskedit with Double]
  
  /* 2 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
}

