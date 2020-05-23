package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DockPosition extends js.Object

@JSGlobal("ej.datavisualization.Map.DockPosition")
@js.native
object DockPosition extends js.Object {
  //specifies the bottom position
  @js.native
  sealed trait Bottom extends DockPosition
  
  //specifies the left position
  @js.native
  sealed trait Left extends DockPosition
  
  //specifies the bottom position
  @js.native
  sealed trait Right extends DockPosition
  
  //specifies the top position
  @js.native
  sealed trait Top extends DockPosition
  
}

