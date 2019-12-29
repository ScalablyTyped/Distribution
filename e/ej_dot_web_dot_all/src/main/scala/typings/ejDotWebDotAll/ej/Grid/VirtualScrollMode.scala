package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualScrollMode extends js.Object

@JSGlobal("ej.Grid.VirtualScrollMode")
@js.native
object VirtualScrollMode extends js.Object {
  ///virtual scroll mode is continuous.
  @js.native
  sealed trait Continuous extends VirtualScrollMode
  
  ///virtual scroll mode is normal.
  @js.native
  sealed trait Normal extends VirtualScrollMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualScrollMode with Double] = js.native
  /* 1 */ @js.native
  object Continuous extends TopLevel[Continuous with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

