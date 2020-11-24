package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
