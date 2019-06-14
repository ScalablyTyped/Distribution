package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayoutOrientations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LayoutOrientations")
@js.native
object LayoutOrientations extends js.Object {
  //Used to set LayoutOrientation from bottom to top
  @js.native
  sealed trait BottomToTop
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations
  
  //Used to set LayoutOrientation from left to right
  @js.native
  sealed trait LeftToRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations
  
  //Used to set LayoutOrientation from right to left
  @js.native
  sealed trait RightToLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations
  
  //Used to set LayoutOrientation from top to bottom
  @js.native
  sealed trait TopToBottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations
  
  /* 1 */ val BottomToTop: BottomToTop with scala.Double = js.native
  /* 2 */ val LeftToRight: LeftToRight with scala.Double = js.native
  /* 3 */ val RightToLeft: RightToLeft with scala.Double = js.native
  /* 0 */ val TopToBottom: TopToBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations with scala.Double
  ] = js.native
}

