package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait LeftOrTop extends TickAlignment
  
  //Align the ruler scale either right or bottom position of the ruler.
  @js.native
  sealed trait RightOrBottom extends TickAlignment
  
  /* 0 */ val LeftOrTop: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TickAlignment.LeftOrTop with Double = js.native
  /* 1 */ val RightOrBottom: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TickAlignment.RightOrBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickAlignment with Double] = js.native
}

