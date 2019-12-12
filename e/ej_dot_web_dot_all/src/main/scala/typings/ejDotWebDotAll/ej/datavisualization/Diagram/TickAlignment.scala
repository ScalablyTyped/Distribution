package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TickAlignment.LeftOrTop
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TickAlignment.RightOrBottom
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickAlignment with Double] = js.native
  /* 0 */ @js.native
  object LeftOrTop extends TopLevel[LeftOrTop with Double]
  
  /* 1 */ @js.native
  object RightOrBottom extends TopLevel[RightOrBottom with Double]
  
}

