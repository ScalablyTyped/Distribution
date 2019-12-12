package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Gantt.RowPosition.AboveSelectedRow
import typings.ejDotWebDotAll.ej.Gantt.RowPosition.BelowSelectedRow
import typings.ejDotWebDotAll.ej.Gantt.RowPosition.Bottom
import typings.ejDotWebDotAll.ej.Gantt.RowPosition.Child
import typings.ejDotWebDotAll.ej.Gantt.RowPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Gantt.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait AboveSelectedRow extends RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait BelowSelectedRow extends RowPosition
  
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
  object AboveSelectedRow extends TopLevel[AboveSelectedRow with Double]
  
  /* 3 */ @js.native
  object BelowSelectedRow extends TopLevel[BelowSelectedRow with Double]
  
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 4 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

