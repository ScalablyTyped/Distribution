package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Grid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///Specifies position of add new row as bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///Specifies position of add new row as top.
  @js.native
  sealed trait Top extends RowPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

