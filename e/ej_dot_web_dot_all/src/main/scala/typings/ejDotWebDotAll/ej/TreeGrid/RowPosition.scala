package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.RowPosition.Above
import typings.ejDotWebDotAll.ej.TreeGrid.RowPosition.Below
import typings.ejDotWebDotAll.ej.TreeGrid.RowPosition.Bottom
import typings.ejDotWebDotAll.ej.TreeGrid.RowPosition.Child
import typings.ejDotWebDotAll.ej.TreeGrid.RowPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.TreeGrid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait Above extends RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait Below extends RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child extends RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top extends RowPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
  /* 2 */ @js.native
  object Above extends TopLevel[Above with Double]
  
  /* 3 */ @js.native
  object Below extends TopLevel[Below with Double]
  
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 4 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

