package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnLayout extends js.Object

@JSGlobal("ej.Grid.ColumnLayout")
@js.native
object ColumnLayout extends js.Object {
  ///Column layout is auto(based on width).
  @js.native
  sealed trait Auto extends ColumnLayout
  
  ///Column layout is fixed(based on width).
  @js.native
  sealed trait Fixed extends ColumnLayout
  
  /* 0 */ val Auto: typings.ejDotWebDotAll.ej.Grid.ColumnLayout.Auto with Double = js.native
  /* 1 */ val Fixed: typings.ejDotWebDotAll.ej.Grid.ColumnLayout.Fixed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnLayout with Double] = js.native
}

