package typings.ejDotWebDotAll.ej.PivotClient

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlPlacement extends js.Object

@JSGlobal("ej.PivotClient.ControlPlacement")
@js.native
object ControlPlacement extends js.Object {
  ///Displays PivotChart and PivotGrid widgets in separate tabs.
  @js.native
  sealed trait Tab extends ControlPlacement
  
  ///Displays PivotChart and PivotGrid widgets one above the other.
  @js.native
  sealed trait Tile extends ControlPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlPlacement with Double] = js.native
  /* 0 */ @js.native
  object Tab extends TopLevel[Tab with Double]
  
  /* 1 */ @js.native
  object Tile extends TopLevel[Tile with Double]
  
}

