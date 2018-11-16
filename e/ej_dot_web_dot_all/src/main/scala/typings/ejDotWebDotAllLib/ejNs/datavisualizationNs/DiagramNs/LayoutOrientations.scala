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
  
  val BottomToTop: BottomToTop with java.lang.String = js.native
  val LeftToRight: LeftToRight with java.lang.String = js.native
  val RightToLeft: RightToLeft with java.lang.String = js.native
  val TopToBottom: TopToBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutOrientations with java.lang.String
  ] = js.native
}

