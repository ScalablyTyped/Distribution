package typings.ejWebAll.ej.Tooltip

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloseMode extends js.Object

@JSGlobal("ej.Tooltip.CloseMode")
@js.native
object CloseMode extends js.Object {
  ///Sets the delay for Tooltip close
  @js.native
  sealed trait Auto extends CloseMode
  
  ///The Tooltip will be display normally.
  @js.native
  sealed trait None extends CloseMode
  
  ///Enables close button in Tooltip.
  @js.native
  sealed trait Sticky extends CloseMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseMode with Double] = js.native
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Sticky extends TopLevel[Sticky with Double]
  
}

