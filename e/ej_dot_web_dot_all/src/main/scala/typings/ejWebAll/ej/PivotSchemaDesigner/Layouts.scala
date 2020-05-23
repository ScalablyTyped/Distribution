package typings.ejWebAll.ej.PivotSchemaDesigner

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
  
}

