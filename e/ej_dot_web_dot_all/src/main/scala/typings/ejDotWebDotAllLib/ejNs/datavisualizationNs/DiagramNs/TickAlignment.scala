package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TickAlignment")
@js.native
object TickAlignment extends js.Object {
  //Align the ruler scale either left or top position of the ruler.
  @js.native
  sealed trait LeftOrTop
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TickAlignment
  
  //Align the ruler scale either right or bottom position of the ruler.
  @js.native
  sealed trait RightOrBottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TickAlignment
  
  /* 0 */ val LeftOrTop: LeftOrTop with scala.Double = js.native
  /* 1 */ val RightOrBottom: RightOrBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TickAlignment with scala.Double
  ] = js.native
}

