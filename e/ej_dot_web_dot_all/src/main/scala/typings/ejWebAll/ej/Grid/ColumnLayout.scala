package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnLayout with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Fixed extends TopLevel[Fixed with Double]
  
}

