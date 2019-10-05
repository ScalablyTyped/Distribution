package typings.ejDotWebDotAll.ej.datavisualization.Map

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
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Bottom with Double = js.native
  /* 3 */ val Left: typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Left with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Right with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DockPosition with Double] = js.native
}

