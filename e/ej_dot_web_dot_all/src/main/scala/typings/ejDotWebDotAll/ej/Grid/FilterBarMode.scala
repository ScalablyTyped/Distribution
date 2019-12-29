package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterBarMode extends js.Object

@JSGlobal("ej.Grid.FilterBarMode")
@js.native
object FilterBarMode extends js.Object {
  ///Initiate filter operation on typing the filter query.
  @js.native
  sealed trait Immediate extends FilterBarMode
  
  ///Initiate filter operation after Enter key is pressed.
  @js.native
  sealed trait OnEnter extends FilterBarMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterBarMode with Double] = js.native
  /* 0 */ @js.native
  object Immediate extends TopLevel[Immediate with Double]
  
  /* 1 */ @js.native
  object OnEnter extends TopLevel[OnEnter with Double]
  
}

