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
  
  val LeftOrTop: LeftOrTop with java.lang.String = js.native
  val RightOrBottom: RightOrBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TickAlignment with java.lang.String
  ] = js.native
}

