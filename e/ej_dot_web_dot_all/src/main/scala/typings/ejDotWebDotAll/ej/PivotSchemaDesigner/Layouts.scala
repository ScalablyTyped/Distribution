package typings.ejDotWebDotAll.ej.PivotSchemaDesigner

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Layouts with Double] = js.native
  /* 0 */ @js.native
  object Excel extends TopLevel[Excel with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 2 */ @js.native
  object OneByOne extends TopLevel[OneByOne with Double]
  
}

