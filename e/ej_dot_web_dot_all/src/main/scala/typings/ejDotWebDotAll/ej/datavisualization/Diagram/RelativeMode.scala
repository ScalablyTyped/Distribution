package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.RelativeMode.Mouse
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.RelativeMode.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.RelativeMode")
@js.native
object RelativeMode extends js.Object {
  //Shows tooltip at the mouse position
  @js.native
  sealed trait Mouse extends RelativeMode
  
  //Shows tooltip around the node
  @js.native
  sealed trait Object extends RelativeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeMode with Double] = js.native
  /* 1 */ @js.native
  object Mouse extends TopLevel[Mouse with Double]
  
  /* 0 */ @js.native
  object Object extends TopLevel[Object with Double]
  
}

