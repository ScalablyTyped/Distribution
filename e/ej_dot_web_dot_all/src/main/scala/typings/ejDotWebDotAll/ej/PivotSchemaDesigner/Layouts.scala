package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Layouts extends js.Object

@JSGlobal("ej.PivotSchemaDesigner.Layouts")
@js.native
object Layouts extends js.Object {
  ///To set the layout as same in the Excel.
  @js.native
  sealed trait Excel extends Layouts
  
  ///To set normal layout for Field List.
  @js.native
  sealed trait Normal extends Layouts
  
  ///To set layout with the axes one above the other.
  @js.native
  sealed trait OneByOne extends Layouts
  
  /* 0 */ val Excel: typings.ejDotWebDotAll.ej.PivotSchemaDesigner.Layouts.Excel with Double = js.native
  /* 1 */ val Normal: typings.ejDotWebDotAll.ej.PivotSchemaDesigner.Layouts.Normal with Double = js.native
  /* 2 */ val OneByOne: typings.ejDotWebDotAll.ej.PivotSchemaDesigner.Layouts.OneByOne with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Layouts with Double] = js.native
}

